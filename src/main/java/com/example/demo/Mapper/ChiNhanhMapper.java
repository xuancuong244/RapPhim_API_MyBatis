package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Models.ChiNhanh;

import java.util.List;

@Mapper
public interface ChiNhanhMapper {
    List<ChiNhanh> getAllChiNhanh();
}
