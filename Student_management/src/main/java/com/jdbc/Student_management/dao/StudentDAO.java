package com.jdbc.Student_management.dao;

import com.jdbc.Student_management.entity.Address;
import com.jdbc.Student_management.entity.Student;

public interface StudentDAO {
	
	
	Student getStudent(int id);

	public void deleteStudent(int id);

	public void insertStudent(int id, String name, String contact, Address address);

	public void updateStudent(int id, String name, String contact, Address address);

	public void closeSession();
}
