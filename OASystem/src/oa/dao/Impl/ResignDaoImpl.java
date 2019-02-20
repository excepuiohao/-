package oa.dao.Impl;

import oa.bean.Resign;
import oa.dao.BaseDao;
import oa.dao.ResignDao;

public class ResignDaoImpl extends BaseDao<Resign> implements ResignDao {
    @Override
    public boolean update(Resign resign) {
        return false;
    }

    @Override
    protected String getTable() {
        return "oa_resign";
    }
}
