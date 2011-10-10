/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.Root;

@Root(name = "body", strict = false)
public class BodyDS {

	@Element(name = "backgroundColor", required = false)
	private String backgroundColor;

	@Element(name = "scrollBackgroundColor", required = false)
	private String scrollBackgroundColor;

	@Element(name = "bannerAndroidImage", required = false)
	private String bannerAndroidImage;

	@Element(name = "backgroundAndroidLandscapeImage", required = false)
	private String backgroundAndroidLandscapeImage;

	@Element(name = "backgroundAndroidPortraitImage", required = false)
	private String backgroundAndroidPortraitImage;

	@Element(name = "primaryColor", required = false)
	private String primaryColor;

	@Element(name = "secondaryColor", required = false)
	private String secondaryColor;

	public void setBackgroundColor(String backgroundColor) {
		this.backgroundColor = backgroundColor;
	}

	public String getBackgroundColor() {
		return backgroundColor;
	}

	public void setScrollBackgroundColor(String scrollBackgroundColor) {
		this.scrollBackgroundColor = scrollBackgroundColor;
	}

	public String getScrollBackgroundColor() {
		return scrollBackgroundColor;
	}

	public void setBannerAndroidImage(String bannerAndroidImage) {
		this.bannerAndroidImage = bannerAndroidImage;
	}

	public String getBannerAndroidImage() {
		return bannerAndroidImage;
	}

	public void setBackgroundAndroidLandscapeImage(
			String backgroundAndroidLandscapeImage) {
		this.backgroundAndroidLandscapeImage = backgroundAndroidLandscapeImage;
	}

	public String getBackgroundAndroidLandscapeImage() {
		return backgroundAndroidLandscapeImage;
	}

	public void setBackgroundAndroidPortraitImage(
			String backgroundAndroidPortraitImage) {
		this.backgroundAndroidPortraitImage = backgroundAndroidPortraitImage;
	}

	public String getBackgroundAndroidPortraitImage() {
		return backgroundAndroidPortraitImage;
	}

	public void setPrimaryColor(String primaryColor) {
		this.primaryColor = primaryColor;
	}

	public String getPrimaryColor() {
		return primaryColor;
	}

	public void setSecondaryColor(String secondaryColor) {
		this.secondaryColor = secondaryColor;
	}

	public String getSecondaryColor() {
		return secondaryColor;
	}

}