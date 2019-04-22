package com.goomo.jpa.AdvJPAProject.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long id;
	private String rating;
	// @Column(nullable = false)
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Review() {
		// TODO Auto-generated constructor stub
	}

	public Review(String rating, String description) {
		this.rating = rating;
		this.description = description;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", description=" + description + "]";
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

}
