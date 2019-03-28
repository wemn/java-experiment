package com.example.entity;

public class Teacher extends Person {
	public static final String LECTURE = "讲师";
	public static final String PROFESSOR = "教授";
	private String title;
    private int publications;

    public Teacher(int id, String name, int publications, String title) {
        super(id, name);
        this.title = title;
        this.publications = publications;
    }

    public int getPublications() {
        return publications;
    }

    public void setPublications(int publications) {
        this.publications = publications;
    }

    public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}


}
