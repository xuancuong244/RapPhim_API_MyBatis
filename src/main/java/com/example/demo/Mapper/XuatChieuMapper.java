package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.Models.XuatChieu;

import java.util.List;
@Mapper
public interface XuatChieuMapper {
    List<XuatChieu> getLichChieu();
    int insertXuatChieu(@Param("giaXuatChieu") String giaXuatChieu, @Param("ngay") String ngay, @Param("maPhong") String maPhong, @Param("maPhim") String maPhim);
    List<XuatChieu> XuatChieuTheoNgay(@Param("ngay") String ngay, @Param("macn") String macn,@Param("gioBatDau") String gioBatDau);
}
