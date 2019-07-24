package com.vodafone.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vodafone.facade.GetProductPlanFacade;
import com.vodafone.model.PlanDetails;

@Controller
public class ProductPlanController {
	
	@RequestMapping(method=RequestMethod.GET, value="/vfplan/getAllPlans")
	@ResponseBody
	public List<PlanDetails> getAllPlanDetails(){
		return GetProductPlanFacade.getInstance().getPlanDetails();
	}

}
