package club.mxz1122.service;

import club.mxz1122.entity.User;

import java.util.List;

public interface UserService {
    int  add(User user);


    List<User> select();
}
