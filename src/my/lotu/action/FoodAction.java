package my.lotu.action;

import my.lotu.bean.Food;
import my.lotu.service.FoodService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class FoodAction extends ActionSupport {
	private Food food;
	private FoodService foodService;
	@Override
	public String execute() throws Exception {
		foodService.addFood(food);
		return SUCCESS;
	}
	public Food getFood() {
		return food;
	}
	public void setFood(Food food) {
		this.food = food;
	}
	public FoodService getFoodService() {
		return foodService;
	}
	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}
}
