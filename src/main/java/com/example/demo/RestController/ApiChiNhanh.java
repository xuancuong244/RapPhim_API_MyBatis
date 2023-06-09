package com.example.demo.RestController;

import com.example.demo.Models.ChiNhanh;
import com.example.demo.Services.ChiNhanhService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/chinhanh")

@CrossOrigin("*")

public class ApiChiNhanh {
    @Autowired
    ChiNhanhService service;
    @GetMapping("/getAllChiNhanh")
    public ResponseEntity<List<ChiNhanh>> getAllChiNhanh() throws SQLException{
        return ResponseEntity.ok(service.getAllChiNhanh());
    }
}
