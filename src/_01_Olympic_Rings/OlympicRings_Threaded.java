package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	/* Make A Program that uses Threads and robots to draw the Olympic rings. 
	One robot should draw one ring simultaneously with the other 4 robots. */
	
	public static void main(String[] args) {
		Robot blue = new Robot(150, 300);
		Robot black = new Robot(350, 300);
		Robot red = new Robot(550, 300);
		Robot yellow = new Robot(250, 500);
		Robot green = new Robot(450, 500);
		
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
		
		blue.hide();
		black.hide();
		red.hide();
		yellow.hide();
		green.hide();
		
		Thread BLUE = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				blue.move(25);
				blue.turn(10);
			}
			
		});
		
		Thread BLACK = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				black.move(25);
				black.turn(10);
			}
			
		});
		
		Thread RED = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				red.move(25);
				red.turn(10);
			}
			
		});
		
		Thread YELLOW = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				yellow.move(25);
				yellow.turn(10);
			}
			
		});
		
		Thread GREEN = new Thread(()-> {
			for (int i = 0; i < 36; i++) {
				green.move(25);
				green.turn(10);
			}
			
		});
		
		BLUE.start();
		BLACK.start();
		RED.start();
		YELLOW.start();
		GREEN.start();
	}
	
}

