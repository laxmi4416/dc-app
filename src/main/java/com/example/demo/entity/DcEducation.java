package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_EDUCATION")
@Data
public class DcEducation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int eduId;

	private int caseNumber;

	private int HighestQualification;

	private int graduationYear;

}
