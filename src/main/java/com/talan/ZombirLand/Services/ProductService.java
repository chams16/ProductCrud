package com.talan.ZombirLand.Services;

import com.talan.ZombirLand.model.Product;

import java.util.List;

public interface ProductService {

    public Product saveProduct(Product product);

    public List<Product> getAllProduct();

    public void deleteProduct(Long id);

    public Product updateProduct(Product product);
}
