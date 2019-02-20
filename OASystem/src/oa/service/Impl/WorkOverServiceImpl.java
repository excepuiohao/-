package oa.service.Impl;

import oa.bean.WorkOver;
import oa.dao.WorkOverDao;
import oa.factory.DaoFactory;
import oa.service.WorkOverService;

import java.util.List;

/**
 * Created by WangNing on 2017-10-10.
 */
public class WorkOverServiceImpl implements WorkOverService  {
    @Override
    public List<WorkOver> query(WorkOver workOver) {
        return DaoFactory.getWorkOverDao().query(workOver);
    }

    @Override
    public boolean insert(WorkOver workOver) {
        return DaoFactory.getWorkOverDao().insert(workOver);
    }

    @Override
    public boolean updateAll(WorkOver workOver) {
        return DaoFactory.getWorkOverDao().updateAll(workOver);
    }

    @Override
    public boolean update(WorkOver workOver) {
        return DaoFactory.getWorkOverDao().update(workOver);
    }

    @Override
    public boolean delete(WorkOver workOver) {
        return DaoFactory.getWorkOverDao().delete(workOver);
    }
}
