package model;

import java.util.ArrayList;

import processing.core.PApplet;

public class Logic {

	private PApplet app;

	private String[] text1;
	private String[] text2;
	private ArrayList<Dog> dogs;

	public Logic(String[] text1, String[] text2, PApplet app) {
		this.text1 = text1;
		this.text2 = text2;
		this.app = app;
		dogs = new ArrayList<Dog>();

	}

	public void combineLists() {
		for (int i = 0; i < text1.length; i++) {
			String[] info1 = text1[i].split(" ");
			int id = Integer.parseInt(info1[0]);
			String name = info1[1];
			
			for (int j = 0; j < text2.length; j++) {
				String[]info2 = text2[i].split(" ");
				int id1 = Integer.parseInt(info2 [0]);
				String breed = info2[1];
				String date = info2[2];
				
				if (id == id1) {
					Dog dog = new Dog (id,date,name,breed,app);
					dogs.add(dog);
					
				}
			}
			
			
		}
	}

}
