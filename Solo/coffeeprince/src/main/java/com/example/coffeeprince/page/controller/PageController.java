package com.example.coffeeprince.page.controller;

import com.example.coffeeprince.Service.ProductService;
import com.example.coffeeprince.product.dto.ProductList;
import com.example.coffeeprince.product.dto.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {

   ProductService productService;

   @Autowired
    public PageController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String mainPage() {
        return "index";
    }

    @GetMapping("/signupPage")
    public String signupPage() {
        return "user/signup";
    }

    @GetMapping("/loginPage")
    public String loginPage() {
        return "user/login";
    }

    @GetMapping("/aboutus")
    public String aboutus() {
        return "aboutus";
    }

    @GetMapping("/productList")
    public String productList(SearchDto params, Model model) {
//        ProductList product = productService.findAll(params);
//        model.addAttribute("product", product);
        String key=params.getKeyword();
        if(key!=null){
            model.addAttribute("keyword", params.getKeyword());
        }

        return "productlist";
    }

}