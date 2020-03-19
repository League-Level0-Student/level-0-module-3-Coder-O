//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _01_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		Color color = new Color(0,0,0);
		//1. Create a new Robot
		Robot robo = new Robot();
		//3. Ask the user what color they would like the robot to draw
		String colorChosen = JOptionPane.showInputDialog("Which color do you prefer, red, green, or blue?");
		
		//5. Use an if/else statement to set the pen color that the user requested
		if (colorChosen.equalsIgnoreCase("Red")) {
			 color = new Color(250, 0, 0);
		} else if (colorChosen.equalsIgnoreCase("Blue")) {
			color = new Color(0, 250, 0);
		} else if (colorChosen.equalsIgnoreCase("Green")) {
			color = new Color(0, 0, 250);
		} else {
			
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
		robo.hide();
	}
}
