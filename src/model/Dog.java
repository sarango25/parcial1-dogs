package model;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import processing.core.PApplet;
import processing.core.PConstants;

public class Dog implements Comparable<Dog>{

	private int id, age;
	private String name, breed, date;
	private PApplet app;
	private LocalDate birthDate;

	public Dog(int id, String date, String name, String breed, PApplet app) {
		this.date = date;
		this.app = app;
		this.breed = breed;
		this.id = id;
		this.name = name;

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d-M-yyyy");
		birthDate = LocalDate.parse(date, formatter);
		LocalDate today = LocalDate.now();
		age = Period.between(birthDate,today).getYears();

	}

	public void draw(int posY) {
		app.fill(255);
		app.textAlign(PConstants.CENTER);
		app.text(id, 75, posY);
		app.text(name, 260, posY);
		app.text(breed, 436, posY);
		app.text(age, 614, posY);

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
	public int compareTo(Dog o) {
		// TODO Auto-generated method stub
		return id - o.id;
	}

	public String saveText() {
		// TODO Auto-generated method stub
		return id +" "+ name +" "+ breed +" "+ age;
	}

}
