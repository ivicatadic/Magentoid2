/*
 * Magentoid2
 * 
 * @author	Ivica Tadić <ivica.tadic@ymail.com>
 */
package com.ivica.magentoid.configuration.ds;

import java.util.List;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementList;
import org.simpleframework.xml.Root;

@Root(name = "configuration", strict = false)
public class ConfigurationDS {

	@Element(name = "body", required = false)
	private BodyDS body;

	@Element(name = "itemActions", required = false)
	private ItemActionsDS itemActions;

	@ElementList(name = "fonts", required = false)
	private List<FontDS> fonts;

	@Element(name = "navigationBar", required = false)
	private NavigationBarDS navigationBar;

	@Element(name = "categoryItem", required = false)
	private CategoryItemDS categoryItem;

	@Element(name = "defaultCheckout", required = false)
	private DefaultCheckoutDS defaultCheckout;

	@ElementList(name = "content", required = false)
	private List<PageDS> content;

	@ElementList(name = "tabBar", required = false)
	private List<TabDS> tabBar;

	@Element(name = "general", required = false)
	private GeneralDS general;

	@Element(name = "paypal", required = false)
	private PaypalDS paypal;

	public void setBody(BodyDS body) {
		this.body = body;
	}

	public BodyDS getBody() {
		return body;
	}

	public void setItemActions(ItemActionsDS itemActions) {
		this.itemActions = itemActions;
	}

	public ItemActionsDS getItemActions() {
		return itemActions;
	}

	public void setFonts(List<FontDS> fonts) {
		this.fonts = fonts;
	}

	public List<FontDS> getFonts() {
		return fonts;
	}

	public void setNavigationBar(NavigationBarDS navigationBar) {
		this.navigationBar = navigationBar;
	}

	public NavigationBarDS getNavigationBar() {
		return navigationBar;
	}

	public void setCategoryItem(CategoryItemDS categoryItem) {
		this.categoryItem = categoryItem;
	}

	public CategoryItemDS getCategoryItem() {
		return categoryItem;
	}

	public void setDefaultCheckout(DefaultCheckoutDS defaultCheckout) {
		this.defaultCheckout = defaultCheckout;
	}

	public DefaultCheckoutDS getDefaultCheckout() {
		return defaultCheckout;
	}

	public void setContent(List<PageDS> content) {
		this.content = content;
	}

	public List<PageDS> getContent() {
		return content;
	}

	public void setTabBar(List<TabDS> tabBar) {
		this.tabBar = tabBar;
	}

	public List<TabDS> getTabBar() {
		return tabBar;
	}

	public void setGeneral(GeneralDS general) {
		this.general = general;
	}

	public GeneralDS getGeneral() {
		return general;
	}

	public void setPaypal(PaypalDS paypal) {
		this.paypal = paypal;
	}

	public PaypalDS getPaypal() {
		return paypal;
	}

}
