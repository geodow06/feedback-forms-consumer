package com.qa.gateway.persistence.domain;

public class FeedbackFormTrainer {
	
	private Long trainerFormID;
	private Long trainerID;
	private Long traineeID;
	private int formCount;
	private int[] scores;
	private String[] answers;
	private String commentsForTrainee;

	public FeedbackFormTrainer() {
		
	}
	
	public FeedbackFormTrainer(Long trainerID, Long traineeID, int[] scores, String[] answers, String commentsForTrainee) {
		this.traineeID = traineeID;
		this.trainerID = trainerID;
		this.scores = scores;
		this.answers = answers;
		this.commentsForTrainee = commentsForTrainee;
	}

	public int getFormCount() {
		return formCount;
	}

	public void setFormCount(int formCount) {
		this.formCount = formCount;
	}

	public Long getTrainerFormID() {
		return trainerFormID;
	}

	public void setTrainerFormID(Long trainerFormID) {
		this.trainerFormID = trainerFormID;
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

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

	public String[] getAnswers() {
		return answers;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers;
	}

	public String getCommentsForTrainee() {
		return commentsForTrainee;
	}

	public void setCommentsForTrainee(String commentsForTrainee) {
		this.commentsForTrainee = commentsForTrainee;
	}
	
}
