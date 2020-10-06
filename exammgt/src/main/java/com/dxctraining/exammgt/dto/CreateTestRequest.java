package com.dxctraining.exammgt.dto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


public class CreateTestRequest {
	
	private String testTitle;
	
	private String testDuration;
	@Max(3600000)
	private double testTotalMark;
	@Min(0)
	private double testMarkScored;
	
	private String startTime;
	
	private String endTime;
	
	
	public String getTestTitle() {
		return testTitle;
	}

	public void setTestTitle(String testTitle) {
		this.testTitle = testTitle;
	}

	public String getTestDuration() {
		return testDuration;
	}

	public void setTestDuration(String testDuration) {
		this.testDuration = testDuration;
	}

	public double getTestTotalMark() {
		return testTotalMark;
	}

	public void setTestTotalMark(double testTotalMark) {
		this.testTotalMark = testTotalMark;
	}

	public double getTestMarkScored() {
		return testMarkScored;
	}

	public void setTestMarkScored(double testMarkScored) {
		this.testMarkScored = testMarkScored;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getEndTime() {
		return endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

}
