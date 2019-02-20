package oa.service.Impl;

import oa.bean.User;
import oa.factory.DaoFactory;
import oa.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public List<User> query(User user) {
        return DaoFactory.getUserDao().query(user);
    }

    @Override
    public boolean check(String username, String password) {
        return DaoFactory.getUserDao().check(username,password);
    }

    @Override
    public User getUser() {
        return DaoFactory.getUserDao().getUser();
    }

    @Override
    public boolean insert(User user) {
        return DaoFactory.getUserDao().insert(user);
    }

    @Override
    public boolean updateAll(User user) {
        return DaoFactory.getUserDao().updateAll(user);
    }

    @Override
    public boolean update(User user) {
        return DaoFactory.getUserDao().update(user);
    }

    @Override
    public boolean delete(User user) {
        return DaoFactory.getUserDao().delete(user);
    }
}
