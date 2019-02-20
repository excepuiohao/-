package oa.service.Impl;

import oa.bean.Project;
import oa.factory.DaoFactory;
import oa.service.ProjectService;

import java.util.List;

public class ProjectServiceImpl implements ProjectService {
    @Override
    public List<Project> query(Project project) {
        return DaoFactory.getProjectDao().query(project);
    }

    @Override
    public boolean insert(Project project) {
        return DaoFactory.getProjectDao().insert(project);
    }

    @Override
    public boolean updateAll(Project project) {
        return DaoFactory.getProjectDao().updateAll(project);
    }

    @Override
    public boolean update(Project project) {
        return DaoFactory.getProjectDao().update(project);
    }

    @Override
    public boolean delete(Project project) {
        return DaoFactory.getProjectDao().delete(project);
    }
}
