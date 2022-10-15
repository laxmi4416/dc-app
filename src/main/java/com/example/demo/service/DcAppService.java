package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.entity.Plan;

public interface DcAppService {

	public int createCase(int appId);

	public List<Plan> getAllPlans();

	public void planSelection(int caseNumber, String planName);
	
	public void incomeDetails(int caseNumber,double monthSalaryIncome,double rentIncome,double propertyIncome);

	public void educationDetails(int caseNum, String HighstDegree,LocalDate graduationYear,String universityName);
	
	public  void addKidDetails(int caseNum,String kidName,int kidAge,Long kidSSN);
	
	public void summaryDetails();
	
}
