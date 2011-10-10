/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "itemActions", strict = false)
public class ItemActionsDS {

	@Element(name = "relatedProductBackgroundColor", required = false)
	private String relatedProductBackgroundColor;

	public void setRelatedProductBackgroundColor(
			String relatedProductBackgroundColor) {
		this.relatedProductBackgroundColor = relatedProductBackgroundColor;
	}

	public String getRelatedProductBackgroundColor() {
		return relatedProductBackgroundColor;
	}

}