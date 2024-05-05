package be.iccbxl.pid.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UuserService {
	@Autowired
	private UuserRepository repository;
	
	public List<Uuser> getAllUsers() {
		List<Uuser> users = new ArrayList<>();
		
		repository.findAll().forEach(users::add);
		
		return users;
	}
	
	public Uuser getUser(String id) {
		int indice = Integer.parseInt(id);
		
		return repository.findById(indice);
	}

	public void addUser(Uuser user) {
		repository.save(user);
	}

	public void updateUser(String id, Uuser user) {
		repository.save(user);
	}

	public void deleteUser(String id) {
		Long indice = (long) Integer.parseInt(id);
		
		repository.deleteById(indice);
	}
}
