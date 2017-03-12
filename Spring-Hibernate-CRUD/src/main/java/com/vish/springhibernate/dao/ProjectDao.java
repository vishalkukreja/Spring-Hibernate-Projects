package com.vish.springhibernate.dao;

import java.util.List;

import com.vish.springhibernate.model.Project;

public interface ProjectDao {
	void saveProject(Project prj);
	List<Project> getAllProjects();
	void deleteProject(String code);
	Project findByCode(String code);
	void updateProject(Project prj);						
}
