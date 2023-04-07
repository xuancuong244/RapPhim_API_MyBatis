package com.example.demo.Services.ServiceImpl;

import com.example.demo.Mapper.PhongChieuMapper;
import com.example.demo.Models.PhongChieu;
import com.example.demo.Services.PhongChieuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PhongChieuServiceImpl implements PhongChieuService {
    @Autowired
    PhongChieuMapper mapper;
    @Override
    public List<PhongChieu> getAllPhongChieu(String maCN) {
        return mapper.getAllPhongChieu(maCN);
    }
}
