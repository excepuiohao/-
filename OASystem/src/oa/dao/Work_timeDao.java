package oa.dao;

import oa.bean.Work_log;
import oa.bean.Work_time;

import java.util.List;

public interface Work_timeDao {

    List<Work_time> query(Work_time work_time);

    boolean insert(Work_time work_time);

    boolean updateAll(Work_time work_time);

    boolean update(Work_time work_time);

    boolean delete(Work_time work_time);
}
