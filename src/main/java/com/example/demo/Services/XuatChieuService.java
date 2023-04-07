package com.example.demo.Services;

import org.apache.ibatis.annotations.Param;

import com.example.demo.Models.XuatChieu;

import java.util.List;

public interface XuatChieuService {
    List<XuatChieu> getLichChieu();
    int insertXuatChieu(String giaXuatChieu, String ngay, String maPhong, String maPhim);
    List<XuatChieu> XuatChieuTheoNgay(String ngay, String macn,String gioBatDau);
}
