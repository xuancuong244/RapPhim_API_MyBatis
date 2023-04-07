package com.example.demo.Mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.Models.Ghe;
@Mapper
public interface GheMapper {
	List<Ghe> getAllGhe();
	List<Ghe> findGhePhong(@Param("MaPhong") String Maphong);
	List<Ghe> findGhePhim(@Param("stt_xc")int stt_xc);
}
