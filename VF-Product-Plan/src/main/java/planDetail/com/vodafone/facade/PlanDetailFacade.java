package planDetail.com.vodafone.facade;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vodafone.model.PlanDetails;

import planDetail.com.vodafone.dao.PlanDetailsDao;
import static planDetail.com.vodafone.constants.PlanDetailsConstants.CREATE;
import static planDetail.com.vodafone.constants.PlanDetailsConstants.UPDATE;
import static planDetail.com.vodafone.constants.PlanDetailsConstants.DELETE;

@Component
public class PlanDetailFacade {
	
	@Autowired PlanDetailsDao planDetailDao;
	
	public List<PlanDetails> setPlanDetails(List<PlanDetails> listPlanDetails,
			String operation){
		System.out.println("Entering Facade, setPlanDetails");
		List<PlanDetails> modifiedPlanDetails = new ArrayList<PlanDetails>();
		System.out.println("Operation - "+operation);
		switch(operation) {
		
		case "CREATE":
			modifiedPlanDetails = planDetailDao.createPlan(listPlanDetails);
			break;
		
		
		  case "UPDATE":
			  modifiedPlanDetails = planDetailDao.updatePlan(listPlanDetails);
			  break;
		  
		  case "DELETE":
			  modifiedPlanDetails = planDetailDao.deletePlan(listPlanDetails);
			  break;
		
		
		}
		
		
		return modifiedPlanDetails;
		
		
	}
	

}
