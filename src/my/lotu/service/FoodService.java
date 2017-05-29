package my.lotu.service;

import java.util.List;

import my.lotu.bean.Food;
import my.lotu.dao.FoodDAO;

import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.springframework.transaction.annotation.Transactional;
@Transactional
public class FoodService implements IFoodService{
	private FoodDAO foodDao;

	public void setFoodDao(FoodDAO foodDao) {
		this.foodDao = foodDao;
	}
	
	public Food findFoodById(long id){
		return foodDao.findById(id);
	}

	@SuppressWarnings("unchecked")
	public List<Food> findFoodByExample(Food instance) {
		return foodDao.findByExample(instance);
	}



	@SuppressWarnings("unchecked")
	public List<Food> findFoodByName(String name) {
		return foodDao.findByName(name);
	}

	@SuppressWarnings("unchecked")
	public List<Food> findFoodByType1(String type1) {
		return foodDao.findByType1(type1);
	}


	@SuppressWarnings("unchecked")
	public List<Food> findFoodByType2(String type2) {
		return foodDao.findByType2(type2);
	}

	
	@SuppressWarnings("unchecked")
	public List<Food> findFoodByPrice(Double price) {
		return foodDao.findByPrice(price);
	}


	@SuppressWarnings("unchecked")
	public List<Food> findFoodByCalorie(Double calorie) {
		return foodDao.findByCalorie(calorie);
	}


	@SuppressWarnings("unchecked")
	public List<Food> findFoodByMass(Double mass) {
		return foodDao.findByMass(mass);
	}
	@SuppressWarnings("unchecked")
	public List<Food> findAllFood(){
		return (List<Food>)foodDao.findAll();
	}

}
