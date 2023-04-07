package com.example.demo.Services;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.Models.Ghe;
public interface GheService {
	List<Ghe> getAllGhe();
	List<Ghe> findGhePhong(String MaPhong);
	List<Ghe> findGhePhim(int stt_xc);

}
