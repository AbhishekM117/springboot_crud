package com.abhishek.crud.example.controller;


import com.abhishek.crud.example.entity.Product;
import com.abhishek.crud.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductService service;

    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @PostMapping("/addProductList")
    public List<Product> addProductList(@RequestBody List<Product> product){
        return service.saveProductList(product);
    }

    @GetMapping("/getAllProducts")
    public List<Product> findAllProducts(){
        return service.getProducts();
    }

    @GetMapping("/getProductById/{id}")
    public Product findProductById(@PathVariable int id){
        return service.getProductById(id);
    }

    @GetMapping("/getProductByName/{name}")
    public Product findProductByName(@PathVariable String name){
        return service.getProductByName(name);
    }

    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product){
        return service.updateProduct(product);
    }

    @DeleteMapping("/deleteProductById/{id}")
    public String deleteProductById(@PathVariable int id){
        return service.deleteProduct(id);
    }

}
