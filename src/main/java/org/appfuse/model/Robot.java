package org.appfuse.model;

import java.util.Date;

public class Robot extends BaseObject {
	private static final long serialVersionUID = 2585185402614849107L;

	private Long id;
	private String designation;
	private Date dateOfBuild;
	private Boolean qualityCheckPassed;
	private User owner;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public Date getDateOfBuild() {
		return dateOfBuild;
	}

	public void setDateOfBuild(Date dateOfBuild) {
		this.dateOfBuild = dateOfBuild;
	}

	public Boolean getQualityCheckPassed() {
		return qualityCheckPassed;
	}

	public void setQualityCheckPassed(Boolean qualityCheckPassed) {
		this.qualityCheckPassed = qualityCheckPassed;
	}

	public User getOwner() {
		return owner;
	}

	public void setOwner(User owner) {
		this.owner = owner;
	}
}
