package controller;

import model.Logic;
import processing.core.PApplet;

public class ControllerMain {
	private Logic logic;
	private PApplet app;

	public ControllerMain(String[] text1, String[] text2, PApplet app) {
		logic = new Logic(text1, text2, app);
	}

	public void drawDogs() {
		logic.drawDogs();
	}

	public void sort(char key) {
		logic.sortDogs(key);
		
	}

}
