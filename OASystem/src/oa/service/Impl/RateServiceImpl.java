package oa.service.Impl;

import oa.bean.Rate;
import oa.factory.DaoFactory;
import oa.service.RateService;

import java.util.List;

public class RateServiceImpl implements RateService {
    @Override
    public List<Rate> query(Rate rate) {
        return DaoFactory.getRateDao().query(rate);
    }

    @Override
    public boolean insert(Rate rate) {
        return DaoFactory.getRateDao().insert(rate);
    }

    @Override
    public boolean updateAll(Rate rate) {
        return DaoFactory.getRateDao().updateAll(rate);
    }

    @Override
    public boolean update(Rate rate) {
        return DaoFactory.getRateDao().update(rate);
    }

    @Override
    public boolean delete(Rate rate) {
        return DaoFactory.getRateDao().delete(rate);
    }
}
