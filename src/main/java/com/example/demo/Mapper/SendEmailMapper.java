package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.Models.SendEmail;

import java.util.List;

@Mapper
public interface SendEmailMapper {
    List<SendEmail> getAll();
}
