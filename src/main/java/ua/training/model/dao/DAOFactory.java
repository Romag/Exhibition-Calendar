package ua.training.model.dao;

import ua.training.model.dao.impl.JDBCDAOFactory;
import ua.training.model.dao.interfaces.ExhibitionDAO;
import ua.training.model.dao.interfaces.ReservationDAO;
import ua.training.model.dao.interfaces.UserDAO;

public abstract class DAOFactory {
    private static DAOFactory daoFactory;

    public abstract ExhibitionDAO createExhibitionDAO();
    public abstract ReservationDAO createReservationDAO();
    public abstract UserDAO createUserDAO();

    public static DAOFactory getInstance(){
        if( daoFactory == null ){
            synchronized (DAOFactory.class){
                if(daoFactory==null){
                    daoFactory = new JDBCDAOFactory();
                }
            }
        }
        return daoFactory;
    }
}
