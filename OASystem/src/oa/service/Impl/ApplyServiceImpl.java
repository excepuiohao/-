package oa.service.Impl;

import oa.bean.Apply;
import oa.factory.DaoFactory;
import oa.service.ApplyService;

import java.util.List;

public class ApplyServiceImpl implements ApplyService {
    @Override
    public List<Apply> query(Apply apply) {
        return DaoFactory.getApplyDao().query(apply);
    }

    @Override
    public boolean insert(Apply apply) {
        return DaoFactory.getApplyDao().insert(apply);
    }

    @Override
    public boolean updateAll(Apply apply) {
        return DaoFactory.getApplyDao().updateAll(apply);
    }

    @Override
    public boolean update(Apply apply) {
        return DaoFactory.getApplyDao().update(apply);
    }

    @Override
    public boolean delete(Apply apply) {
        return DaoFactory.getApplyDao().delete(apply);
    }
}
