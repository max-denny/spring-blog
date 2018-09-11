package com.blog.springblog.services;

import com.blog.springblog.models.Ad;
import com.blog.springblog.repositories.AdRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdSvc {

    AdRepository adDao;

    public AdSvc(AdRepository adDao) {
        this.adDao = adDao;
    }

    public List<Ad> giveMeAds() {
        return adDao.findAll();
    }
}
