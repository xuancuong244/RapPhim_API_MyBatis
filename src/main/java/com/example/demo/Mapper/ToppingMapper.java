package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Models.Phim;
import com.example.demo.Models.Topping;

@Mapper
public interface ToppingMapper {
	List<Topping> getAllTP();
	
//	int insertTP(Topping topping);

	int insertTP(String maTopping, String tenTopping, double gia);
	int deleteTP(String maTopping);
	int updateTP(String maTopping, String tenTopping, double gia);
}
