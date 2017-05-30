package my.lotu.service;

import my.lotu.bean.Plan;
import my.lotu.dao.PlanDAO;

public class PlanService {
	private PlanDAO planDao;

	public PlanDAO getPlanDao() {
		return planDao;
	}

	public void setPlanDao(PlanDAO planDao) {
		this.planDao = planDao;
	}
	public Plan getPlan(Plan plan){
		return plan;
	}
}
