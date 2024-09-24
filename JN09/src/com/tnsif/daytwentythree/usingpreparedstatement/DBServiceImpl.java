package com.tnsif.daytwentythree.usingpreparedstatement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBServiceImpl implements IDBService {
	PreparedStatement pst;
	Connection cn;

	public DBServiceImpl() {
		cn = DBUtil.getConnection();
	}

	@Override
	public void addStudent(Student s) throws SQLException {
		pst = cn.prepareStatement("INSERT INTO student VALUES(?,?,?)");
		pst.setInt(1, s.getRno());
		pst.setString(2, s.getName());
		pst.setFloat(3, s.getPer());
		int n = pst.executeUpdate();
		System.out.println(n + " rows inserted successfully...");
	}

	@Override
	public void deleteStudentByRollNo(int rno) throws SQLException {
		pst = cn.prepareStatement("DELETE FROM student WHERE rno=?");
		pst.setInt(1, rno);
		int n = pst.executeUpdate();
		if (n == 0)
			System.out.println("No record found for deletion..");
		else
			System.out.println(n + " rows deleted successfully...");
	}

	@Override
	public void updateStudent(int rno, Student st) throws SQLException {
		pst = cn.prepareStatement("UPDATE student SET name=?, per=? WHERE rno=?");
		pst.setString(1, st.getName());
		pst.setFloat(2, st.getPer());
		pst.setInt(3, rno);
		int n = pst.executeUpdate();
		if (n == 0)
			System.out.println("No record found for deletion..");
		else
			System.out.println(n + " rows updated successfully...");
	}

	@Override
	public List<Student> getAllStudents() throws SQLException {
		Student st = new Student();
		ArrayList<Student> studentList = new ArrayList<Student>();
		pst = cn.prepareStatement("SELECT * FROM student");
		ResultSet rs = pst.executeQuery();
		while (rs.next()) {
			st = new Student();
			st.setRno(rs.getInt(1));
			st.setName(rs.getString(2));
			st.setPer(rs.getFloat(3));
			studentList.add(st);
		}

		return studentList;
	}

	@Override
	public Student getStudentByRollNo(int rno) throws SQLException {
		Student st = new Student();
		pst = cn.prepareStatement("SELECT * FROM student WHERE rno=?");
		pst.setInt(1, rno);
		ResultSet rs = pst.executeQuery();
		if (rs.next()) {
			st.setRno(rs.getInt(1));
			st.setName(rs.getString(2));
			st.setPer(rs.getFloat(3));
		} else
			st = null;
		return st;
	}

}
