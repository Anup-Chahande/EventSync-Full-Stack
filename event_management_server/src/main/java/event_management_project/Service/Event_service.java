package event_management_project.Service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import event_management_project.Dao.Event_dao;
import event_management_project.Event_Entity.Event_entity;

@Service
public class Event_service {
	@Autowired
	Event_dao ed;

	public List<Event_entity> getallevents() {

		return ed.getallevents();
	}

	public Event_entity geteventbyid(int eid) {

		List<Event_entity> alldata = ed.geteventbyid(eid);
		for (Event_entity finddata : alldata) {

			if (finddata.getId() == eid) {

				return finddata;
			}

		}

		return null;
	}

public Event_entity addevents(Event_entity eventdata) {
		
		return ed.addevents(eventdata);
		
	}

public Event_entity updatevents(Event_entity eventdata) {
	return ed.updatevents(eventdata);
}

public void deleteevent(int id) {
	 
	
	ed.deleteevent(id);
}





}