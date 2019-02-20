package oa.service;

import oa.bean.Work_time;

import java.util.List;

public interface Work_timeService {

    List<Work_time> query(Work_time work_time);

    boolean insert(Work_time work_time);

    boolean updateAll(Work_time work_time);

    boolean update(Work_time work_time);

    boolean delete(Work_time work_time);

}
