package com.mindweaver.demo.service;

import com.mindweaver.demo.model.Products;
import com.mindweaver.demo.repository.ProductsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {


    private ProductsRepository productsRepository;


    //call it from here
    public List<Products> getAllProducts() {
        return productsRepository.findAll();
    }
}
