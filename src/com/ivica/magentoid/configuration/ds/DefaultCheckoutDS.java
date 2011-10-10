/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "defaultCheckout", strict = false)
public class DefaultCheckoutDS {

	@Element(name = "isActive", required = false)
	private String isActive;

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getIsActive() {
		return isActive;
	}

}
