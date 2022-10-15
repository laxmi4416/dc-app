package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.entity.Plan;
import com.example.demo.response.DcEducationResponse;
import com.example.demo.response.DcIncomeResponse;
import com.example.demo.response.DcKidsResponse;

public interface DcAppService {

	public int createCase(int appId);

	public List<Plan> getAllPlans();

	public void planSelection(int caseNumber, String planName);

	public void incomeDetails(int caseNumber, double monthSalaryIncome, double rentIncome, double propertyIncome);

	public void educationDetails(int caseNumber, String highstDegree, LocalDate graduationYear, String universityName);

	public void addKidDetails(int caseNumber, String kidName, int kidAge, Long kidSSN);

	public List<DcIncomeResponse> dcIncomeDetails();

	public List<DcEducationResponse> dcEducationDetails();

	public List<DcKidsResponse> dcKidDetails();

}
