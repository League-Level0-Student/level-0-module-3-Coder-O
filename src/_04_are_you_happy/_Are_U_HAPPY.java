package _04_are_you_happy;

import javax.swing.JOptionPane;

public class _Are_U_HAPPY {

	public static void main(String[] args) {
		String[] arr = {"Yes.", "No."};
		boolean happy = JOptionPane.showOptionDialog(null, "Are you happy? Please only respond with yes or no.", "", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, arr, 0) == 0;
		System.out.println(happy);
	}

}
