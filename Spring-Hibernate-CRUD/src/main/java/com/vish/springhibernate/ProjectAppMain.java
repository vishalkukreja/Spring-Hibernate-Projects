package com.vish.springhibernate;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.vish.springhibernate.configuration.SpringConfiguration;
import com.vish.springhibernate.model.Project;
import com.vish.springhibernate.service.ProjectService;

public class ProjectAppMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new AnnotationConfigApplicationContext(SpringConfiguration.class);
		ProjectService service = (ProjectService) context.getBean("projectService");
		
		Calendar cal = Calendar.getInstance();		
		
		Project prj1 = new Project();
		prj1.setProjectName("Test");
		prj1.setProjectCode("MS");
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 24);
		Date jd1 = cal.getTime();
		java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");
		String currentTime = sdf.format(jd1);
		
		prj1.setProjectStartDate(currentTime);
		prj1.setProjectTechnology("Java");
		
		Project prj2 = new Project();		
		prj2.setProjectName("WebApp");
		prj2.setProjectCode("WA");
		cal.set(Calendar.YEAR, 2017);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DAY_OF_MONTH, 25);
		Date jd2 = cal.getTime();
		java.text.SimpleDateFormat sdf1 = new java.text.SimpleDateFormat("yyyy-MM-dd");
		String currentTime2 = sdf.format(jd2);		
		prj2.setProjectStartDate(currentTime2);	
		prj2.setProjectTechnology("Spring");
		
		service.saveProject(prj1);
		service.saveProject(prj2);
		
		List<Project> projects = service.allProjects();
		for (Project project : projects) {
			System.out.println(project);
		}
		
		service.deleteProjectByCode("WA");
		Project proj = service.findByCode("MS");
		proj.setProjectTechnology("Core Java");
		service.updateProject(proj);
		List<Project> projects1 = service.allProjects();
		for (Project project : projects1) {
			System.out.println(projects1);
		}
		
		context.close();
	}

}
