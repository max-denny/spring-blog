//package com.blog.springblog.controllers;
//
//import com.blog.springblog.repositories.PetRepo;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//
//@Controller
//public class PetController {
//
//
//    public PetController(PetRepo petRepo){
//        this.petRepo = petRepo;
//    }
//    @GetMapping("/pets")
//    public String index(Model model) {
//        model.addAttribute("pets", petRepo.findAll());
//        return "pets/index";
//    }
//
//    @GetMapping("/pets/{id}")
//    public String show(@PathVariable Long id, Model model){
//        model.addAttribute(("pet", petRepo.findOne(id));
//        return pets/show-pet";
//    }
//}
