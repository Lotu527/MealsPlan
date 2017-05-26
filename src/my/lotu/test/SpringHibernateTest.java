package my.lotu.test;

import my.lotu.bean.Food;
import my.lotu.dao.FoodDAO;
import my.lotu.service.FoodService;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHibernateTest {
	@SuppressWarnings("resource")
	@Test
	public void test(){
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
		FoodService service=(FoodService)ac.getBean("FoodService");
		Food food=new Food("梅菜扣肉","主食","菜肴",19.0,222.8,332.5,223.6,1020.0,300.0);
		//service.addFood(food);
		//FoodDAO foodDao=(FoodDAO)ac.getBean("FoodDao");
		service.addFood(food);
		service.deleteFood(food);
		service.mergeFood(food);
		System.out.println(service.findAllFood().size());
		/*if(service.findAllFood().isEmpty()==true){
			System.out.println("is null");
		}else System.out.println("no"+service.findAllFood().size());*/
	}
}
