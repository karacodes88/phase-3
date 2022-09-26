package com.mindweaver.demo.view;

import com.mindweaver.demo.model.Products;
import com.mindweaver.demo.service.ProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor

public class ProductView {


    private final ProductService productService;

    //    trying to display list of products
    @GetMapping("")
    public String viewHomePage(Model model) {
        model.addAttribute("listProducts", productService.getAllProducts(10));
        return "products";
    }

    @GetMapping("/AdminUpdate")
    //    create model attribute to form data
    public String AdminUpdate(Model model) {
    Products products = new Products();
    model.addAttribute("products", products);
    return "admin";
    }
    /*@PostMapping("/saveProducts")
    public String saveProducts(@ModelAttribute("products")Products products) {
        //save products to database
        productService.saveProducts(products);
        return "redirect:/index";
    }*/
}

