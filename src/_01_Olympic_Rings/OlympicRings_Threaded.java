package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	/* Make A Program that uses Threads and robots to draw the Olympic rings. 
	One robot should draw one ring simultaneously with the other 4 robots. */
	
	public static void main(String[] args) {
		Robot blue = new Robot();
		Robot black = new Robot();
		Robot red = new Robot();
		Robot yellow = new Robot();
		Robot green = new Robot();
		
		blue.setSpeed(10);
		black.setSpeed(10);
		red.setSpeed(10);
		yellow.setSpeed(10);
		green.setSpeed(10);
		
		blue.penDown();
		black.penDown();
		red.penDown();
		yellow.penDown();
		green.penDown();
		
		blue.setPenColor(Color.blue);
		black.setPenColor(Color.black);
		red.setPenColor(Color.red);
		yellow.setPenColor(Color.yellow);
		green.setPenColor(Color.green);
		
		blue.
	}
	
}

