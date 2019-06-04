package club.mxz1122.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcTool {

    private static String diver = "com.mysql.jdbc.Driver";
    private static String url = "jdbc:mysql://localhost:3306/jquery";
    private static String user = "root";
    private static String password = "123";

    public static Connection getConnection(){
        try{
            Class.forName(diver);
            System.out.println("d----->iver success");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("------>connection success");
            return conn;
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }

}
