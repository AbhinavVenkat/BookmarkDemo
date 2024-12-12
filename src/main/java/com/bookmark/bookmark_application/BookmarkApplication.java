package com.bookmark.bookmark_application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.bookmark")
public class BookmarkApplication {
	public static void main(String[] args) {
		SpringApplication.run(BookmarkApplication.class, args);
	}
}
