package my.lotu.service;

import my.lotu.dao.UserDAO;

public class UserService {
	private UserDAO userDao;

	public UserDAO getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDAO userDao) {
		this.userDao = userDao;
	}
}
