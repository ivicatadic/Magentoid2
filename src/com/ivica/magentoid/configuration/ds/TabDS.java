/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "tab", strict = false)
public class TabDS {

	@Element(name = "label", required = false)
	private String label;

	@Element(name = "image", required = false)
	private String image;

	@Element(name = "action", required = false)
	private String action;

	@Element(name = "menu", required = false)
	private Integer menu;

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getImage() {
		return image;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getAction() {
		return action;
	}

	public void setMenu(Integer menu) {
		this.menu = menu;
	}

	public Integer getMenu() {
		return menu;
	}

}
