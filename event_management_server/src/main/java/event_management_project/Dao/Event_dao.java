package event_management_project.Dao;

import java.util.List;


import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;


import event_management_project.Event_Entity.Event_entity;

@Repository
public class Event_dao {
	@Autowired
	SessionFactory sf;

	public List<Event_entity> getallevents() {
		List<Event_entity> alldata =null; 
		try(Session s = sf.openSession()){
		Criteria c = s.createCriteria(Event_entity.class);
		 alldata = c.list();

	}
	catch(Exception e) {
		
	}
	return alldata;

	}

	public List<Event_entity> geteventbyid(int eid) {
		List<Event_entity> alldata =null; 

		try(Session s = sf.openSession()){
		Criteria c = s.createCriteria(Event_entity.class);
		 alldata = c.list();

		}
		catch(Exception e) {
			
		}
		return alldata;

	}
	

	public Event_entity addevents(Event_entity eventdata) {

		try(Session s = sf.openSession()){
		s.save(eventdata);
		Transaction t = s.beginTransaction();
		t.commit();
		}
catch(Exception e) {
			
		}
		
		return null;

	}

	public Event_entity updatevents(Event_entity eventdata) {
		System.err.println(eventdata);
		try(Session s = sf.openSession()){
		s.update(eventdata);
		Transaction t = s.beginTransaction();
		t.commit();
		}
catch(Exception e) {
			
		}
		return null;
	
	}
	

	public void deleteevent(int id) {
		try(Session s = sf.openSession()){
		Criteria c = s.createCriteria(Event_entity.class);
		List<Event_entity> alldata = c.list();
   
		for (Event_entity allevents : alldata) {
			Event_entity en = new Event_entity(id,allevents.getDate(),allevents.getDescription(),allevents.getLoaction(),allevents.getName());
			en = (Event_entity) s.merge(en);

			s.delete(en);
			Transaction t = s.beginTransaction();
			t.commit();
			
			
			
		}
		
		
		
		
	
		}
catch(Exception e) {
			
		}
		}

	

	

}
