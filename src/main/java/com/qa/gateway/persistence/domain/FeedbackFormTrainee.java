package com.qa.gateway.persistence.domain;

import java.util.List;

public class FeedbackFormTrainee {

	private Long traineeFormID;
	private Long cohortID;
	private Long trainerID;
	private Long traineeID;
	private int formCount;
	private int score;
	private String[] answers;

	public FeedbackFormTrainee() {

	}

	public FeedbackFormTrainee(Long trainerID, int formCount, int score, String[] answers) {
		this.trainerID = trainerID;
		this.formCount = formCount;
		this.score = score;
		this.answers = answers;
	}

	public Long getTraineeFormID() {
		return traineeFormID;
	}

	public void setTraineeFormID(Long traineeFormID) {
		this.traineeFormID = traineeFormID;
	}

	public Long getCohortID() {
		return cohortID;
	}

	public void setCohortID(Long cohortID) {
		this.cohortID = cohortID;
	}

	public Long getTrainerID() {
		return trainerID;
	}

	public void setTrainerID(Long trainerID) {
		this.trainerID = trainerID;
	}

	public Long getTraineeID() {
		return traineeID;
	}

	public void setTraineeID(Long traineeID) {
		this.traineeID = traineeID;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public String[] getAnswers() {
		return answers;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers;
	}

	public int getFormCount() {
		return formCount;
	}

	public void setFormCount(int formCount) {
		this.formCount = formCount;
	}

}
