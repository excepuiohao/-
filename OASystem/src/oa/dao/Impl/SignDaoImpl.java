package oa.dao.Impl;

import oa.bean.Sign;
import oa.dao.BaseDao;
import oa.dao.SignDao;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SignDaoImpl extends BaseDao<Sign> implements SignDao {
    @Override
    public boolean update(Sign sign) {
        return false;
    }

    @Override
    protected String getTable() {
        return "oa_sign";
    }


    @Override
    public List<Sign> query(Sign sign) {
        List<Sign> signs = super.query(sign);
        Collections.sort(signs, new Comparator<Sign>() {
            @Override
            public int compare(Sign o1, Sign o2) {
                return o1.getS_id() - o2.getS_id();
            }
        });
        return signs;
    }
}
