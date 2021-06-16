package com.simple.command;

public class ScoreVO {
	
	private String name;
	private String math;
	private String kor;
	private String eng;
	
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}

	public ScoreVO(String name, String math, String kor, String eng) {
		super();
		this.name = name;
		this.math = math;
		this.kor = kor;
		this.eng = eng;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getEng() {
		return eng;
	}

	public void setEng(String eng) {
		this.eng = eng;
	}
	
	

}
