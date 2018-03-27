package pl.szymonchowaniec.webstore.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;


public class CartItemTest {
	
	private CartItem cartItem;

	@Before
	public void setup() {
		cartItem = new CartItem();
	}
	
	@Test
	public void cartItem_total_price_should_be_eaual_to_product_unit_price_in_case_of_single_quantity() {
		//Ustaw
		Product iphone = new Product("P1234","iPhone 5s", new BigDecimal(500));
		cartItem.setProduct(iphone);
		
		//Wykonaj
		BigDecimal totalPrice = cartItem.getTotalPrice();
		
		//Por�wnaj
		Assert.assertEquals(iphone.getUnitPrice(), totalPrice);
	}
}
