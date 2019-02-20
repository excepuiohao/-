package oa.service;

import oa.bean.Apply;

import java.util.List;

public interface ApplyService {

    List<Apply> query(Apply apply);

    boolean insert(Apply apply);

    boolean updateAll(Apply apply);

    boolean update(Apply apply);

    boolean delete(Apply apply);
}
