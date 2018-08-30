package ua.training.controller.command;

import javax.servlet.http.HttpServletRequest;

import ua.training.model.service.UserService;

public class UserListCommand implements Command {
	UserService service = new UserService();
	
	@Override
	public String execute(HttpServletRequest request) {
		request.setAttribute("userList", service.getAllUsers());
		return "WEB-INF/userlist.jsp";
	}

}
