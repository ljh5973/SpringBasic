package com.simple.command;

public class QuizVO {

	
	private int year;
	private int month;
	private int day;
	
	private String id;
	private String name;
	private String email;
	private String pw;
	
	public QuizVO() {
		// TODO Auto-generated constructor stub
	}

	
	
	public QuizVO(int year, int month, int day, String id, String name, String email, String pw) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
		this.id = id;
		this.name = name;
		this.email = email;
		this.pw = pw;
	}


	

	@Override
	public String toString() {
		return "QuizVO [year=" + year + ", month=" + month + ", day=" + day + ", id=" + id + ", name=" + name
				+ ", email=" + email + ", pw=" + pw + "]";
	}



	public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
	}



	public int getMonth() {
		return month;
	}



	public void setMonth(int month) {
		this.month = month;
	}



	public int getDay() {
		return day;
	}



	public void setDay(int day) {
		this.day = day;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getPw() {
		return pw;
	}



	public void setPw(String pw) {
		this.pw = pw;
	}




	
	
}
