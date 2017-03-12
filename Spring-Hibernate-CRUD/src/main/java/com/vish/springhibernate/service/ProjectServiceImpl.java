package com.vish.springhibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.vish.springhibernate.dao.ProjectDao;
import com.vish.springhibernate.model.Project;
@Service("projectService")
@Transactional
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	ProjectDao prjDao;
	
	@Override
	public void saveProject(Project prj) {
		// TODO Auto-generated method stub
		prjDao.saveProject(prj);	
	}

	@Override
	public List<Project> allProjects() {
		// TODO Auto-generated method stub
		return prjDao.getAllProjects();
	}

	@Override
	public void deleteProjectByCode(String code) {
		// TODO Auto-generated method stub
		prjDao.deleteProject(code);
	}

	@Override
	public Project findByCode(String code) {
		// TODO Auto-generated method stub
		return prjDao.findByCode(code);
	}

	@Override
	public void updateProject(Project prj) {
		// TODO Auto-generated method stub
		prjDao.updateProject(prj);
	}

}
