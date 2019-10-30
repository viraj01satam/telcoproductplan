package com.vodafone.model;

import java.util.List;

public class SetPlanRequest {
	
	private List<PlanDetails> listPlanDetails;
	private String operation;

	public List<PlanDetails> getListPlanDetails() {
		return listPlanDetails;
	}

	public void setListPlanDetails(List<PlanDetails> listPlanDetails) {
		this.listPlanDetails = listPlanDetails;
	}

	public String getOperation() {
		return operation;
	}

	public void setOperation(String operation) {
		this.operation = operation;
	}
	
	

}
