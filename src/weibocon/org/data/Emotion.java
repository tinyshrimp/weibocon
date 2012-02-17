package weibocon.org.data;

import android.graphics.Bitmap;

public class Emotion {
	private Long Id;
	private Bitmap Icon;
	private String Phrase;
	private String Value;
	private String Url;
	/**
	 * @return the id
	 */
	public Long getId() {
		return Id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		Id = id;
	}
	/**
	 * @return the icon
	 */
	public Bitmap getIcon() {
		return Icon;
	}
	/**
	 * @param icon the icon to set
	 */
	public void setIcon(Bitmap icon) {
		
		Icon = icon;
	}
	/**
	 * @return the phrase
	 */
	public String getPhrase() {
		return Phrase;
	}
	/**
	 * @param phrase the phrase to set
	 */
	public void setPhrase(String phrase) {
		Phrase = phrase;
	}
	/**
	 * @return the value
	 */
	public String getValue() {
		return Value;
	}
	/**
	 * @param value the value to set
	 */
	public void setValue(String value) {
		Value = value;
	}
	/**
	 * @return the url
	 */
	public String getUrl() {
		return Url;
	}
	/**
	 * @param url the url to set
	 */
	public void setUrl(String url) {
		Url = url;
	}

}
