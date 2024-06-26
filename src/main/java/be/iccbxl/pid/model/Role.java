package be.iccbxl.pid.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="roles")
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String role;
	
	@ManyToMany
	@JoinTable(
		  name = "user_role", 
		  joinColumns = @JoinColumn(name = "role_id"), 
		  inverseJoinColumns = @JoinColumn(name = "user_id"))
<<<<<<< HEAD
	private List<Uuser> users = new ArrayList<>();
=======
	private List<User> users = new ArrayList<>();
>>>>>>> a469554470ea18d7916a0d71a3c3b69235b9ed36
	
	protected Role() { }
	
	public Role(String role) {
		this.role = role;
	}

	public Long getId() {
		return id;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

<<<<<<< HEAD
	public List<Uuser> getUsers() {
		return users;
	}

	public Role addUser(Uuser user) {
=======
	public List<User> getUsers() {
		return users;
	}

	public Role addUser(User user) {
>>>>>>> a469554470ea18d7916a0d71a3c3b69235b9ed36
		if(!this.users.contains(user)) {
			this.users.add(user);
			user.addRole(this);
		}
		
		return this;
	}
	
<<<<<<< HEAD
	public Role removeUser(Uuser user) {
=======
	public Role removeUser(User user) {
>>>>>>> a469554470ea18d7916a0d71a3c3b69235b9ed36
		if(this.users.contains(user)) {
			this.users.remove(user);
			user.getRoles().remove(this);
		}
		
		return this;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + "]";
	}
	
}
