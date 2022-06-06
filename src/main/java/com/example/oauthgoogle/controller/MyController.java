package com.example.oauthgoogle.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

	@GetMapping("/hello")
	public Principal hello(Principal principal) {
		return principal;
	}
}