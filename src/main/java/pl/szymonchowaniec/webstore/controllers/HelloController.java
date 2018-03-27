package pl.szymonchowaniec.webstore.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.szymonchowaniec.webstore.domain.Product;

import java.math.BigDecimal;

@RestController
public class HelloController {

    Product product = new Product("4", "coś", new BigDecimal(5));
    Product product1 = new Product("4354", "c324oś", new BigDecimal(5));
    Product product2 = new Product("4444", "c324oś", new BigDecimal(5));

    @RequestMapping(value = "/hello", method = RequestMethod.GET, produces = "application/json")
    public ResponseEntity<Product> hello(Model model){
        model.addAttribute(product);
        model.addAttribute(product1);
        model.addAttribute(product2);
        return new ResponseEntity(model, HttpStatus.OK);
    }
}
