package com.example.demo.Services;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.example.demo.Models.Ve;

public interface VeService {
	List<Ve> getAllVe();
	int insertVe(double tongGiaVe,double thueVat,int maCTGhe,int maKH, int stt_xc);
	int idVe();
	List<Ve> getLichSuVe(int maKH);
	Ve getVe( int idVe);
	List<Ve> CountVeByChiNhanh(String macn);
	List<Ve> CountVeByPhim(String macn);

}
