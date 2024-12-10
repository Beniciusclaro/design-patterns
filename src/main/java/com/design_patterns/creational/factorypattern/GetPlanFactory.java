package com.design_patterns.creational.factorypattern;

public class GetPlanFactory {

	public static Plan getPlan(String planType){
		if(planType == null){
			return null;
		}
		if(planType.equalsIgnoreCase("DOMESTICPLAN")) {
			return new DomesticPlan();
		}
		else if(planType.equalsIgnoreCase("COMMERCIALPLAN")){
			return new CommercialPlan();
		}
		else if(planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
			return new InstitutionalPlan();
		}
		return null;
	}
}
