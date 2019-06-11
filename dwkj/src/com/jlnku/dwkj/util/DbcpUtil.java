package com.jlnku.dwkj.util;

import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Properties;

public class DbcpUtil {

    private static DataSource ds;
    public static DataSource getDataSource(){
        return ds;
    }
    public static Connection getConnection()throws SQLException{
        System.out.println("---dbcp start---");
        System.out.println("---conn connect---");
        return ds.getConnection();
    }
    static {
        try {
            InputStream in = DbcpUtil.class.getClassLoader().getResourceAsStream("dbcp.properties");
            Properties p = new Properties();
            p.load(in);
            ds = BasicDataSourceFactory.createDataSource(p);
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
