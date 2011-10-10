/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "general", strict = false)
public class GeneralDS {

	@Element(name = "updateTimeUTC", required = false)
	private String updateTimeUTC;

	@Element(name = "browsingMode", required = false)
	private String browsingMode;

	@Element(name = "currencyCode", required = false)
	private String currencyCode;

	@Element(name = "secureBaseUrl", required = false)
	private String secureBaseUrl;

	@Element(name = "emailToFriendMaxRecepients", required = false)
	private Integer emailToFriendMaxRecepients;

	@Element(name = "emailAllowGuest", required = false)
	private Integer emailAllowGuest;

	@Element(name = "primaryStoreLang", required = false)
	private String primaryStoreLang;

	@Element(name = "magentoVersion", required = false)
	private String magentoVersion;

	@Element(name = "copyright", required = false)
	private String copyright;

	@Element(name = "isAllowedGuestCheckout", required = false)
	private Integer isAllowedGuestCheckout;

	@Element(name = "wishlistEnable", required = false)
	private Integer wishlistEnable;

	public void setUpdateTimeUTC(String updateTimeUTC) {
		this.updateTimeUTC = updateTimeUTC;
	}

	public String getUpdateTimeUTC() {
		return updateTimeUTC;
	}

	public void setBrowsingMode(String browsingMode) {
		this.browsingMode = browsingMode;
	}

	public String getBrowsingMode() {
		return browsingMode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setSecureBaseUrl(String secureBaseUrl) {
		this.secureBaseUrl = secureBaseUrl;
	}

	public String getSecureBaseUrl() {
		return secureBaseUrl;
	}

	public void setEmailToFriendMaxRecepients(Integer emailToFriendMaxRecepients) {
		this.emailToFriendMaxRecepients = emailToFriendMaxRecepients;
	}

	public Integer getEmailToFriendMaxRecepients() {
		return emailToFriendMaxRecepients;
	}

	public void setEmailAllowGuest(Integer emailAllowGuest) {
		this.emailAllowGuest = emailAllowGuest;
	}

	public Integer getEmailAllowGuest() {
		return emailAllowGuest;
	}

	public void setPrimaryStoreLang(String primaryStoreLang) {
		this.primaryStoreLang = primaryStoreLang;
	}

	public String getPrimaryStoreLang() {
		return primaryStoreLang;
	}

	public void setMagentoVersion(String magentoVersion) {
		this.magentoVersion = magentoVersion;
	}

	public String getMagentoVersion() {
		return magentoVersion;
	}

	public void setCopyright(String copyright) {
		this.copyright = copyright;
	}

	public String getCopyright() {
		return copyright;
	}

	public void setIsAllowedGuestCheckout(Integer isAllowedGuestCheckout) {
		this.isAllowedGuestCheckout = isAllowedGuestCheckout;
	}

	public Integer getIsAllowedGuestCheckout() {
		return isAllowedGuestCheckout;
	}

	public void setWishlistEnable(Integer wishlistEnable) {
		this.wishlistEnable = wishlistEnable;
	}

	public Integer getWishlistEnable() {
		return wishlistEnable;
	}

}
