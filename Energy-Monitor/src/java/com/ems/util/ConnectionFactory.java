package com.ems.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Alan
 */
public class ConnectionFactory {
    
    private static final String URL  = ConfigurationManager.getIntance().getProperties( "p.url" );
    private static final String USER = ConfigurationManager.getIntance().getProperties( "p.user" );
    private static final String PASS = ConfigurationManager.getIntance().getProperties( "p.pass" );
    private static final String DRVS = ConfigurationManager.getIntance().getProperties( "p.drvs" );
    
    private static ConnectionFactory instance;
    private static Connection connection;
    private static PreparedStatement ps;
    private static ResultSet rs;

    public ConnectionFactory() 
    {
        
    }
    
    public static ConnectionFactory getInstance()
    {
        if( instance == null )
        {
            instance = new ConnectionFactory();
        }
        
        return instance;
    }
    
    public static Connection connection()
    {
        try
        {
            Class.forName( DRVS );
            
            return connection = DriverManager.getConnection( URL, USER, PASS );
        }
        
        catch( ClassNotFoundException | SQLException ex )
        {
            throw new RuntimeException( ex );
        }
    }
}