package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.Models.PhongChieu;

import java.util.List;

@Mapper
public interface PhongChieuMapper {
    List<PhongChieu> getAllPhongChieu(@Param("maCN") String maCN);
}
