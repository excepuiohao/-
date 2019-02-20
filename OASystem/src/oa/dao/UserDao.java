package oa.dao;

import oa.bean.Sign;
import oa.bean.User;

import java.util.List;

public interface UserDao {
    List<User> query(User user);

    boolean check(String userno, String password);

    User getUser();

    boolean insert(User user);

    boolean updateAll(User user);

    boolean update(User user);

    boolean delete(User user);

}
