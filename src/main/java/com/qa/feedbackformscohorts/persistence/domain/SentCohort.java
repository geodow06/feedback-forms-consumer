package com.qa.feedbackformscohorts.persistence.domain;

import java.sql.Date;
import java.time.LocalDate;

public class SentCohort {
	
	private Long cohortID;
	private String cohortName;
	private String trainerName;
	private int week;
	private String cohortDescription;
	private LocalDate createdOn = LocalDate.now();
	

	public SentCohort() {

	}

	public SentCohort(Long cohortID, String cohortName, String trainerName,int week, String cohortDescription) {
		this.cohortID = cohortID;
		this.cohortName = cohortName;
		this.trainerName = trainerName;
		this.week = week;
		this.cohortDescription = cohortDescription;
	}

	public Long getCohortId() {
		return cohortID;
	}

	public void setCohortId(Long cohortID) {
		this.cohortID = cohortID;
	}

	public String getCohortName() {
		return cohortName;
	}

	public void setCohortName(String cohortName) {
		this.cohortName = cohortName;
	}

	public String getTrainerName() {
		return trainerName;
	}

	public void setTrainerName(String trainerName) {
		this.trainerName = trainerName;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public String getCohortDescription() {
		return cohortDescription;
	}

	public void setCohortDescription(String cohortDescription) {
		this.cohortDescription = cohortDescription;
	}

}
