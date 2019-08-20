package lab.internationalization;

import java.util.Locale;
import java.util.ResourceBundle;

public class Application {

	public static void main(String[] args) {

		System.out.println("Current Locale: " + Locale.getDefault());
		ResourceBundle mybundle = ResourceBundle.getBundle("MyLabels");

		System.out.println("Say how are you in US English: " + mybundle.getString("how_are_you"));

		Locale.setDefault(new Locale("ms_MY"));
		System.out.println("Current Locale: " + Locale.getDefault());
		mybundle = ResourceBundle.getBundle("MyLabels");
		System.out.println("Say how are you in Malaysian Malaya language: " + mybundle.getString("how_are_you"));

		try {
			Locale locale = new Locale("ms_MY");

			MyResourceBundle myResourceBundle = new MyResourceBundle();

			System.out.println(myResourceBundle.getText(locale, "PERSON_3"));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
