package com.example.demo.Services.ServiceImpl;

import com.example.demo.Mapper.XuatChieuMapper;
import com.example.demo.Models.XuatChieu;
import com.example.demo.Services.XuatChieuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XuatChieuServiceImpl implements XuatChieuService {
    @Autowired
    XuatChieuMapper mapper;
    @Override
    public List<XuatChieu> getLichChieu() {
        return mapper.getLichChieu();
    }

    @Override
    public int insertXuatChieu(String giaXuatChieu, String ngay, String maPhong, String maPhim) {
        return mapper.insertXuatChieu(giaXuatChieu, ngay, maPhong, maPhim);
    }
    @Override
    public List<XuatChieu> XuatChieuTheoNgay(String ngay, String macn,String gioBatDau) {
        return  mapper.XuatChieuTheoNgay(ngay, macn,gioBatDau);
    }
}
