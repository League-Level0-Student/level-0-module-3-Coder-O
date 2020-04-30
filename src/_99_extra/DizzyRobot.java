//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _99_extra;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class DizzyRobot {
	static Robot robot = new Robot();
	public static void main(String[] args) {
		
		String[] options = {"10", "9", "8", "7", "6", "5", "4", "3", "2", "1"};
		 // 2. Ask the user how dizzy you want the robot from 1-10, then spin that number of times.
		int numberOfSpins = 10 - JOptionPane.showOptionDialog(null, "How dizzy make robot?                                                                                                                                                                           ", " ", JOptionPane.DEFAULT_OPTION, JOptionPane.DEFAULT_OPTION, null, options, 9);
 // 1. Use the dance method to make the robot spin.
		robot.setSpeed(10);
		dance(numberOfSpins);

	

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			robot.turn(360);
		}
	}
}

