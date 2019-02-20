package oa.dao.Impl;

import oa.bean.WorkOver;
import oa.dao.BaseDao;
import oa.dao.WorkOverDao;

/**
 * Created by WangNing on 2017-10-10.
 */
public class WorkOverDaoImpl extends BaseDao<WorkOver> implements WorkOverDao {
    @Override
    public boolean update(WorkOver workOver) {
        return false;
    }

    @Override
    protected String getTable() {
        return "oa_workoverapply";
    }
}
