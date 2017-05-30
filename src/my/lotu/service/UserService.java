package my.lotu.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import my.lotu.bean.Food;
import my.lotu.bean.User;
import my.lotu.dao.UserDAO;
@Transactional
public class UserService {
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
	public List<User> Login(User user){
		List<User> list=(List<User>)userDao.findByExample(user);
		if(list.isEmpty()){
			System.out.println("is NULL");
			return null;
		}
		return list;
		
	}
	public User Register(User user){
		userDao.save(user);
		return user;
	}
}
