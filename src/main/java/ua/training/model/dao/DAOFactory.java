package ua.training.model.dao;

import ua.training.model.dao.impl.JDBCDAOFactory;
import ua.training.model.dao.interfaces.ExhibitionDAO;

public abstract class DAOFactory {
    private static DAOFactory daoFactory;

    public abstract ExhibitionDAO createExhibitionDAO();

    public static DAOFactory getInstance(){
        if( daoFactory == null ){
            synchronized (DAOFactory.class){
                if(daoFactory==null){
                	DAOFactory temp = new JDBCDAOFactory();
                    daoFactory = temp;
                }
            }
        }
        return daoFactory;
    }
}
