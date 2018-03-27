package pl.szymonchowaniec.webstore.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import pl.szymonchowaniec.webstore.domain.Product;

import java.math.BigDecimal;

@Component
public class UnitsInStockValidator implements Validator {

	public boolean supports(Class<?> clazz) {
        return Product.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		Product product = (Product) target;

		if(product.getUnitPrice()!= null && new BigDecimal(10000).compareTo(product.getUnitPrice())<=0 && product.getUnitsInStock()>99) {
			errors.rejectValue("unitsInStock", "pl.szymonchowaniec.webstore.validator.UnitsInStockValidator.message");
		}
	}

}
