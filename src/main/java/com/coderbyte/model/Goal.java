package com.coderbyte.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="Goals")
public class Goal 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int goalID;
	@Column
	@NotBlank(message="Goal Not blank")
	String goalName;
	double tAmount;
	int nTransactions;
	double microsavings;
	String Duration;
	
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public int getGoalID() {
		return goalID;
	}
	public void setGoalID(int goalID) {
		this.goalID = goalID;
	}
	public String getGoalName() {
		return goalName;
	}
	public void setGoalName(String goalName) {
		this.goalName = goalName;
	}
	public double gettAmount() {
		return tAmount;
	}
	public void settAmount(double tAmount) {
		this.tAmount = tAmount;
	}
	public int getnTransactions() {
		return nTransactions;
	}
	public void setnTransactions(int nTransactions) {
		this.nTransactions = nTransactions;
	}
	public double getMicrosavings() {
		return microsavings;
	}
	public void setMicrosavings(double microsavings) {
		this.microsavings = microsavings;
	}
	

}
