package com.example.demo.service;

import java.time.LocalDate;
import java.util.List;

import com.example.demo.binding.DcEducation;
import com.example.demo.binding.DcIncome;
import com.example.demo.binding.DcKids;
import com.example.demo.entity.Plan;
import com.example.demo.response.DcEducationResponse;
import com.example.demo.response.DcIncomeResponse;
import com.example.demo.response.DcKidsResponse;

public interface DcAppService {

	public int createCase(int appId);

	public List<Plan> getAllPlans();

	public void planSelection(int caseNumber, String planName);

	public void incomeDetails(int caseNumber, DcIncome dcIncome);

	public void educationDetails(int caseNumber, DcEducation dcEducation);

	public List<DcKids> addKidDetails(int caseNumber, DcKids dcKids);

	public List<DcIncomeResponse> dcIncomeDetails();

	public List<DcEducationResponse> dcEducationDetails();

	public List<DcKidsResponse> dcKidDetails();

}
