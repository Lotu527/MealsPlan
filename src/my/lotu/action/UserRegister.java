package my.lotu.action;

import my.lotu.bean.User;
import my.lotu.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserRegister extends ActionSupport {
	private User user;
	private UserService userService;
	
	@Override
	public String execute() throws Exception {
		return SUCCESS;
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
}
