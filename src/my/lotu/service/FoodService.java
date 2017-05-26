package my.lotu.service;

import java.util.List;

import my.lotu.bean.Food;
import my.lotu.dao.FoodDAO;

import org.springframework.transaction.annotation.Transactional;
@Transactional
public class FoodService {
	private FoodDAO foodDao;

	public void setFoodDao(FoodDAO foodDao) {
		this.foodDao = foodDao;
	}
	
	public void addFood(Food food){
		foodDao.save(food);
	}
	public void deleteFood(Food food){
		foodDao.delete(food);
	}
	public void mergeFood(Food food){
		foodDao.merge(food);
	}
	@SuppressWarnings("unchecked")
	public List<Food> findAllFood(){
		return (List<Food>)foodDao.findAll();
	}
}
