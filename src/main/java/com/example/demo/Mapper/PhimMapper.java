package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.Models.Phim;
import java.util.*;
@Mapper
public interface PhimMapper {
	List<Phim> getAllPhim();
	List<Phim> getAllPhim2();
	Phim getMaPhim(@Param("maPhim") String maPhim);
	List<Phim> getTheLoai(@Param("maPhim")String maPhim);
//	List<Phim> getGioBatDau(@Param("maPhim")String maPhim,@Param("ngay") String Ngay);
	int updateHinh(@Param("hinh") String hinh, @Param("maPhim") String maPhim);
	int insertPhim(Phim phim);
	int updatePhim(Phim phim);
	int deletePhim(String maPhim);
}
