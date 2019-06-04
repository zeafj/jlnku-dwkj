package club.mxz1122.serviceimpl;

import club.mxz1122.dao.UserDao;
import club.mxz1122.daoimpl.UserDaoaoImpl;
import club.mxz1122.entity.User;
import club.mxz1122.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoaoImpl();
    @Override
    public int add(User user) {

        return userDao.add(user);
    }

    @Override
    public List<User> select() {
        return userDao.select();
    }
}
