package com.churchapp.controller;

import java.io.IOException;
import java.util.Base64;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.churchapp.model.Church;
import com.churchapp.model.Photo;
import com.churchapp.service.ChurchService;
import com.churchapp.service.ImageService;

@Controller
@EnableAutoConfiguration
public class ChurchController {
	
    @Autowired
    private ChurchService cService;

    @Autowired
    private ImageService iService;

    @GetMapping("/")
    public String index() {
        return "upload";
    }
    
    @RequestMapping("/create")
    private void createChurch(@RequestParam String name, @RequestParam String logo, @RequestParam String address,
                                 @RequestParam Integer contactNumber, @RequestParam String liveUrl, @RequestParam String website,
                                 @RequestParam String facebookUrl, @RequestParam String donationUrl) {

           Church church = new Church();
           church.setName(name);
           church.setLogo(logo);
           church.setAddress(address);
           church.setContactNumber(contactNumber);
           church.setLiveURL(liveUrl);
           church.setWebsite(website);
           church.setFacebookURL(facebookUrl);
           church.setDonationURL(donationUrl);
           this.cService.createChurch(church);
    }

    @PostMapping("/photos/add")
    public String addPhoto(@RequestParam("churchId") Integer churchId, 
    			@RequestParam("image") MultipartFile image, Model model) throws IOException {
        String id = iService.addPhoto(churchId, image);
        return "redirect:/photos/" + id;
    }

    @GetMapping("/photos/{id}")
    public String getPhoto(@PathVariable String id, Model model) {
        Photo photo = iService.getPhoto(id);
        model.addAttribute("image",
          Base64.getEncoder().encodeToString(photo.getImage().getData()));
        return "photos";
    }

}
