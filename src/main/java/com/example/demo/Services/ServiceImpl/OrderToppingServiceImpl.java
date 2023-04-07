package com.example.demo.Services.ServiceImpl;

import com.example.demo.Mapper.OrderToppingMapper;
import com.example.demo.Models.OrderTopping;
import com.example.demo.Services.OrderToppingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderToppingServiceImpl implements OrderToppingService {
    @Autowired
    OrderToppingMapper mapper;

    @Override
    public int insert(String maTopping, int soLuongMua, int idVe) {
        return mapper.insert(maTopping, soLuongMua, idVe);
    }

    @Override
    public List<OrderTopping> getAll() {
        return mapper.getAll();
    }

    @Override
    public List<OrderTopping> getOrder(int idVe) {
        return mapper.getOrder(idVe);
    }
}
