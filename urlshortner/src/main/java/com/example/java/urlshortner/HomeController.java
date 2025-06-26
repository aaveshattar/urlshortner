package com.example.java.urlshortner;
 
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;

import com.example.java.urlshortner.domain.entities.ShortUrl;
import com.example.java.urlshortner.domain.repositories.ShortUrlRepository;

import java.util.List;
 
@Controller

public class HomeController {
	
	private final ShortUrlRepository shortUrlRepository;
	
	
 
    public HomeController(ShortUrlRepository shortUrlRepository) {
		this.shortUrlRepository = shortUrlRepository;
	}



	@GetMapping("/")

    public String home(Model model) {

		List<ShortUrl> shortUrls =shortUrlRepository.findAll(Sort.by(Sort.Direction.DESC, "createdAt"));
        model.addAttribute("shortUrls", shortUrls);
        model.addAttribute("baseUrl", "http://localhost:8080");
        return "index";

    }
 
 

}
 