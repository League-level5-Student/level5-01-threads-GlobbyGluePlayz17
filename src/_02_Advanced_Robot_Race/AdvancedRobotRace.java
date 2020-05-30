package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	
	// 1. make a main method
		public static void main(String[] args) {
			int randrobs = new Random().nextInt(10);

			// 2. create an array of 5 robots.
			Robot[] robs = new Robot[5];
			// 3. use a for loop to initialize th0e robots.
			for (int i = 0; i < robs.length; i++) {
				robs[i] = new Robot();
			}
			// 4. make each robot start at the bottom of the screen, side by side, facing up
			for (int i = 0; i < robs.length; i++) {
				robs[i].moveTo(100 * i + 100, 500);
				robs[i].setAngle(0);
				robs[i].setSpeed(2);
			}
			// 5. use another for loop to iterate through the array and make each robot move a random amount less than 50
			boolean finished = false;
			
			while (!finished) {
				for (int i = 0; i < robs.length; i++) {
					int randistance = new Random().nextInt(50);
					robs[i].move(randistance);
						if (robs[i].getY() <= 100) {
							finished = true;
						}
				} 
			} 
			for (int i = 0; i < robs.length; i++) {
				System.out.println(robs[i].getY());
			}
			
			// 6. use a while loop to repeat step 5 until a robot has reached the top of the screen.
			
			
			// 7. declare that robot the winner and throw it a party!
			for (int i = 0; i < robs.length; i++) {
				if (robs[i].getY() <= 100) {
					System.out.println("Robot #" + i + " has won! Throw a party!");
				}
			}
			// 8. try different races with different amounts of robots.
			
			// 9. make the robots race around a circular track.
				
		}
}
