package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name = "DC_CHILDRENS")
@Data
public class DcChildrens {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int childrenId;
	
	private int caseNumber;
	
	private int childrenDOB;
	
	private int childrenSSN;

}
