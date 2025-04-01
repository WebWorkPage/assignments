package com.example.Spring_Ioc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Spring_Ioc.model.Product;
import com.example.Spring_Ioc.service.ProductService;

@Controller
public class ProductController {
	@Autowired
    private ProductService productService;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/addProduct")
    public String addProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "addProduct";
    }

    @PostMapping("/addProduct")
    public String addProductSubmit(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/displayProducts";
    }

    @GetMapping("/displayProducts")
    public String displayProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        System.out.println("products-------------"+productService.getAllProducts().size());
        model.addAttribute("products", products);
        return "displayProducts";
    }

}
