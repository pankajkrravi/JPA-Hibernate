package com.goomo.JPA_Demo;

public class Book {

	long id;
	String name;
	String auther;

	public Book(long id, String name, String auther) {
		super();
		this.id = id;
		this.name = name;
		this.auther = auther;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", auther=" + auther + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuther() {
		return auther;
	}

	public void setAuther(String auther) {
		this.auther = auther;
	}

}
