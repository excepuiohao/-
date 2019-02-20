package oa.dao.Impl;

import oa.bean.Rate;
import oa.dao.BaseDao;
import oa.dao.RateDao;

public class RateDaoImpl extends BaseDao<Rate> implements RateDao {
    @Override
    public boolean update(Rate rate) {
        return false;
    }

    @Override
    protected String getTable() {
        return "oa_rate";
    }
}
