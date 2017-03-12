package com.vish.springhibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PROJECT")
public class Project {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pid;
	
	@Column(name="PROJECT_NAME")
	private String projectName;
	
	@Column(name= "PROJECT_CODE")
	private String projectCode;
	
	@Column(name="PROJECT_START_DATE")
	private String projectStartDate;
	
	@Column(name="PROJECT_TECHNOLOGY")
	private String projectTechnology;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getProjectCode() {
		return projectCode;
	}

	public void setProjectCode(String projectCode) {
		this.projectCode = projectCode;
	}

	public String getProjectStartDate() {
		return projectStartDate;
	}

	public void setProjectStartDate(String projectStartDate) {
		this.projectStartDate = projectStartDate;
	}

	public String getProjectTechnology() {
		return projectTechnology;
	}

	public void setProjectTechnology(String projectTechnology) {
		this.projectTechnology = projectTechnology;
	}
	
	@Override
    public String toString() {
        return "Project Details [Project id=" + pid + ", Project Name=" + projectName+ "("+projectCode+")" + ", Project Technology=" + projectTechnology +  ", Project Start Date=" + projectStartDate +"]";
    }	
}
