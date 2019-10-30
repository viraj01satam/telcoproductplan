package planDetail.com.vodafone.constants;

public class PlanDetailsConstants {
	
	// Constants for Operation
	public static String CREATE="CREATE";
	public static String UPDATE="UPDATE";
	public static String DELETE="DELETE";
	
	public static String OPERATION_STATUS_MOFIFIED="UPDATED";
	public static String OPERATION_STATUS_CREATED="CREATED";
	public static String OPERATION_STATUS_DELETED="DELETED";
	
	public static String SUCCESS="SUCCESS";
	
	
	public static String ERROR_RESPONSE_UNPROCESSIBLE_REQUEST="UNPROCESSIBLE REQUEST";
	
	//Constants for Query
	public static String CREATE_PLAN_QUERY  = "INSERT INTO TELCOCFG_TBL_PLAN_DETAILS"
			+" ( PLANTYPE, PLANNAME, PLANTARIFF, PLANVALIDITY, PLANSTARTDATE,"
			+ "PLANENDDATE, TALKTIME, FREEINTLMINS, FREELOCALMINS, FREEINTLSMS, FREELOCALSMS,"
			+ "TAXAPPLICABLE, LOCALCALLRATES, INTLCALLRATES, DATALIMITS, PLANSTATUS)"
			//+ "VALUES (PLANID_SEQ.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			+ "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	public static String CREATE_PLAN_SEQUENCE_ID_QUERY="select nextval('PLAN_SEQUENCE_ID')";
	
	
	public static String UPDATE_PLAN_QUERY = "UPDATE TELCOCFG_TBL_PLAN_DETAILS SET PLANTYPE = ?, PLANNAME = ?,"
			+ " PLANTARIFF = ?, PLANVALIDITY = ?, PLANSTARTDATE = ?,"
			+ "PLANENDDATE=?, TALKTIME = ? , FREEINTLMINS=?, FREELOCALMINS= ?,"
			+ "FREEINTLSMS=?, FREELOCALSMS=?, TAXAPPLICABLE=?, LOCALCALLRATES=?,"
			+ "INTLCALLRATES=?, DATALIMITS=?, PLANSTATUS=? WHERE PLANID=?";
	
	
	public static String DELETE_PLAN_QUERY = "DELETE FROM TELCOCFG_TBL_PLAN_DETAILS WHERE PLANID=?";

}
