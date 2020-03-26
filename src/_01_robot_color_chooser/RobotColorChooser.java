//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;

public class RobotColorChooser {
	public static void main(String[] args) {
		Color color = new Color(0,0,0);
		//1. Create a new Robot
		Robot robo = new Robot();
		robo.hide();
		Random ran = new Random();
		//3. Ask the user what color they would like the robot to draw
		String colorChosen = "";
		Boolean wrongAwnser = true;
		Boolean Continue = true;
		while (Continue) {
			wrongAwnser = true;
			while (wrongAwnser) {
				colorChosen = JOptionPane.showInputDialog("Which color do you prefer, red, green, or blue? Please only enter the name of the color with no extra cheracters.");
			//5. Use an if/else statement to set the pen color that the user requested
			
				wrongAwnser = false;
				if (colorChosen.equalsIgnoreCase("Red")) {
					 color = new Color(250, 0, 0);
				} else if (colorChosen.equalsIgnoreCase("Green")) {
					color = new Color(0, 250, 0);
				} else if (colorChosen.equalsIgnoreCase("Blue")) {
					color = new Color(0, 0, 250);
				} else if (colorChosen.equalsIgnoreCase("")) {
					color = new Color(ran.nextInt(256), ran.nextInt(256), ran.nextInt(256));
				} else if (colorChosen.equalsIgnoreCase("quit")) {
					Continue = false;
				} else {
					JOptionPane.showMessageDialog(null, "Please chose one of the given colors!");
					wrongAwnser = true;
				}
			}
			
			robo.setPenColor(color);
	        //6. If the user doesn’t enter anything, choose a random color
			
	        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
			
			//4. Set the pen width to 10
			robo.setPenWidth(10);
		    //2. Make the robot draw a shape (this will take more than one line of code)
			robo.penDown();
			robo.setSpeed(300);
			for (int i = 0; i < 4; i++) {
				robo.setAngle(i*90);
				robo.move(300);
			}
		}
	}
}
