package com.vodafone.model;

public class PlanDetails {
	
	private String planId;
	private String planType;
	private String planName;
	private String planTariff;
	private String planValidity; 
	private String planStartDate; 
	private String planEndDate; 
	private String talkTime; 
	private String freeIntlMins; 
	private String freeLocalMins; 
	private String freeIntlSMS; 
	private String freeLocalSMS; 
	private String taxApplicable; 
	private String localCallRates; 
	private String intlCallRates;
	private String dataLimits;
	private String planStatus;
	private String operationStatus;
	
	public String getPlanId() {
		return planId;
	}
	public void setPlanId(String planId) {
		this.planId = planId;
	}
	public String getPlanType() {
		return planType;
	}
	public void setPlanType(String planType) {
		this.planType = planType;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
	}
	public String getPlanTariff() {
		return planTariff;
	}
	public void setPlanTariff(String planTariff) {
		this.planTariff = planTariff;
	}
	public String getPlanValidity() {
		return planValidity;
	}
	public void setPlanValidity(String planValidity) {
		this.planValidity = planValidity;
	}
	public String getPlanStartDate() {
		return planStartDate;
	}
	public void setPlanStartDate(String planStartDate) {
		this.planStartDate = planStartDate;
	}
	public String getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(String planEndDate) {
		this.planEndDate = planEndDate;
	}
	public String getTalkTime() {
		return talkTime;
	}
	public void setTalkTime(String talkTime) {
		this.talkTime = talkTime;
	}
	public String getFreeIntlMins() {
		return freeIntlMins;
	}
	public void setFreeIntlMins(String freeIntlMins) {
		this.freeIntlMins = freeIntlMins;
	}
	public String getFreeLocalMins() {
		return freeLocalMins;
	}
	public void setFreeLocalMins(String freeLocalMins) {
		this.freeLocalMins = freeLocalMins;
	}
	public String getFreeIntlSMS() {
		return freeIntlSMS;
	}
	public void setFreeIntlSMS(String freeIntlSMS) {
		this.freeIntlSMS = freeIntlSMS;
	}
	public String getFreeLocalSMS() {
		return freeLocalSMS;
	}
	public void setFreeLocalSMS(String freeLocalSMS) {
		this.freeLocalSMS = freeLocalSMS;
	}
	public String getTaxApplicable() {
		return taxApplicable;
	}
	public void setTaxApplicable(String taxApplicable) {
		this.taxApplicable = taxApplicable;
	}
	public String getLocalCallRates() {
		return localCallRates;
	}
	public void setLocalCallRates(String localCallRates) {
		this.localCallRates = localCallRates;
	}
	public String getIntlCallRates() {
		return intlCallRates;
	}
	public void setIntlCallRates(String intlCallRates) {
		this.intlCallRates = intlCallRates;
	}
	public String getDataLimits() {
		return dataLimits;
	}
	public void setDataLimits(String dataLimits) {
		this.dataLimits = dataLimits;
	}
	public String getPlanStatus() {
		return planStatus;
	}
	public void setPlanStatus(String planStatus) {
		this.planStatus = planStatus;
	}
	public String getOperationStatus() {
		return operationStatus;
	}
	public void setOperationStatus(String operationStatus) {
		this.operationStatus = operationStatus;
	}
	@Override
	public String toString() {
		return "PlanDetails [planId=" + planId + ", planType=" + planType + ", planName=" + planName + ", planTariff="
				+ planTariff + ", planValidity=" + planValidity + ", planStartDate=" + planStartDate + ", planEndDate="
				+ planEndDate + ", talkTime=" + talkTime + ", freeIntlMins=" + freeIntlMins + ", freeLocalMins="
				+ freeLocalMins + ", freeIntlSMS=" + freeIntlSMS + ", freeLocalSMS=" + freeLocalSMS + ", taxApplicable="
				+ taxApplicable + ", localCallRates=" + localCallRates + ", intlCallRates=" + intlCallRates
				+ ", dataLimits=" + dataLimits + ", planStatus=" + planStatus + ", operationStatus=" + operationStatus
				+ "]";
	}
	
	
	 

}
