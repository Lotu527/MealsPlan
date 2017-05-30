package my.lotu.action;

import java.util.List;

import my.lotu.bean.User;
import my.lotu.service.UserService;

import com.opensymphony.xwork2.ActionSupport;

@SuppressWarnings("serial")
public class UserLogin extends ActionSupport{
	private User user;
	private UserService userService;
	private List<User> userList;
	@Override
	public String execute() throws Exception {
		userList=getUserService().Login(user);
		if(userList!=null){
			System.out.println("Success !");
			return SUCCESS;
		}
		return ERROR;
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

	public List getUserList() {
		return userList;
	}

	public void setUserList(List userList) {
		this.userList = userList;
	}

	
}
