package com.ems.util;

import java.io.FileInputStream;
import java.util.Properties;

/**
 *
 * @author Alan
 */
public class ConfigurationManager {
    
    private static ConfigurationManager instance;
    private static Properties properties;

    public ConfigurationManager() 
    {
        loadProperties();
    }
    
    public static ConfigurationManager getIntance()
    {
        if( instance == null )
        {
            instance = new ConfigurationManager();
        }
        
        return instance;
    }
    
    private void loadProperties()
    {
        try
        {
            if( properties == null )
            {
                properties = new Properties();
                
                FileInputStream input = new FileInputStream( "C:\\file.properties" );
                
                properties.load( input );
                
                input.close();
            }
        }
        
        catch( Exception e )
        {
            throw new RuntimeException( e );
        }
    }
    
    public String getProperties(String value)
    {
        return properties.getProperty(value);
    }
}
