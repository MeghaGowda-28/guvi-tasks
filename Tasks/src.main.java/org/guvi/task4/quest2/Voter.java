package org.guvi.task4.quest2;

public class Voter {
	
	public Voter(int voterId, String name, int age) throws Exception {
		this.voterId = voterId;
		this.name = name;
		this.age = age;
		
		if(age < 18) {
			throw new Exception("invalid age for voter");
		}
	}
	
	private int voterId;
	private String name;
	private int age;
	
	public int getVoterId() {
		return voterId;
	}
	public void setVoterId(int voterId) {
		this.voterId = voterId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}
