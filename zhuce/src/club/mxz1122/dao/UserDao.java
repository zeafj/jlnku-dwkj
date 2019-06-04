package club.mxz1122.dao;

import club.mxz1122.entity.User;

import java.util.List;

public interface UserDao {
    int add(User user);

    List<User> select();
}
