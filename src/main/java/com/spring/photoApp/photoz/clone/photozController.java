package com.spring.photoApp.photoz.clone;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class photozController {
	
	private List<Photo> db = List.of(new Photo("1","hello.jpg"));
	
	@GetMapping("/")
	public String hello() {
		return "hello java";
	}
	
	@GetMapping("/Photoz")
	public List<Photo> get(){
		return db;
		
	}
	
}
