package _05_horoscope;

import javax.swing.JOptionPane;

public class _05_horoscope_2_RETHOUGHT {

	public static void main(String[] args) {
		
		String userStarSign = JOptionPane.showInputDialog("What is your star sign (Horoscope)?");
		
		if (userStarSign.equalsIgnoreCase("Aries") || userStarSign.equalsIgnoreCase("Taurus") || userStarSign.equalsIgnoreCase("Gemini") || userStarSign.equalsIgnoreCase("Cancer") || 
				userStarSign.equalsIgnoreCase("Leo") || userStarSign.equalsIgnoreCase("Virgo") || userStarSign.equalsIgnoreCase("Libra") || userStarSign.equalsIgnoreCase("Scorpio") || 
				userStarSign.equalsIgnoreCase("Sagittarius") || userStarSign.equalsIgnoreCase("Capricorn") || userStarSign.equalsIgnoreCase("Aquarius") || userStarSign.equalsIgnoreCase("Pisces")) {
			
			JOptionPane.showMessageDialog(null, "Your horoscope is... \nFound at https://www.horoscopedates.com/daily-horoscope/" + userStarSign.toLowerCase() + "/! (Without the last exlimation point.)");
		
		} else {
			
			JOptionPane.showMessageDialog(null, "That's not a star sign!");
			
		}
		
	}

}
