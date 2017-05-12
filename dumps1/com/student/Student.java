package com.student;

import java.io.Serializable;

public class Student implements StudentInt,Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int rollNo;
	private String name;
	private int subject1;
	private int subject2;
	private int subject3;
	private int totalMarks;

	
	 public Student(int rollNo, String name, int subject1, int subject2, int
	 subject3) { 
		 super(); 
		 this.rollNo = rollNo; 
		 this.name =name; 
		 this.subject1 = subject1; 
		 this.subject2 = subject2; 
		 this.subject3 =subject3; 
		// this.totalMarks = totalMarks; 
	 }
	 
	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSubject1() {
		return subject1;
	}

	public void setSubject1(int subject1) {
		this.subject1 = subject1;
	}

	public int getSubject2() {
		return subject2;
	}

	public void setSubject2(int subject2) {
		this.subject2 = subject2;
	}

	public int getSubject3() {
		return subject3;
	}

	public void setSubject3(int subject3) {
		this.subject3 = subject3;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	//method to initialize info of student
	@Override
	public void readStudInfo(int rollNo, String name, int subject1,
			int subject2, int subject3) {
		this.rollNo = rollNo;
		this.name = name;
		this.subject1 = subject1;
		this.subject2 = subject2;
		this.subject3 = subject3;
		

	}

	//method to calculate total
	@Override
	public void calcTotal() {
		totalMarks = subject1 + subject2 + subject3;
		System.out.println("Total Marks are: " + this.totalMarks);
	}

	
	//method to printstudentoinfo
	@Override
	public void printStudInfo() {

		System.out.println("Name: "+this.name);
		System.out.println("RollNo: "+this.rollNo);
		System.out.println("Sub1: "+this.subject1);
		System.out.println("Sub2: "+this.subject2);
		System.out.println("Sub3: "+this.subject3);
		System.out.println("Total: "+this.totalMarks);
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", subject1="
				+ subject1 + ", subject2=" + subject2 + ", subject3="
				+ subject3 + ", totalMarks=" + totalMarks + "]";
	}

	
	
	
	
}
