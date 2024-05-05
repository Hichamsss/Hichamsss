package be.iccbxl.pid.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="representations")
public class Representation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name="show_id", nullable=false)
	private Show show;

	/**
	 * Date de création de la représentation
	 */
	private LocalDateTime when;
	
	/**
	 * Lieu de prestation de la représentation
	 */
	@ManyToOne
	@JoinColumn(name="location_id", nullable=true)
	private Location location;
	
	@ManyToMany
	@JoinTable(
		  name = "reservation", 
		  joinColumns = @JoinColumn(name = "representation_id"), 
		  inverseJoinColumns = @JoinColumn(name = "user_id"))
<<<<<<< HEAD
	private List<Uuser> users = new ArrayList<>();
=======
	private List<User> users = new ArrayList<>();
>>>>>>> a469554470ea18d7916a0d71a3c3b69235b9ed36

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Show getShow() {
		return show;
	}

	public void setShow(Show show) {
		this.show = show;
	}

	public LocalDateTime getWhen() {
		return when;
	}

	public void setWhen(LocalDateTime when) {
		this.when = when;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

<<<<<<< HEAD
	public void setUsers(List<Uuser> users) {
=======
	public void setUsers(List<User> users) {
>>>>>>> a469554470ea18d7916a0d71a3c3b69235b9ed36
		this.users = users;
	}

	public Representation() { }
	
	//…
	
<<<<<<< HEAD
	public List<Uuser> getUsers() {
		return users;
	}

	public Representation addUser(Uuser user) {
=======
	public List<User> getUsers() {
		return users;
	}

	public Representation addUser(User user) {
>>>>>>> a469554470ea18d7916a0d71a3c3b69235b9ed36
		if(!this.users.contains(user)) {
			this.users.add(user);
			user.addRepresentation(this);
		}
		
		return this;
	}
	
<<<<<<< HEAD
	public Representation removeUser(Uuser user) {
=======
	public Representation removeUser(User user) {
>>>>>>> a469554470ea18d7916a0d71a3c3b69235b9ed36
		if(this.users.contains(user)) {
			this.users.remove(user);
			user.getRepresentations().remove(this);
		}
		
		return this;
	}

	@Override
	public String toString() {
		return "Representation [id=" + id + ", show=" + show + ", when=" + when 
				+ ", location=" + location + "]";
	}
	
}

