package oa.dao;

import oa.bean.Project;

import java.util.List;

public interface ProjectDao {
    List<Project> query(Project project);

    boolean insert(Project project);

    boolean updateAll(Project project);

    boolean update(Project project);

    boolean delete( Project project);
}
