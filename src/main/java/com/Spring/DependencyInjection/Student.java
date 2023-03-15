
package com.Spring.DependencyInjection;

public class Student {
	int studentId;
	String studentName;
	String studentadd;
	
	public Student(int studentId, String studentName, String studentadd) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentadd = studentadd;
	}

	public Student() {
		super();
		
	}

//   ****Setter****

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	public void setStudentadd(String studentadd) {
		this.studentadd = studentadd;
	}
	
	public int getStudentId() {
		return studentId;
	}

	public String getStudentName() {
		return studentName;
	}


	public String getStudentadd() {
		return studentadd;
	}


	@Override
	public String toString() {
		return "Student [ studentId=" + studentId + ", studentName=" + studentName + ", studentadd=" + studentadd + "]";
	}
	
	
	

}
