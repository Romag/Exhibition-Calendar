package ua.training.model.service;

import java.util.List;

import ua.training.model.dao.DAOFactory;
import ua.training.model.dao.interfaces.UserDAO;
import ua.training.model.entity.User;

public class UserService {
	DAOFactory daoFactory = DAOFactory.getInstance(); 
	
	public List<User> getAllUsers() {
		UserDAO dao = daoFactory.createUserDAO();
		return dao.findAll();
	}
}
