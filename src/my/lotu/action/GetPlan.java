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
		System.out.printf("Plan:{id=%d,name=%s,type=%s,dayPlanId=%s,price=%d,score=%d,time=%d}",plan.getId(),plan.getName(),plan.getDayPlanId(),plan.getPrice(),plan.getScore(),plan.getTime());
		return SUCCESS;
	}
}
