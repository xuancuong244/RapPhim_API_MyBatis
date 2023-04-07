package com.example.demo.Mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.core.annotation.Order;

import com.example.demo.Models.OrderTopping;
import com.example.demo.Models.Topping;

import java.util.List;

@Mapper
public interface OrderToppingMapper {
    int insert(@Param("maTopping") String maTopping, @Param("soLuongMua") int soLuongMua, @Param("idVe") int idVe);
    List<OrderTopping> getAll();
    List<OrderTopping> getOrder(@Param("idVe") int idVe);
}
