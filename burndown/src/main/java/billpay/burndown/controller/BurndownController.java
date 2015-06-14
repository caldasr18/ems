package billpay.burndown.controller;
import java.math.BigDecimal;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;

import billpay.burndown.domain.Burndown;
import billpay.burndown.domain.DailyWork;
import billpay.burndown.exception.BurndownGenException;
import billpay.burndown.service.BurndownGenService;
import billpay.burndown.util.BurndownDimension;

/**
* @author Ricardo Gomes Rodrigues
*/
@Controller
@SessionAttributes("dailyNew")
public class BurndownController {

    protected static final String ITEMS_LIST_VIEW = "itemsList";
    protected static final String MAXIMIZED_DASHBOARD_VIEW = "maximizedDashboard";
    protected static final String CURRENT_SPRINT = "86";
    protected static final BigDecimal NR_DAYS_OF_SPRINT = BigDecimal.TEN;
    
    private static final String SPRINT_JIRA_FILTER_URL = "http://localhost:7070/burndown/static/SearchRequest-08.xml";
     
    
    @Autowired
    BurndownGenService service; 
    
    private ModelAndView showDaily(String view, ModelMap model){
        DailyWork daily = null;

        Burndown burndown = null;
    	try {
    		burndown = (Burndown)model.get("currentBurndown");
    		Integer currentDay = (burndown != null ? Integer.valueOf(burndown.getCurrentSprintDay()) : 2);
    		
    		daily = service.getBurndownDailyData(SPRINT_JIRA_FILTER_URL);
    		
    		model.addAttribute("currentBurndown",service.adjustDailyWorkRemainingByEstimated(daily,burndown));
    	} catch (BurndownGenException e) {
			e.printStackTrace();
		}

    	daily.setBurndown(burndown);
    	model.addAttribute("dailyNew",daily);
    	
    	return new ModelAndView(view, model);    	
    }
 
    @RequestMapping(value="/",method=RequestMethod.GET)
    public ModelAndView showInitPage(String view, ModelMap model){
    	Burndown currentBurndown = new Burndown();
    	String currentSprint = CURRENT_SPRINT;

    	DailyWork daily = (DailyWork) model.get("dailyNew");
    	if(daily != null){
    		currentSprint = daily.getBurndown().getSprint();
    	}   	
    	
		try {
			currentBurndown = service.getBurndownBySprint(currentSprint);
		} catch (BurndownGenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	model.addAttribute("currentBurndown", currentBurndown);
    	model.addAttribute("dimension", BurndownDimension.minimize());
    	
    	return showDaily(ITEMS_LIST_VIEW, model);    	
    }
    
	@RequestMapping(value="/",method=RequestMethod.POST)
	public ModelAndView onSubmit(@ModelAttribute("dailyNew") @Valid DailyWork dailyNew, BindingResult result, SessionStatus status) {
		ModelMap model = new ModelMap();
		Burndown chart = null;
		
		try {
			if (!result.hasErrors()) {
				chart = service.saveBurndownBySprint(dailyNew);
			}
		} catch (BurndownGenException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
    	model.addAttribute("currentBurndown", chart);
    	model.addAttribute("dailyNew",dailyNew);
    	model.addAttribute("dimension", BurndownDimension.minimize());
    	
    	return new ModelAndView(ITEMS_LIST_VIEW, model); 
	}
}