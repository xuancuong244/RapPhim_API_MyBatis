package com.example.demo.Services;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.Models.Phim;

public interface PhimService {
	List<Phim> getAllPhim();
	List<Phim> getAllPhim2();
	Phim getMaPhim(String maPhim, String ngay);
	List<Phim> getTheLoai(String maPhim);
	List<Phim> getGioBatDau(String maPhim,String Ngay);
	int updateHinh(String hinh, String maPhim);
	int insertPhim(Phim phim);
	int updatePhim(Phim phim);
	int deletePhim(String maPhim);
}
