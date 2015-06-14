package billpay.burndown.repository;

import org.springframework.data.repository.CrudRepository;

import billpay.burndown.domain.DailyWork;

public interface DailyWorkRepository extends CrudRepository<DailyWork, Long> {

	DailyWork findOneByDay(Integer sprintDay);

}