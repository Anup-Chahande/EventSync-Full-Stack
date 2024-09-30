package event_management_project.Event_Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Event_entity {
	@Id
	private int id;
	private String name;
	private String date;
	private String loaction;
	private String description;

	
	public Event_entity() {
		super();
	}


	public Event_entity(int id, String name, String date, String loaction, String description) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.loaction = loaction;
		this.description = description;
	}


	@Override
	public String toString() {
		return "Event_entity [id=" + id + ", name=" + name + ", date=" + date + ", loaction=" + loaction
				+ ", description=" + description + "]";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getLoaction() {
		return loaction;
	}


	public void setLoaction(String loaction) {
		this.loaction = loaction;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public Event_entity(String name, String date, String loaction, String description) {
		super();
		this.name = name;
		this.date = date;
		this.loaction = loaction;
		this.description = description;
	}




}


