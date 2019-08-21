package lab.internationalization;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class ResourceBundles {
	private Map<String, ResourceBundle> localResourceBundles;
	private ResourceBundle defaultResource;

	public ResourceBundles() {
		localResourceBundles = new HashMap<>();
		for (LocaleConfig config : LocaleConfig.values()) {
			ResourceBundle resourceFile = ResourceBundle.getBundle("MyLabels", config.getLocale());
			localResourceBundles.put(config.getLocale().toString(), resourceFile);
		}

		// Load Default Resource based on DB Value
	}

	public String getText(String locale, String key) {
		ResourceBundle resourceByLocale = localResourceBundles.get(locale);
		try {
			if (resourceByLocale == null) {
				// Load from default bundle
			}
		} catch (Exception e) {
			// Load from default bundle
		}

		return resourceByLocale.getString(key);

	}

}
