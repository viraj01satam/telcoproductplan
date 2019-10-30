package planDetail.com.vodafone.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vodafone.model.ErrorMessage;
import com.vodafone.model.PlanDetails;
import com.vodafone.model.SetPlanRequest;
import com.vodafone.model.SetPlanResponse;

import static planDetail.com.vodafone.constants.PlanDetailsConstants.SUCCESS;

import planDetail.com.vodafone.facade.PlanDetailFacade;

@Controller
public class PlanDetailController {
	
	@Autowired PlanDetailFacade planDetailFacade;
	
	@RequestMapping(method=RequestMethod.POST, value="/plandetail/set")
	@ResponseBody
	public ResponseEntity<Object> setPlanDetail(@RequestBody SetPlanRequest planRequest){
		System.out.println("Entering Controller; setPlanDetail");
		ResponseEntity<Object> response = null;
		
		if(planRequest!=null && planRequest.getListPlanDetails()!=null
				&& planRequest.getListPlanDetails().size()>0 && !planRequest.getListPlanDetails().isEmpty()) {
			
			System.out.println("No Null, Hence Calling Facade");
			List<PlanDetails> listPlanDetails = planDetailFacade.setPlanDetails(planRequest.getListPlanDetails(), planRequest.getOperation());
			SetPlanResponse planResponse = new  SetPlanResponse();
			planResponse.setListPlanDetails(listPlanDetails);
			planResponse.setStatusMessage(SUCCESS);
			response = new ResponseEntity(planResponse, HttpStatus.OK);
			
		}else {
			System.out.println("Null Pointer, Hence Sending 422");
			ErrorMessage em = new ErrorMessage();
			em.setErrorDescription("No Plan Details Posted, Hence Request cannot be processed");
			em.setErrorMessage("UNPROCESSIBLE REQUEST");
			response = new ResponseEntity(em,HttpStatus.BAD_REQUEST);
		}
		
		
		System.out.println("Exiting Controller; setPlanDetail");
		return response;
	}
	
	@RequestMapping(method=RequestMethod.GET, value="/getHello")
	@ResponseBody
	public ResponseEntity<Object> getHello(){
		ResponseEntity<Object> response = null;
		response = new ResponseEntity("Hello World World", HttpStatus.OK);
		return response;
	}

}
