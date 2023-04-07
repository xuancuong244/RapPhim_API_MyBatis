package com.example.demo.Services;

import java.util.List;

import com.example.demo.Models.Topping;

public interface ToppingService {
	List<Topping> getAllTP();
	int insertCTTP(int idVe, String maTopping,int soLuongMua);
	int insertTP(String maTopping, String tenTopping, double gia);
	int deleteTP(String maTopping);
	int updateTP(String maTopping, String tenTopping, double gia);
}
