package com.dhakad;

public interface StudentDao {
	
	public void save(Student student);
	public Student search(int sid);
}
