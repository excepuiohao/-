package oa.dao;

import oa.bean.Work_log;

import java.util.List;

public interface Work_logDao {

    List<Work_log> query(Work_log work_log);

    boolean insert(Work_log work_log);

    boolean updateAll(Work_log work_log);

    boolean update(Work_log work_log);

    boolean delete(Work_log work_log);
}
