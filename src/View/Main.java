package view;

import view.Main;
import controller.ControllerMain;
import processing.core.PApplet;

public class Main extends PApplet {

	ControllerMain controllerMain;
	
	private String[] text1;
	private String[] text2;

	public Main() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		PApplet.main(Main.class.getName());
	}

	public void settings() {
		size(700, 700);

	}

	public void setup() {

		text1 = loadStrings("Data/Text1.txt");
		text2 = loadStrings("Data/Text2.txt");
		
		controllerMain = new ControllerMain(text1,text2,this);

	}

	public void draw() {
		background(0);

		
	}
	

}
