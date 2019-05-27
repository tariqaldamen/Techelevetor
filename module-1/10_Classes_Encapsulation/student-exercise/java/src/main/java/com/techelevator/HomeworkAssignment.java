package com.techelevator;

public class HomeworkAssignment {

	private int totalMarks;
	private int possibleMarks;
	private String submitterName;
	private String letterGrade;

	public HomeworkAssignment(int possibleMarks) {
		this.possibleMarks = possibleMarks;
	}

	public String getSubmitterName() {
		return submitterName;
	}

	public void setSubmitterName(String submitterName) {
		this.submitterName = submitterName;
	}

	public String getLetterGrade() {

		int diviadTwoNumbers = totalMarks % possibleMarks;

		if (diviadTwoNumbers >= 90) {
			letterGrade = "A";
		} else if (diviadTwoNumbers >= 80 && diviadTwoNumbers <= 89) {
			letterGrade = "B";
		} else if (diviadTwoNumbers >= 70 && diviadTwoNumbers <= 79) {
			letterGrade = "C";
		} else if (diviadTwoNumbers >= 60 && diviadTwoNumbers <= 69) {
			letterGrade = "D";
		} else {
			letterGrade = "F";
		}
		return letterGrade;
	}

	public void setTotalMarks(int totalMarks) {
		this.totalMarks = totalMarks;
	}

	public int getTotalMarks() {
		return totalMarks;
	}

	public int getPossibleMarks() {
		return possibleMarks;
	}

}
