package model;

import java.util.Date;

import processing.core.PApplet;

public class Dog {

	private int id, age;
	private String name, breed, date;
	private PApplet app;
	private Date birthDate;

	public Dog(int id, String date, String name, String breed, PApplet app) {
		this.date = date;
		this.app = app;
		this.breed = breed;
		this.id = id;
		this.name = name;

	}

	public void draw(int posY) {
		app.text(0, 10, posY);

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}

}
