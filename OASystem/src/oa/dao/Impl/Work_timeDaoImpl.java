package oa.dao.Impl;

import oa.bean.Work_time;
import oa.dao.BaseDao;
import oa.dao.Work_timeDao;

public class Work_timeDaoImpl extends BaseDao<Work_time> implements Work_timeDao {
    @Override
    public boolean update(Work_time work_time) {
        return false;
    }

    @Override
    protected String getTable() {
        return "oa_work_time";
    }
}
