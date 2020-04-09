package _05_horoscope;

import javax.swing.JOptionPane;

public class _05_horoscope_ {

	public static void main(String[] args) {
		String userStarSign = JOptionPane.showInputDialog("What is your star sign (Horoscope)?");
		
		if (userStarSign.equalsIgnoreCase("Aries")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/aries/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Taurus")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at http://www.horoscopedates.com/daily-horoscope/taurus/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Gemini")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/gemini/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Cancer")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/cancer/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Leo")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/leo/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Virgo")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/virgo/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Libra")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/libra/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Scorpio")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/scorpio/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Sagittarius")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/sagittarius/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Capricorn")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/capricorn/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Aquarius")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/aquarius/! (Without the last exlimation point.)");
		} else if (userStarSign.equalsIgnoreCase("Pisces")) {
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/pisces/! (Without the last exlimation point.)");
		} else {
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
		}
		
	}

}
