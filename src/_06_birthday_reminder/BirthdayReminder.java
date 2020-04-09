
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package _06_birthday_reminder;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "October 2nd";
		String dadsBirthday = "Error: I do not know my Dad's birhtday. This is a problem. I think it is around june 26th?";
		String myBirthday = "November 7th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String[] arr = {"Mom's", "Dad's", "Yours"};
		String[] are = {momsBirthday, dadsBirthday, myBirthday};
		int dessiredBirthday = JOptionPane.showOptionDialog(null, "Assuming you are me, who's birthday do you want to know?", "", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, arr, 0);
		// 3. Print out what the user typed
		System.out.println(dessiredBirthday);
		// 4. if user asked for "mom"
		if (dessiredBirthday == 2 || dessiredBirthday == 1 || dessiredBirthday == 0) {
			//print mom's birthday
		
		// 5. if user asked for "dad"
			// print dad's birthday
		
		// 6. if user asked for your name
			// print myBirthday
		
			System.out.println(are[dessiredBirthday]);
		} else {
		//7. otherwise print "Sorry, i don't remember that person's birthday!"
			System.out.println("How did we get here?");
		}

	} 
}
