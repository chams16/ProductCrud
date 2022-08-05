package com.talan.ZombirLand.Controller;

import com.talan.ZombirLand.Services.Impl.ProductServiceImpl;
import com.talan.ZombirLand.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductServiceImpl service;

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product){
        return service.saveProduct(product);
    }

    @GetMapping("/all")
    public List<Product> getAll(){
        return service.getAllProduct();
    }

    @DeleteMapping("/delete/{id}")
    public void deletProduct(@PathVariable Long id){
        service.deleteProduct(id);
    }


}
