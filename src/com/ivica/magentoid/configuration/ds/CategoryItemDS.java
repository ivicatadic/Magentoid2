/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "categoryItem", strict = false)
public class CategoryItemDS {

	@Element(name = "backgroundColor", required = false)
	private String backgroundColor;

	@Element(name = "tintColor", required = false)
	private String tintColor;

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setTintColor(String tintColor) {
		this.tintColor = tintColor;
	}

	public String getTintColor() {
		return tintColor;
	}

}
