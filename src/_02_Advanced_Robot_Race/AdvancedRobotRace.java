package _02_Advanced_Robot_Race;

import java.awt.AWTException;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;


public class AdvancedRobotRace {

	// Re-do the robot race recipe from level 3 module 0. 
	// This time, use threads to make all of the robots go at the same time.
	public static void main(String[] args) {
		Robot[] robots = new Robot[5];
		for (int i = 0; i < robots.length; i++) {
				robots[i] = new Robot(200 +200*i, 700);
		}
		Thread r0 = new Thread(()-> {
			while(robots[0].getY()>0) {
				robots[0].move(new Random().nextInt(50));
			}
			JOptionPane.showMessageDialog(null, "Robot 1 wins!");
			System.exit(0);
			
		});
		Thread r1 = new Thread(()-> {
			while(robots[1].getY()>0) {
				robots[1].move(new Random().nextInt(50));
			}
			JOptionPane.showMessageDialog(null, "Robot 2 wins!");
			System.exit(0);
			
		});
		Thread r2 = new Thread(()-> {
			while(robots[2].getY()>0) {
				robots[2].move(new Random().nextInt(50));
			}
			JOptionPane.showMessageDialog(null, "Robot 3 wins!");
			System.exit(0);
			
		});
		Thread r3 = new Thread(()-> {
			while(robots[3].getY()>0) {
				robots[3].move(new Random().nextInt(50));
			}
			JOptionPane.showMessageDialog(null, "Robot 4 wins!");
			System.exit(0);
			
		});
		Thread r4 = new Thread(()-> {
			while(robots[4].getY()>0) {
				robots[4].move(new Random().nextInt(50));
			}
			JOptionPane.showMessageDialog(null, "Robot 5 wins!");
			System.exit(0);
			
		});
		r0.start();
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		
	}
	public void Race(Robot r) {
		
		
	}
}
