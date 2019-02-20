package oa.service.Impl;

import oa.bean.Work_log;
import oa.factory.DaoFactory;
import oa.service.Work_logService;

import java.util.List;

public class Work_logServiceImpl implements Work_logService {
    @Override
    public List<Work_log> query(Work_log work_log) {
        return DaoFactory.getWork_logDao().query(work_log);
    }

    @Override
    public boolean insert(Work_log work_log) {
        return  DaoFactory.getWork_logDao().insert(work_log);
    }

    @Override
    public boolean updateAll(Work_log work_log) {
        return  DaoFactory.getWork_logDao().updateAll(work_log);
    }

    @Override
    public boolean update(Work_log work_log) {
        return  DaoFactory.getWork_logDao().update(work_log);
    }

    @Override
    public boolean delete(Work_log work_log) {
        return DaoFactory.getWork_logDao().delete(work_log);
    }
}
