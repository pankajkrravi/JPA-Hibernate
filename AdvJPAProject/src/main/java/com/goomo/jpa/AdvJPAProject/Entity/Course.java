package com.goomo.jpa.AdvJPAProject.Entity;


import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
//@Table(name="CourseDetails")
//@NamedQuery(name="query_get_all_courses", query = "select c from Course c ")
@NamedQueries(value= {
		@NamedQuery(name="query_get_all_courses",query="select c from Course c"),
		@NamedQuery(name="query_get_EE",query="select c from Course c where name like '%EE'")
})
public class Course {
	public Course() { 
	}

	@Id
	@GeneratedValue
	private Long id;
	// @Column(name="fullname",nullable=false)
	private String name;
	@UpdateTimestamp
	private LocalDate lastUpdatedDate;
	@CreationTimestamp
	private LocalDate createdDate;

	public Course(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + "]";
	}

}
