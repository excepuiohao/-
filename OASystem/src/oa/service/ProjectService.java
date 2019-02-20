package oa.service;

import oa.bean.Project;

import java.util.List;

public interface ProjectService {

    List<Project> query(Project project);

    boolean insert(Project project);

    boolean updateAll(Project project);

    boolean update(Project project);

    boolean delete( Project project);

}
