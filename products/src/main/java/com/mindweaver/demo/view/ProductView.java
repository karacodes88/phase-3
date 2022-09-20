package com.mindweaver.demo.view;

import com.mindweaver.demo.service.ProductService;
import com.mindweaver.demo.service.ProductServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/products")
@RequiredArgsConstructor

public class ProductView {


      private ProductServiceImpl productService;

//    trying to display list of products
    @GetMapping("/index")
    public String viewHomePage(Model model){
     model.addAttribute("listProducts", productService.getAllProducts());
     return "products";
    }
}
