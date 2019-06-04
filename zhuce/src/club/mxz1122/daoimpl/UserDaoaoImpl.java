package club.mxz1122.daoimpl;

import club.mxz1122.dao.UserDao;
import club.mxz1122.entity.User;
import club.mxz1122.util.JdbcTool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UserDaoaoImpl implements UserDao {
    @Override
    public int add(User user) {
        try{
            String sql = String.format("insert into user (userName,password,sex) values (%s,%s,%s)", user.getUserName(), user.getPassword(), user.getSex());
            System.out.println(sql);
            Connection connection = JdbcTool.getConnection();
            Statement statement = connection.createStatement();
            int i = statement.executeUpdate(sql);
            return i;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<User> select() {
        try{
            List<User> list = new ArrayList<User>();
            String sql = "select * from user";
            Connection connection = JdbcTool.getConnection();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            User u = null;

            while(resultSet.next()){

                u =new User();
                u.setId(resultSet.getInt("id"));
                u.setUserName(resultSet.getString("userName"));
                u.setPassword(resultSet.getString("password"));
                u.setSex(resultSet.getString("sex"));

                System.out.println(u);
                list.add(u);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
