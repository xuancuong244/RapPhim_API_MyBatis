package com.example.demo.Services.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mapper.GheMapper;
import com.example.demo.Services.GheService;

@Service
public class GheServiceImpl<Ghe> implements GheService{
@Autowired	
	GheMapper mapper;

@Override
public List<com.example.demo.Models.Ghe> getAllGhe() {
	// TODO Auto-generated method stub
	return mapper.getAllGhe();
}

@Override
public List<com.example.demo.Models.Ghe> findGhePhong(String MaPhong) {
	// TODO Auto-generated method stub
	return mapper.findGhePhong(MaPhong);
}

@Override
public List<com.example.demo.Models.Ghe> findGhePhim(int stt_xc) {
	// TODO Auto-generated method stub
	return mapper.findGhePhim(stt_xc);
}


}
