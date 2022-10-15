package com.example.demo.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_CASES")
@Data
public class DcCasesEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int caseId;

	private int caseNum;

	private int appId;

	private int planId;

}
