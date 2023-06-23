package com.thesun4sky.springauth.controller;

import com.thesun4sky.springauth.entity.User;
import com.thesun4sky.springauth.security.UserDetailsImpl;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class ProductController {

    /**
     * 4. 인증정보(Authentication)에서 UserDetails 값 받아오기
     * Authentication > getPrincipal() > UserDetails > user
     */
    @GetMapping("/products")
    public String getProducts(@AuthenticationPrincipal UserDetailsImpl userDetails) {
        User user = userDetails.getUser();

        System.out.println("user.getUsername() = " + user.getUsername());
        System.out.println("user.getEmail() = " + user.getEmail());

        return "redirect:/";
    }
}
