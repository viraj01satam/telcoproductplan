package planDetail.com.vodafone.dao;

import static planDetail.com.vodafone.constants.PlanDetailsConstants.CREATE_PLAN_QUERY;
import static planDetail.com.vodafone.constants.PlanDetailsConstants.CREATE_PLAN_SEQUENCE_ID_QUERY;
import static planDetail.com.vodafone.constants.PlanDetailsConstants.DELETE_PLAN_QUERY;
import static planDetail.com.vodafone.constants.PlanDetailsConstants.UPDATE_PLAN_QUERY;

import static planDetail.com.vodafone.constants.PlanDetailsConstants.OPERATION_STATUS_CREATED;
import static planDetail.com.vodafone.constants.PlanDetailsConstants.OPERATION_STATUS_MOFIFIED;
import static planDetail.com.vodafone.constants.PlanDetailsConstants.OPERATION_STATUS_DELETED;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vodafone.model.PlanDetails;


@Service
public class PlanDetailsDao {

	@Autowired JdbcTemplate jdbcTemplate;

	public List<PlanDetails> createPlan(List<PlanDetails> listPlanDetail) {
		System.out.println("Entering Dao, Create Plan");
		
		
		if(listPlanDetail!=null && listPlanDetail.size()>0 && !listPlanDetail.isEmpty()) {
			
			System.out.println("No null, hence inserting records");
			
			DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
			 Date date = new Date();
			
			for(PlanDetails planDetail : listPlanDetail) {
				System.out.println("Inside For");
			//	String planSequence = "PLAN"+getSequence();
				int count = jdbcTemplate.update(CREATE_PLAN_QUERY, 
						/* planSequence, */
						planDetail.getPlanType(),
						planDetail.getPlanName(),
						planDetail.getPlanTariff(),
						planDetail.getPlanValidity(),
						planDetail.getPlanStartDate(),
						planDetail.getPlanEndDate(),
						planDetail.getTalkTime(),
						planDetail.getFreeIntlMins(),
						planDetail.getFreeLocalMins(),
						planDetail.getFreeIntlSMS(),
						planDetail.getFreeLocalSMS(),
						planDetail.getTaxApplicable(),
						planDetail.getLocalCallRates(),
						planDetail.getIntlCallRates(),
						planDetail.getDataLimits(),
						planDetail.getPlanStatus()
						);
				System.out.println("count - "+count);
				if(count>0) {
					//planDetail.setPlanId(planSequence);
					planDetail.setOperationStatus(OPERATION_STATUS_CREATED);
				}
			}

		}

		System.out.println("Exiting Dao, Create Plan");
		return listPlanDetail;
	}

	public long getSequence() {
		long sequenceId=0;
		sequenceId = jdbcTemplate.queryForObject(CREATE_PLAN_SEQUENCE_ID_QUERY,
				Integer.class);
		return sequenceId;
	}

	@Transactional
	public List<PlanDetails> updatePlan(List<PlanDetails> listPlanDetails) {

		System.out.println("Entering Dao, Update");
		

		if(listPlanDetails!=null && listPlanDetails.size()>0 && !listPlanDetails.isEmpty()) {
			System.out.println("No Nulls;");
			for(PlanDetails planDetail : listPlanDetails) {
				System.out.println("Inside for");
				System.out.println("Plan Details "+planDetail.toString());
				System.out.println("Query - "+UPDATE_PLAN_QUERY);
				int count = jdbcTemplate.update(UPDATE_PLAN_QUERY,
						planDetail.getPlanType(),
						planDetail.getPlanName(),
						planDetail.getPlanTariff(),
						planDetail.getPlanValidity(),
						planDetail.getPlanStartDate(),
						planDetail.getPlanEndDate(),
						planDetail.getTalkTime(),
						planDetail.getFreeIntlMins(),
						planDetail.getFreeLocalMins(),
						planDetail.getFreeIntlSMS(),
						planDetail.getFreeLocalSMS(),
						planDetail.getTaxApplicable(),
						planDetail.getLocalCallRates(),
						planDetail.getIntlCallRates(),
						planDetail.getDataLimits(),
						planDetail.getPlanStatus(),
						Integer.valueOf(planDetail.getPlanId()));
				System.out.println("count - "+count);
				if(count>0) {	
					System.out.println("OPERATION_STATUS_MOFIFIED - "+OPERATION_STATUS_MOFIFIED);
					planDetail.setOperationStatus(OPERATION_STATUS_MOFIFIED);
					
				}else { 
					
					break;
				}
			}
		}

		return listPlanDetails;
	}


	public List<PlanDetails> deletePlan(List<PlanDetails> listPlanDetails) {
	
		if(listPlanDetails!=null && listPlanDetails.size()>0 && !listPlanDetails.isEmpty()) {
			for(PlanDetails planDetail : listPlanDetails) {
				int count = jdbcTemplate.update(DELETE_PLAN_QUERY, planDetail.getPlanId());
				if(count>0) {
					planDetail.setOperationStatus(OPERATION_STATUS_DELETED);
					continue;
				}else {
					
					break;
				}
			}
		}

		return listPlanDetails;
	}


}
