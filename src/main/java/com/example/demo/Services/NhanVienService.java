package com.example.demo.Services;

import java.util.List;

import com.example.demo.Models.NguoiDung;


public interface NhanVienService {
	List<NguoiDung> getAllNV();
	NguoiDung findNVByEmailAndPassword(String sdt, String password);
	int insertNV(NguoiDung nv);
	int updateNV(NguoiDung nv);
	int deleteNV(String maNV);
}
