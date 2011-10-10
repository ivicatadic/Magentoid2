/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import org.simpleframework.xml.Attribute;
import org.simpleframework.xml.Root;

@Root(name = "font", strict = false)
public class FontDS {

	@Attribute(name = "label")
	private String label;

	@Attribute(name = "name")
	private String name;

	@Attribute(name = "size")
	private Integer size;

	@Attribute(name = "color")
	private String color;

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLabel() {
		return label;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public Integer getSize() {
		return size;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor() {
		return color;
	}

}