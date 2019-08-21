package lab.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Application {

	public static void main(String[] args) {
		try {
			/*
			 * System.out.println("Current Locale: " + Locale.getDefault()); ResourceBundle
			 * mybundle = ResourceBundle.getBundle("MyLabels");
			 * System.out.println("Say how are you in US English: " +
			 * mybundle.getString("how_are_you"));
			 * 
			 * Locale.setDefault(new Locale("ms_MY")); System.out.println("Current Locale: "
			 * + Locale.getDefault());
			 * 
			 * mybundle = ResourceBundle.getBundle("MyLabels");
			 * System.out.println("Say how are you in Malaysian Malaya language: " +
			 * mybundle.getString("how_are_you"));
			 * 
			 * Locale.setDefault(Locale.getDefault()); MyResourceBundle myResourceBundle =
			 * new MyResourceBundle();
			 * 
			 * System.out.println(myResourceBundle.getText("en_IN", "how_are_you"));
			 */

			ResourceBundles rs = new ResourceBundles();
			System.out.println(rs.getText("en_IN", "how_are_you"));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
