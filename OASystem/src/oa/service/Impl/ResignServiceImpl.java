package oa.service.Impl;

import oa.bean.Resign;
import oa.factory.DaoFactory;
import oa.service.ResignService;

import java.util.List;

public class ResignServiceImpl implements ResignService {
    @Override
    public List<Resign> query(Resign resign) {
        return DaoFactory.getResignDao().query(resign);
    }

    @Override
    public boolean insert(Resign resign) {
        return DaoFactory.getResignDao().insert(resign);
    }

    @Override
    public boolean updateAll(Resign resign) {
        return DaoFactory.getResignDao().updateAll(resign);
    }

    @Override
    public boolean update(Resign resign) {
        return DaoFactory.getResignDao().update(resign);
    }

    @Override
    public boolean delete(Resign resign) {
        return DaoFactory.getResignDao().delete(resign);
    }
}
