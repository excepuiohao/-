package oa.dao.Impl;

import oa.bean.Apply;
import oa.dao.ApplyDao;
import oa.dao.BaseDao;

public class ApplyDaoImpl extends BaseDao<Apply> implements ApplyDao {

    @Override
    public boolean update(Apply apply) {
        return false;
    }


    @Override
    protected String getTable() {
        return "oa_apply";
    }
}
