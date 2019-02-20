package oa.dao.Impl;

import oa.bean.Update_info;
import oa.dao.BaseDao;
import oa.dao.Update_infoDao;

public class Update_infoDaoImpl extends BaseDao<Update_info> implements Update_infoDao {
    @Override
    public boolean update(Update_info update_info) {
        return false;
    }

    @Override
    protected String getTable() {
        return "oa_update_info";
    }
}
