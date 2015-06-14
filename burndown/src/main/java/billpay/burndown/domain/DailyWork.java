package billpay.burndown.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="daily_work")
public class DailyWork {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="daily_work_id")
	private Long id;
	
	@NotNull(message="Remaining may not be blank")
	private BigDecimal remaining;
	
	private BigDecimal estimated;
	
	@Column(name="work_done")
	private BigDecimal workDone;
	
	private BigDecimal found;
	
	@NotNull(message="Day may not be blank")
	private Integer day;
	
	@ManyToOne
	@Valid
	private Burndown burndown;
	
	@Column(name="create_date")
	private Date createDate;
	
	@OneToMany(mappedBy="dailyWork")
	@Column(name="item_id")
	private Set<Item> items;
	
	public DailyWork(){
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Set<Item> getItems() {
		return items;
	}

	public void setItems(Set<Item> items) {
		this.items = items;
	}

	public BigDecimal getRemaining() {
		return remaining;
	}

	public void setRemaining(BigDecimal remaining) {
		this.remaining = remaining;
	}

	public Burndown getBurndown() {
		return burndown;
	}

	public void setBurndown(Burndown burndown) {
		this.burndown = burndown;
	}

	public BigDecimal getEstimated() {
		return estimated;
	}

	public void setEstimated(BigDecimal estimated) {
		this.estimated = estimated;
	}

	public BigDecimal getWorkDone() {
		return workDone;
	}

	public void setWorkDone(BigDecimal workDone) {
		this.workDone = workDone;
	}

	public BigDecimal getFound() {
		return found;
	}

	public void setFound(BigDecimal found) {
		this.found = found;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}
	

}
