package pl.szymonchowaniec.webstore.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.szymonchowaniec.webstore.domain.Product;
import pl.szymonchowaniec.webstore.exception.ProductNotFoundException;
import pl.szymonchowaniec.webstore.service.ProductService;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


public class ProductIdValidator implements ConstraintValidator<ProductId, String>{
	
	@Autowired
	private ProductService productService;

	public void initialize(ProductId constraintAnnotation) {
		//  celowo pozostawione puste; w tym miejscu nale�y zainicjowa� adnotacj� ograniczaj�c� do sensownych domy�lnych w
	}

	public boolean isValid(String value, ConstraintValidatorContext context) {
		Product product;
		try {
			product = productService.getProductById(value);
			
		} catch (ProductNotFoundException e) {
			return true;
		}
		
		if(product!= null) {
			return false;
		}
		
		return true;
	}
	
}
