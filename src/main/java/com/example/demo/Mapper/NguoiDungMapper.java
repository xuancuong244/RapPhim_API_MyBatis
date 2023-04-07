package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Models.NguoiDung;
@Mapper
public interface NguoiDungMapper {
	List<NguoiDung> getAllNV();
	NguoiDung findNVByEmailAndPassword(String sdt, String password);
	int insertNV(NguoiDung nv);
	int updateNV(NguoiDung nv);
	int deleteNV(String maNV);
}
