package be.iccbxl.pid.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UuserRepository extends CrudRepository<Uuser, Long> {
	List<Uuser> findByLastname(String lastname);

	Uuser findById(long id);
	Uuser findByLogin(String login);
	Uuser findByEmail(String email);
}
