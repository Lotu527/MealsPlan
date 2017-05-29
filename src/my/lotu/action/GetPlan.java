package my.lotu.action;

import my.lotu.bean.Plan;
import my.lotu.service.PlanService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class GetPlan extends ActionSupport {

	private Plan plan;
	private PlanService planService;

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	public PlanService getPlanService() {
		return planService;
	}

	public void setPlanService(PlanService planService) {
		this.planService = planService;
	}

	@Override
	public String execute() throws Exception {
		
		return SUCCESS;
	}
}
