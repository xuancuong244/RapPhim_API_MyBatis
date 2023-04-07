package com.example.demo.Services;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.Models.NgayChieu;

public interface NgayChieuService {
	List<NgayChieu> getGioByPhim(String maPhim, String ngay);
	int insertNgayChieu(String ngay,String gioBatDau);
	List<NgayChieu> getGioBatDau (String macn, String maphim);
	List<NgayChieu> getNgay();
	NgayChieu getNgayChieu( String ngay, String gioBatDau);
	int getMaxStt();
	List<NgayChieu> getgiobatdau1ngay(String macn,String ngay);
}
