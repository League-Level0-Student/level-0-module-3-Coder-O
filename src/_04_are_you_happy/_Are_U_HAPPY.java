package _04_are_you_happy;

import javax.swing.JOptionPane;

public class _Are_U_HAPPY {

	public static void main(String[] args) {
		String[] arr = {"Yes.", "No."};
		boolean happy = JOptionPane.showOptionDialog(null, "Are you happy? Please only respond with yes or no.", "", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, arr, 0) == 0;
		
		if (happy) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		} else if (JOptionPane.showOptionDialog(null, "Do you want to be happy? Please only respond with yes or no.", "", JOptionPane.CLOSED_OPTION, JOptionPane.ERROR_MESSAGE, null, arr, 0) == 0) {
			JOptionPane.showMessageDialog(null, "Change something.");
		} else {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you are doing.");
		}
	}
}
