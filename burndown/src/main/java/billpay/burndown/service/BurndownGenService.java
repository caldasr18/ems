package billpay.burndown.service;

import java.util.List;

import billpay.burndown.domain.Burndown;
import billpay.burndown.domain.DailyWork;
import billpay.burndown.exception.BurndownGenException;
import billpay.burndown.util.BurndownInputContent;

public interface BurndownGenService {
	public DailyWork getBurndownDailyData(String sprintUrl) throws BurndownGenException;
	public List<BurndownInputContent> generate() throws BurndownGenException;
	public Burndown saveBurndownBySprint(DailyWork dailyNew) throws BurndownGenException;
	public Burndown getBurndownBySprint(String currentSprint) throws BurndownGenException;
	public DailyWork getDailyWorkByDay(Integer day) throws BurndownGenException;
	public Burndown adjustDailyWorkRemainingByEstimated(DailyWork daily, Burndown burndown) throws BurndownGenException;
}
