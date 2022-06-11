package controller;
import model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import service.ProductServiceImp;

import java.util.List;
@Controller
public class ServletProducts {
    ProductServiceImp productService = new ProductServiceImp();
    @GetMapping("/hello")

    public ModelAndView display(@RequestParam("name")String name){
        List<Product> productList = productService.findAll();
        ModelAndView modelAndView = new ModelAndView("hi");
        modelAndView.addObject("list",productList);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView showCreateForm(){
        ModelAndView modelAndView = new ModelAndView("createForm");
        return modelAndView;
    }
    @PostMapping("/create")
    public ModelAndView save(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("price")int price){
        Product product = new Product(id,name,price)  ;
        productService.save(product);
        ModelAndView modelAndView = new ModelAndView("hi");
       return modelAndView;
    }

    @GetMapping ("/edit")
    public ModelAndView showEditForm(@RequestParam("id") int id){
            ModelAndView modelAndView = new ModelAndView("editForm");
            Product product = productService.findById(id);
            modelAndView.addObject("edit",product);
        return modelAndView;
    }

    @PostMapping("/edit")
    public ModelAndView edit(@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("price") int price){
        Product product = new Product(id, name, price);
        productService.update(id,product);
        ModelAndView modelAndView = new ModelAndView("hi");
        return modelAndView;
    }

    @GetMapping("/delete")
    public ModelAndView showDeleteForm(@RequestParam("id") int id){
        ModelAndView modelAndView = new ModelAndView("deleteForm");
        Product product = productService.findById(id);
        modelAndView.addObject("delete",product);
        return modelAndView;
    }
    @PostMapping("/delete")
    public ModelAndView delete(@RequestParam("id")int id){
        productService.delete(id);
        ModelAndView modelAndView = new ModelAndView("hi");
        return modelAndView;
    }
    @GetMapping ("/search")
    public ModelAndView showSearch(@RequestParam("name") String name){
        ModelAndView modelAndView= new ModelAndView("search");


        return modelAndView;
    }








}

