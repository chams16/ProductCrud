package com.talan.ZombirLand.Services.Impl;

import com.talan.ZombirLand.Repository.ProductRepository;
import com.talan.ZombirLand.Services.ProductService;
import com.talan.ZombirLand.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public void deleteProduct(Long id){
        productRepository.delete(productRepository.findById(id).get());
    }

    public Product updateProduct(Product product){
        Product productToUpdate = productRepository.findById(product.getId()).get();
        return productRepository.saveAndFlush(product);
    }
}
