package com.example.demo.Services.ServiceImpl;

import com.example.demo.Mapper.ChiNhanhMapper;
import com.example.demo.Models.ChiNhanh;
import com.example.demo.Services.ChiNhanhService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChiNhanhServiceImpl implements ChiNhanhService {
    @Autowired
    ChiNhanhMapper mapper;
//    NgayChieuMapper mapperNC;
    @Override
    public List<ChiNhanh> getAllChiNhanh() {

        return mapper.getAllChiNhanh();
    }
}
