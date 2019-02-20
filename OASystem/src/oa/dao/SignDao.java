package oa.dao;

import oa.bean.Sign;

import java.util.List;

public interface SignDao {

    List<Sign> query(Sign sign);

    boolean insert(Sign sign);

    boolean updateAll(Sign sign);

    boolean update(Sign sign);

    boolean delete( Sign sign);

}
