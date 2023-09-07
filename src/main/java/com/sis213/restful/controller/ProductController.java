package com.sis213.restful.controller;

import com.sis213.restful.model.Product;
import com.sis213.restful.model.ProductID;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
public class ProductController {

    
    @GetMapping("/")
    public String hello(){
        return "Hello World";
    }
    /*
    @PostMapping("/product")
    public String createProduct(@RequestBody final Product product){
        System.out.println(product);
        return "123456";
    }
     */
    @PostMapping("/product")
    public ResponseEntity createProduct(@RequestBody final Product product){
        System.out.println(product);
        ProductID result = new ProductID(UUID.randomUUID().toString());
        return ResponseEntity.status(HttpStatus.CREATED).contentType(MediaType.APPLICATION_JSON).body(result);
    }

    @GetMapping("/product")
    public List<Product> getAllProducts(){
        List<Product> result = new ArrayList<>();
        result.add(new Product("1","Product 1",new BigDecimal("258.33")));
        result.add(new Product("2","Product 2",new BigDecimal("999.11")));
        result.add(new Product("3","Product 3",new BigDecimal("758.64")));
        return result;
    }

    @GetMapping("/product/{id}")
    public Product getProductById(@PathVariable final String id){
        System.out.println();
        return new Product("888","Returning a single product", new BigDecimal("458.44"));
    }

    @PatchMapping("/product")
    public void patchProduct(@RequestBody final Product product){
        System.out.println(product);
    }

    @DeleteMapping ("/product/{id}")
    public void deleteProduct(@RequestBody final String id){
        System.out.println(id);
    }
}
