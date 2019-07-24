package com.vodafone.facade;

import java.util.ArrayList;
import java.util.List;

import com.vodafone.model.PlanDetails;


//Facade Class

public class GetProductPlanFacade {
	
	
	
	private List<PlanDetails> listPlanDetails;
	
	private static GetProductPlanFacade gppf = null;
	
	private GetProductPlanFacade() {
		listPlanDetails = new ArrayList<PlanDetails>();
	}
	
	public static GetProductPlanFacade getInstance() {
		if(gppf == null) {
			gppf = new GetProductPlanFacade();
			return gppf;
		}else {
			return gppf;
		}
	}
	
	public void addPlan(PlanDetails planDetails) {
		listPlanDetails.add(planDetails);
	}
	
	public List<PlanDetails> getPlanDetails(){
		PlanDetails p1 = new PlanDetails();
		p1.setPlanId("VF001");
		p1.setPlanName("Monthly399Unlimited");
		
		PlanDetails p2 = new PlanDetails();
		p2.setPlanId("VF002");
		p2.setPlanName("Data1GB");
		
		listPlanDetails.add(p1);
		listPlanDetails.add(p2);
		
		System.out.println("Plan details - "+listPlanDetails.size());
		
		return listPlanDetails;
	}

}
