package my.lotu.action;

import java.util.Iterator;
import java.util.List;

import my.lotu.bean.Food;
import my.lotu.service.FoodService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class SearchFood extends ActionSupport {
	private Food food;
	private FoodService foodService;
	private List<Food> foodList;
	
	@Override
	public String execute(){
		foodList=foodService.findFoodByExample(food);
		for(Iterator<Food> iterator=foodList.iterator();iterator.hasNext();){
			System.out.println(iterator.next());
			
		}
		return SUCCESS;
	}

	
	public FoodService getFoodService() {
		return foodService;
	}


	public void setFoodService(FoodService foodService) {
		this.foodService = foodService;
	}


	public Food getFood() {
		return food;
	}


	public void setFood(Food food) {
		this.food = food;
	}

	public List<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(List<Food> foodList) {
		this.foodList = foodList;
	}
}
