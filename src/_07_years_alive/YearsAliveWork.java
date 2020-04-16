package _07_years_alive;

import javax.swing.JOptionPane;

public class YearsAliveWork {

	public static void main(String[] args) {
		//int[] arr = { }; arr[i] = yearBorn+i;
		int currentYear = Integer.parseInt(JOptionPane.showInputDialog("What year is it? Please only respond using integers. (Ex: 2020)"));
		int yearBorn = Integer.parseInt(JOptionPane.showInputDialog("What year were you born in? Please only respond using integers. (Ex: 2000)"));
		int i = 0;
		int y = 5;
		String yearsLivedIn = "";
		for (;i + yearBorn <= currentYear; i++) {
			System.out.println(yearBorn+i);
			if (i + yearBorn < currentYear && y < 10) {
				yearsLivedIn = yearsLivedIn + " " + (yearBorn+i);
			} else if (i + yearBorn < currentYear) {
				yearsLivedIn = yearsLivedIn + "\n" + (yearBorn+i);
				y = 0;
			} else {
				yearsLivedIn = yearsLivedIn + " and " + (yearBorn+i);
			}
			y++;
		}
		System.out.println("You have been alive in " + i + " different years!");
		System.out.println("You have lived in the year(s)" + yearsLivedIn + "!");
		JOptionPane.showMessageDialog(null, "You have lived in the year(s) " + yearsLivedIn + 
				"!\nYou have been alive in " + i + " different years!");

	}

}
