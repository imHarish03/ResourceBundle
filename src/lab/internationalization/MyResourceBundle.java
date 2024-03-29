package lab.internationalization;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class MyResourceBundle {
	private Map<String, Map<String, String>> localeResources;

	public MyResourceBundle() {
		localeResources = new HashMap<>();
		for (LocaleConfig config : LocaleConfig.values()) {
			Map<String, String> resources = new HashMap<>();

			ResourceBundle systemTexts = ResourceBundle.getBundle("MyLabels", config.getLocale());
			Enumeration systemKeys = systemTexts.getKeys();

			while (systemKeys.hasMoreElements()) {
				String key = (String) systemKeys.nextElement();
				resources.put(key, systemTexts.getString(key));
			}

			System.out.println(config.getLocale());
			localeResources.put(config.getLocale().toString(), resources);
		}

	}

	public String getText(String locale, String key) {
		String text = null;

		text = localeResources.get(locale).get(key);

		if (text == null) {
			String errorMessage = "Key: " + key + " does not exist for locale " + locale.toString();
			throw new MissingResourceException(errorMessage, this.getClass().getName(), key);
		}

		return text;
	}
}
