/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "page", strict = false)
public class PageDS {

	@Element(name = "id", required = false)
	private String id;

	@Element(name = "label", required = false)
	private String label;

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

}
