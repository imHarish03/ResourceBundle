package lab.internationalization;

import java.util.Locale;

public enum LocaleConfig {
	ENGLISH_US("en", "US"), ENGLISH("en", "IN"), CUSTOM("ms", "MY");

	private String language;
	private String country;

	LocaleConfig(String language, String country) {
		this.language = language;
		this.country = country;
	}

	public Locale getLocale() {
		return new Locale(language, country);
	}
}
