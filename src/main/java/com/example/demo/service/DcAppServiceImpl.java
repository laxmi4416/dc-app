package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.entity.Plan;
import com.example.demo.response.DcEducationResponse;
import com.example.demo.response.DcIncomeResponse;
import com.example.demo.response.DcKidsResponse;

public class DcAppServiceImpl implements DcAppService {

	@Override
	public int createCase(int appId) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Plan> getAllPlans() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void planSelection(int caseNumber, String planName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void incomeDetails(int caseNumber, double monthSalaryIncome, double rentIncome, double propertyIncome) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void educationDetails(int caseNum, String HighstDegree, LocalDate graduationYear, String universityName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addKidDetails(int caseNum, String kidName, int kidAge, Long kidSSN) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DcIncomeResponse> dcIncomeDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DcEducationResponse> dcEducationDetails() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DcKidsResponse> dcKidDetails() {
		// TODO Auto-generated method stub
		return null;
	}


}
