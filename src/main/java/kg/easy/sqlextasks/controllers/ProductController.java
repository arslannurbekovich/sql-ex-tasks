package kg.easy.sqlextasks.controllers;

import kg.easy.sqlextasks.models.Product;
import kg.easy.sqlextasks.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;
    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Product> findAll(){
        return productService.findAll();
    }
}
