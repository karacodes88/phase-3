package com.mindweaver.demo.service;

import com.mindweaver.demo.model.Products;
import com.mindweaver.demo.repository.ProductsRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.List;
@AllArgsConstructor
@Service

public class ProductService {

    private final ProductsRepository productRepo;
    public Collection<Products> getAllProducts(int limit) {
        return productRepo.findAll(PageRequest.of(0, limit)).toList();
    }
}
//SAVE ALL CRUD HERE?
