package oa.service.Impl;

import oa.bean.Sign;
import oa.factory.DaoFactory;
import oa.service.SignService;

import java.util.List;

public class SignServiceImpl implements SignService {
    @Override
    public List<Sign> query(Sign sign) {
        return DaoFactory.getSignDao().query(sign);
    }

    @Override
    public boolean insert(Sign sign) {
        return DaoFactory.getSignDao().insert(sign);
    }

    @Override
    public boolean updateAll(Sign sign) {
        return DaoFactory.getSignDao().updateAll(sign);
    }

    @Override
    public boolean update(Sign sign) {
        return DaoFactory.getSignDao().update(sign);
    }

    @Override
    public boolean delete(Sign sign) {
        return DaoFactory.getSignDao().delete(sign);
    }
}
