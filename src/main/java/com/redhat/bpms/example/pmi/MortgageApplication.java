package com.redhat.bpms.example.pmi;

import java.io.Serializable;
import java.lang.Integer;
import java.lang.String;
import java.lang.Double;

/**
 * This class was automatically generated by the data modeler tool.
 */

@org.kie.api.definition.type.Label("mortgage application")
public class MortgageApplication implements Serializable {

	private static final long serialVersionUID = 4742262090234788515L;

	@org.kie.api.definition.type.Label("id")
	private String id;
	@org.kie.api.definition.type.Label("length of loan (years)")
	private Integer lengthOfLoanYears;
	@org.kie.api.definition.type.Label("base loan amount")
	private Double baseLoanAmount;
	@org.kie.api.definition.type.Label("down payment")
	private Double downpayment;
	@org.kie.api.definition.type.Label("annual MIP (bps)")
	private Integer annualMIP;
	@org.kie.api.definition.type.Label("program")
	private String program;
	@org.kie.api.definition.type.Label("property")
	private com.redhat.bpms.example.pmi.Property property;
	@org.kie.api.definition.type.Label("LTV")
	private Double ltv;
	@org.kie.api.definition.type.Label("APR")
	private Double apr;
	@org.kie.api.definition.type.Label("applicant")
	private com.redhat.bpms.example.pmi.Applicant applicant;

	public MortgageApplication() {
	}

	public Integer getAnnualMIP() {
		return this.annualMIP;
	}

	public void setAnnualMIP(Integer annualMIP) {
		this.annualMIP = annualMIP;
	}

	public Integer getLengthOfLoanYears() {
		return this.lengthOfLoanYears;
	}

	public void setLengthOfLoanYears(Integer lengthOfLoanYears) {
		this.lengthOfLoanYears = lengthOfLoanYears;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProgram() {
		return this.program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public com.redhat.bpms.example.pmi.Property getProperty() {
		return this.property;
	}

	public void setProperty(com.redhat.bpms.example.pmi.Property property) {
		this.property = property;
	}

	public Double getLtv() {
		return this.ltv;
	}

	public void setLtv(Double ltv) {
		this.ltv = ltv;
	}

	public Double getApr() {
		return this.apr;
	}

	public void setApr(Double apr) {
		this.apr = apr;
	}

	public com.redhat.bpms.example.pmi.Applicant getApplicant() {
		return this.applicant;
	}

	public void setApplicant(com.redhat.bpms.example.pmi.Applicant applicant) {
		this.applicant = applicant;
	}

	public java.lang.Double getBaseLoanAmount() {
		return this.baseLoanAmount;
	}

	public void setBaseLoanAmount(java.lang.Double baseLoanAmount) {
		this.baseLoanAmount = baseLoanAmount;
	}

	public java.lang.Double getDownpayment() {
		return this.downpayment;
	}

	public void setDownpayment(java.lang.Double downpayment) {
		this.downpayment = downpayment;
	}

	public MortgageApplication(java.lang.String id,
			java.lang.Integer lengthOfLoanYears,
			java.lang.Double baseLoanAmount, java.lang.Double downpayment,
			java.lang.Integer annualMIP, java.lang.String program,
			com.redhat.bpms.example.pmi.Property property,
			java.lang.Double ltv, java.lang.Double apr,
			com.redhat.bpms.example.pmi.Applicant applicant) {
		this.id = id;
		this.lengthOfLoanYears = lengthOfLoanYears;
		this.baseLoanAmount = baseLoanAmount;
		this.downpayment = downpayment;
		this.annualMIP = annualMIP;
		this.program = program;
		this.property = property;
		this.ltv = ltv;
		this.apr = apr;
		this.applicant = applicant;
	}

}