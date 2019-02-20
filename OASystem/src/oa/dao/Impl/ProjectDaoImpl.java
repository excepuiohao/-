package oa.dao.Impl;

import oa.bean.Project;
import oa.dao.BaseDao;
import oa.dao.ProjectDao;

public class ProjectDaoImpl extends BaseDao<Project> implements ProjectDao {
    @Override
    public boolean update(Project project) {

        return false;
    }

    @Override
    protected String getTable() {
        return "oa_project";
    }
}
