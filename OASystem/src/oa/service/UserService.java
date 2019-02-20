package oa.service;

import oa.bean.User;

import java.util.List;

public interface UserService {

    List<User> query(User user);

    boolean check(String userno, String password);

    User getUser();

    boolean insert(User user);

    boolean updateAll(User user);

    boolean update(User user);

    boolean delete(User user);
}
