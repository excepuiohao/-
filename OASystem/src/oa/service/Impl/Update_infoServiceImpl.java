package oa.service.Impl;

import oa.bean.Update_info;
import oa.factory.DaoFactory;
import oa.service.Update_infoService;

import java.util.List;

public class Update_infoServiceImpl implements Update_infoService {

    @Override
    public List<Update_info> query(Update_info update_info) {
        return DaoFactory.getUpdate_InfoDao().query(update_info);
    }

    @Override
    public boolean insert(Update_info update_info) {
        return DaoFactory.getUpdate_InfoDao().insert(update_info);
    }

    @Override
    public boolean updateAll(Update_info update_info) {
        return DaoFactory.getUpdate_InfoDao().updateAll(update_info);
    }

    @Override
    public boolean update(Update_info update_info) {
        return DaoFactory.getUpdate_InfoDao().update(update_info);
    }

    @Override
    public boolean delete(Update_info update_info) {
        return DaoFactory.getUpdate_InfoDao().delete(update_info);
    }
}
