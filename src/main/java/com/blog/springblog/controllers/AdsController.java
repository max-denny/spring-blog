
package com.blog.springblog.controllers;

import com.blog.springblog.models.Ad;
import com.blog.springblog.services.AdsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdsController {

    private final AdsService adsSvc;

    public AdsController(AdsService adsSvc){
        this.adsSvc = adsSvc;
    }

    @GetMapping("/ads/{id}")
    public String showAd(@PathVariable long id, Model vModel){
        Ad ad = adsSvc.findOne(id);
        vModel.addAttribute("ad", ad);
        return "ads/show";
    }

    @GetMapping("/ads")
    public String showAllAds(Model vModel){
        vModel.addAttribute("ads", adsSvc.findAll());
        return "ads/index";
    }

    @GetMapping("/ads/create")
    public String showCreateForm(Model model){
        model.addAttribute("ad", new Ad());
        return "ads/create";
    }

    @PostMapping("ads/save")
    public String createAd(@ModelAttribute Ad ad){
        adsSvc.save(ad);
        return "redirect:/ads";
    }

}