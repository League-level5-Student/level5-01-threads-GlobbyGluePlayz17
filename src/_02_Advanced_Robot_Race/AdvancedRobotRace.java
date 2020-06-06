package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
		public static void main(String[] args) {
			Robot[] robs = new Robot[5];
						
			for (int j = 0; j < robs.length; j++) {
				robs[j] = new Robot(100*j + 100, 500);
				robs[j].setSpeed(new Random().nextInt(10));
			}
		
		Thread one = new Thread(()->robs[0].move(500));
		Thread two = new Thread(()->robs[1].move(500));
		Thread three = new Thread(()->robs[2].move(500));
		Thread four = new Thread(()->robs[3].move(500));
		Thread five = new Thread(()->robs[4].move(500));
				
				one.start();
				two.start();
				three.start();
				four.start();
				five.start();
			
			int winner = -1;	
			while (winner == -1) {
				for (int k = 0; k < robs.length; k++) {
					if (robs[k].getY() <= 100) {
						winner = k;
						break;
					}
				}
			}
			
			for (int j = 0; j < robs.length; j++) {
				robs[j].setSpeed(0);
			}
			
			robs[winner].sparkle();
			System.out.println("Robot #" + (winner+1) + " is the winner!");
			
				
		}
}
