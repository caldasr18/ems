package billpay.burndown.domain;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="burndown")
public class Burndown {

	@Column(name="update_date")
	private Date updateDate;
	
	@Id
	@NotNull
	@NotEmpty
	@Column(name="sprint")
	private String sprint;
	
	@Column(name="active")
	private Boolean active;
	
	@NotNull
	@NotEmpty
	@Column(name="current_sprint_day")
	private String currentSprintDay = "0";
	
	@OneToMany(cascade = {CascadeType.ALL},mappedBy="burndown",fetch=FetchType.EAGER)
	@OrderBy(value="day ASC")
	private Set<DailyWork> dailyWorks;

	public Burndown(){
		
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Set<DailyWork> getDailyWorks() {
		return dailyWorks;
	}

	public void setDailyWorks(Set<DailyWork> dailyWorks) {
		this.dailyWorks = dailyWorks;
	}

	public String getSprint() {
		return sprint;
	}

	public void setSprint(String sprint) {
		this.sprint = sprint;
	}

	public String getCurrentSprintDay() {
		return currentSprintDay;
	}

	public void setCurrentSprintDay(String currentSprintDay) {
		this.currentSprintDay = currentSprintDay;
	}

}
