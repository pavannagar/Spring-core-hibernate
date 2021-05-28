package com.dhakad;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

public class StudentDaoImpl implements StudentDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void save(Student student) {
		System.out.println("inside dao save");
		Session s=sf.openSession();
		System.out.println(s);
		Transaction tr=s.beginTransaction();
		s.save(student);
	    tr.commit();
		s.close();
		
	}

	@Override
	public Student search(int sid) {
		
		Session s=sf.openSession();
		Student student=s.get(Student.class, sid);
		s.close();
		return student;
	}

	public SessionFactory getSf() {
		return sf;
	}

	public void setSf(SessionFactory sf) {
		this.sf = sf;
	}

}
