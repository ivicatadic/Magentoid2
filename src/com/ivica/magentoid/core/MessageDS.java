/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.core;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name="message",strict=false)
public class MessageDS {
	
	@Element(name="status",required=false)
	private String status;
	
	@Element(name="text",required=false)
	private String text;
	
	@Element(name="order_id",required=false)
	private String orderId;
	
	@Element(name="is_loggined",required=false)
	private String isLoggined;

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setIsLoggined(String isLoggined) {
		this.isLoggined = isLoggined;
	}

	public String getIsLoggined() {
		return isLoggined;
	}

}
