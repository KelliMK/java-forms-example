package org.wecancodeit.blogposts.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.wecancodeit.blogposts.repositories.PostRepository;

@Controller
public class BlogController {
	
	@Autowired
	PostRepository postRepo;

	@GetMapping({"", "/", "/index"})
	public String home() {
		return "redirect:/posts";
	}

	@GetMapping("/posts")
	public String getPosts(Model model) {
		model.addAttribute("posts", postRepo.findAll());
		return "posts/index";
	}
}
