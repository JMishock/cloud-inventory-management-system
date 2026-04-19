package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.PartService;
import com.example.demo.service.ProductService;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 *
 *
 *
 *
 */

@Controller
public class MainScreenControllerr {
   // private final PartRepository partRepository;
   // private final ProductRepository productRepository;'

    private PartService partService;
    private ProductService productService;

    private List<Part> theParts;
    private List<Product> theProducts;

 /*   public MainScreenControllerr(PartRepository partRepository, ProductRepository productRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
    }*/

    public MainScreenControllerr(PartService partService,ProductService productService){
        this.partService=partService;
        this.productService=productService;
    }
    @GetMapping("/mainscreen")
    public String listPartsandProducts(Model theModel, @Param("partkeyword") String partkeyword, @Param("productkeyword") String productkeyword){
        //add to the sprig model
        List<Part> partList=partService.listAll(partkeyword);
        theModel.addAttribute("parts",partList);
        theModel.addAttribute("partkeyword",partkeyword);
    //    theModel.addAttribute("products",productService.findAll());
        List<Product> productList=productService.listAll(productkeyword);
        theModel.addAttribute("products", productList);
        theModel.addAttribute("productkeyword",productkeyword);
        return "mainscreen";
    }
    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }
    @GetMapping("/buyProduct")
    public String buyProduct(@RequestParam("productID") int id, Model theModel) {
        Product boughtProduct = null;

        for (Product product : productService.listAll("")) {
            if ((int) product.getId() == id) {
                boughtProduct = product;
                break;
            }
        }

        if (boughtProduct != null) {
            if (boughtProduct.getInv() > 0) {
                boughtProduct.setInv(boughtProduct.getInv() - 1);
                productService.save(boughtProduct);
                theModel.addAttribute("purchaseMessage", "Purchase successful!");
            } else {
                theModel.addAttribute("purchaseMessage", "Purchase failed: product is out of stock.");
            }
        } else {
            theModel.addAttribute("purchaseMessage", "Purchase failed: product not found.");
        }

        List<Part> partList = partService.listAll("");
        theModel.addAttribute("parts", partList);
        theModel.addAttribute("partkeyword", "");

        List<Product> productList = productService.listAll("");
        theModel.addAttribute("products", productList);
        theModel.addAttribute("productkeyword", "");

        return "mainscreen";
    }
}
