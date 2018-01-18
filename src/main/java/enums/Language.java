package enums;

public enum Language {
	HOLLYWOOD("Hollywood"),
	BOLLYWOOD("Bollywood"),
	NOT_AVALABLE("Not Available");

	private String languageValue;

	Language(String languageValue) {
		this.languageValue = languageValue;
	}

	public String getLanguage() {
		return languageValue;
	}
}
