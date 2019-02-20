package oa.service;

import oa.bean.WorkOver;

import java.util.List;

/**
 * Created by WangNing on 2017-10-10.
 */
public interface WorkOverService {

    List<WorkOver> query(WorkOver workOver);

    boolean insert(WorkOver workOver);

    boolean updateAll(WorkOver workOver);

    boolean update(WorkOver workOver);

    boolean delete(WorkOver workOver);

}
