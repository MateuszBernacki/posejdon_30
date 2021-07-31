package com.michalszalkowski.module.blog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogPostWebController {

    @Autowired
    private PostMemoryStorageService postMemoryStorageService;

    @GetMapping("/blog/post")
    public String getList(Model model) {
        model.addAttribute("postForm", new PostForm());
        model.addAttribute("posts", postMemoryStorageService.getPosts());
        return "blog/index.html";
    }

    @GetMapping("/blog/post/{uuid}")
    public String getDetails(@PathVariable("uuid") String uuid, Model model) {
        model.addAttribute("post", postMemoryStorageService.getPost(uuid).get());
        return "blog/details.html";
    }

    @PostMapping("/blog/post")
    public String create(PostForm form) {
        PostDto postDto = postMemoryStorageService.create(form.getTitle(), form.getText());
        return "redirect:/blog/post/" + postDto.getUuid();
    }

}