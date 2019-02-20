package oa.service.Impl;

import oa.bean.Work_time;
import oa.factory.DaoFactory;
import oa.service.Work_timeService;

import java.util.List;

public class Work_timeServiceImpl implements Work_timeService {

    @Override
    public List<Work_time> query(Work_time work_time) {
        return DaoFactory.getWork_TimeDao().query(work_time);
    }

    @Override
    public boolean insert(Work_time work_time) {
        return DaoFactory.getWork_TimeDao().insert(work_time);
    }

    @Override
    public boolean updateAll(Work_time work_time) {
        return DaoFactory.getWork_TimeDao().updateAll(work_time);
    }

    @Override
    public boolean update(Work_time work_time) {
        return DaoFactory.getWork_TimeDao().update(work_time);
    }

    @Override
    public boolean delete(Work_time work_time) {
        return DaoFactory.getWork_TimeDao().delete(work_time);
    }
}
