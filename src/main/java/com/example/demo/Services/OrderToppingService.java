package com.example.demo.Services;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import com.example.demo.Models.OrderTopping;

import java.util.List;

public interface OrderToppingService {
    int insert(String maTopping, int soLuongMua, int idVe);
    List<OrderTopping> getAll();
    List<OrderTopping> getOrder( int idVe);

}
