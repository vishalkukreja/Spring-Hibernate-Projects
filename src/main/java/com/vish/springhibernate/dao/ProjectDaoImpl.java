package com.vish.springhibernate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

import com.vish.springhibernate.model.Project;
@Repository("projectDao")
public class ProjectDaoImpl extends AbstractDao implements ProjectDao {

	@Override
	public void saveProject(Project prj) {		
		persist(prj);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> getAllProjects() {
		Criteria crt = getSession().createCriteria(Project.class);
		return crt.list();
	}

	@Override
	public void deleteProject(String code) {
		Query query = getSession().createSQLQuery("delete from Project where project_code = :code");
        query.setString("code", code);
        query.executeUpdate();
		
	}

	@Override
	public Project findByCode(String code) {
		Criteria crt = getSession().createCriteria(Project.class);
		crt.add(Restrictions.eq("projectCode", code));
		return (Project) crt.uniqueResult();
	}

	@Override
	public void updateProject(Project prj) {
		getSession().update(prj);
		
	}

}
