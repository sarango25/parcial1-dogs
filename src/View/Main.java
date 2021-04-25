package view;

import view.Main;
import controller.ControllerMain;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {

	ControllerMain controllerMain;
	
	private String[] text1;
	private String[] text2;
	PImage screen;

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
		screen = loadImage("Images/Interface.png");
		
		controllerMain = new ControllerMain(text1,text2,this);

	}

	public void draw() {
		background(0);
		image(screen,0,0);
		textSize(16);
		controllerMain.drawDogs();
		text(mouseX+","+mouseY,mouseX,mouseY);
		
	}
	
	

}
