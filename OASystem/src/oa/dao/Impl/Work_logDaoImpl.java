package oa.dao.Impl;

import oa.bean.Work_log;
import oa.dao.BaseDao;
import oa.dao.Work_logDao;

public class Work_logDaoImpl extends BaseDao<Work_log> implements Work_logDao {
    @Override
    public boolean update(Work_log work_log) {
        return false;
    }

    @Override
    protected String getTable() {
        return "oa_work_log";
    }
}
