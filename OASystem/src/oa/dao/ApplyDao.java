package oa.dao;

import oa.bean.Apply;

import java.util.List;

public interface ApplyDao {

    List<Apply> query(Apply apply);

    boolean insert(Apply apply);

    boolean updateAll(Apply apply);

    boolean update(Apply apply);

    boolean delete(Apply apply);
}
