package ua.training.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.training.controller.command.Command;
import ua.training.controller.command.UserListCommand;

@WebServlet(urlPatterns = {"/",})
public class Servlet extends HttpServlet {
	Map<String, Command> commands = new HashMap<>();
	
	@Override
	public void init() throws ServletException {
		commands.put("users", new UserListCommand());
		super.init();
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("doGet");
		System.out.println(req.getRequestedSessionId());
		System.out.println(req.getRequestURI());
		System.out.println(req.getRequestURL());
		
		String uri = req.getRequestURI();
		uri = uri.replaceAll(".*/api/", "");
		
		Command command = commands.getOrDefault(uri, def->"index.jsp");
		String path = command.execute(req);
		
		System.out.println(path);
		req.getRequestDispatcher(path).forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

	}


	
	
	
	

}
