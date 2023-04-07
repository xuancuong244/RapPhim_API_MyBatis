package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.Models.SendEmail;
import com.example.demo.Services.FilesStorageService;
import com.example.demo.Services.SendEmailService;
import com.example.demo.Thread.ThreadXC;

import jakarta.annotation.Resource;

@SpringBootApplication
public class RapChieuPhimApplication {
	@Resource
	FilesStorageService storageService;
	@Autowired
	SendEmailService service;

	public static void main(String[] args) {
		SpringApplication.run(RapChieuPhimApplication.class, args);
	}

	SendEmail s;
	List<ThreadXC> list;

	public void run(String... arg) throws Exception {
//    storageService.deleteAll();
		storageService.init();
//        List<SendEmail> list = service.getAll();
//        list.stream().forEach(s->{
//            Thread t = new Thread(new ThreadServiceEmail(s, "00:59:00"));
//            t.start();
//        });
		service.getAll().forEach(s -> {
			new ThreadXC(s).start();
		});
	}
}
