package com.tnsif.daytwentythree.usingpreparedstatement;

import java.sql.SQLException;
import java.util.List;

public interface IDBService {
	public void addStudent(Student s) throws SQLException;

	public void deleteStudentByRollNo(int rno) throws SQLException;

	public void updateStudent(int rno, Student st)throws SQLException;

	public List<Student> getAllStudents() throws SQLException;

	public Student getStudentByRollNo(int rno) throws SQLException;

}
