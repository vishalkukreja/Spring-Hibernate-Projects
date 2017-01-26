package com.vish.springhibernate.service;

import java.util.List;

import com.vish.springhibernate.model.Project;

public interface ProjectService {
	void saveProject(Project prj);
	List<Project> allProjects();
	void deleteProjectByCode(String code);
	Project findByCode(String code);
	void updateProject(Project prj);
}
