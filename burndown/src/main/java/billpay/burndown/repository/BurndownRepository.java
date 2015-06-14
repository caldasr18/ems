package billpay.burndown.repository;

import org.springframework.data.repository.CrudRepository;

import billpay.burndown.domain.Burndown;

public interface BurndownRepository extends CrudRepository<Burndown, String> {

}