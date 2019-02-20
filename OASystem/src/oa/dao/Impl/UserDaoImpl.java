package oa.dao.Impl;

import oa.bean.User;
import oa.dao.BaseDao;
import oa.dao.UserDao;

import java.util.List;

public class UserDaoImpl extends BaseDao<User> implements UserDao {

    private static User user = null;

    @Override
    public boolean update(User user) {
        return false;
    }


    @Override
    protected String getTable() {
        return "oa_user";
    }

    @Override
    public boolean check(String username, String password) {
        boolean flag = false;
        User user = new User();
        user.setU_no(username);
        user.setU_pwd(password);
        List<User> users = query(user);
        if(users.size()>0){
            setUser(users.get(0));
            flag = true;
        }
        return flag;
    }

    public static void setUser(User user) {
        UserDaoImpl.user = user;
    }

    @Override
    public User getUser() {
        return user;
    }
}
