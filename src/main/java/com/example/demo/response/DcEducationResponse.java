package com.example.demo.response;

import java.time.LocalDate;

import lombok.Data;

@Data
public class DcEducationResponse {

	private int caseNumber;

	private String HighstDegree;

	private LocalDate graduationYear;

	private String universityName;

}
