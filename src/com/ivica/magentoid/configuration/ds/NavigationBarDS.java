/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "navigationBar", strict = false)
public class NavigationBarDS {

	@Element(name = "icon", required = false)
	private String icon;

	@Element(name = "tintColor", required = false)
	private String tintColor;

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getIcon() {
		return icon;
	}

	public void setTintColor(String tintColor) {
		this.tintColor = tintColor;
	}

	public String getTintColor() {
		return tintColor;
	}

}
