package com.qa.gateway.persistence.domain;

//@Entity
public class Cohort {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long cohortID;
	private String cohortName;
	private String trainerName;
	private int formCount;
	private String cohortDescription;

	public Cohort() {

	}

	public Cohort(String cohortName, String trainerName, int formCount, String cohortDescription) {
		this.cohortName = cohortName;
		this.trainerName = trainerName;
		this.formCount = formCount;
		this.cohortDescription = cohortDescription;
	}

	public Long getCohortID() {
		return cohortID;
	}

	public void setCohortID(Long cohortId) {
		this.cohortID = cohortId;
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

	public String getCohortDescription() {
		return cohortDescription;
	}

	public void setCohortDescription(String cohortDescription) {
		this.cohortDescription = cohortDescription;
	}

	public int getFormCount() {
		return formCount;
	}

	public void setFormCount(int formCount) {
		this.formCount = formCount;
	}

}
