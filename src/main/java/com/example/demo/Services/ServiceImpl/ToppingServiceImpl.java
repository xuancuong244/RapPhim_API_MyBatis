package com.example.demo.Services.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Mapper.CTTopping;
import com.example.demo.Mapper.ToppingMapper;
import com.example.demo.Models.Topping;
import com.example.demo.Services.ToppingService;


@Service
public class ToppingServiceImpl implements ToppingService {
@Autowired
ToppingMapper mapper;
@Autowired
CTTopping mapperCT;
@Override
public List<Topping> getAllTP() {
	// TODO Auto-generated method stub
	return mapper.getAllTP();
}
@Override
public int insertCTTP(int idVe, String maTopping, int soLuongMua) {
	// TODO Auto-generated method stub
	
	return mapperCT.insertTP(idVe, maTopping, soLuongMua);
}
@Override
public int insertTP(String maTopping, String tenTopping, double gia) {
	// TODO Auto-generated method stub
	return mapper.insertTP(maTopping, tenTopping, gia);
}
@Override
public int deleteTP(String maTopping) {
	// TODO Auto-generated method stub
	return mapper.deleteTP(maTopping);
}
@Override
public int updateTP(String maTopping, String tenTopping, double gia) {
	// TODO Auto-generated method stub
	return mapper.updateTP(maTopping, tenTopping, gia);
}



}
