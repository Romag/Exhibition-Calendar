package ua.training.model.dao.impl;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;

public class ConnectionPoolHolder {
private static volatile DataSource dataSource;
    
    public static DataSource getDataSource(){

        if (dataSource == null){
            synchronized (ConnectionPoolHolder.class) {
                if (dataSource == null) {
                    BasicDataSource ds = new BasicDataSource();
                    ds.setUrl("jdbc:mysql://localhost:3306/exhibition_calendar");
                    ds.setUsername("root");
                    ds.setPassword("root");
                    ds.setMinIdle(5);
                    ds.setMaxIdle(10);
                    ds.setMaxOpenPreparedStatements(100);
                    ds.addConnectionProperty("serverTimezone", "UTC");
                    ds.addConnectionProperty("useSSL", "false");
                    ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
                    
                    dataSource = ds;
                }
            }
        }
        return dataSource;

    }
}
