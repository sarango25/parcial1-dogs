package model;

import processing.core.PApplet;

public class Dog implements Comparable<Dog> {

	private int id, age;
	private String name, breed;
	private PApplet app;
	// private Date birthDate;

	public Dog(int id, int age, String name, String breed, PApplet app) {
		this.age = age;
		this.app = app;
		this.breed = breed;
		this.id = id;
		this.name = name;
		// this.birthDate = birthDate;
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

	@Override
	public int compareTo(Dog nextDog) {
		// TODO Auto-generated method stub
		return 0;
	}

}
