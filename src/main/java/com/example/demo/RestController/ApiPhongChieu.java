package com.example.demo.RestController;

import com.example.demo.Models.PhongChieu;
import com.example.demo.Services.PhongChieuService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/api/phongchieu")
public class ApiPhongChieu {
    @Autowired
    PhongChieuService service;
    @GetMapping("/getAllPhongChieu")
    public ResponseEntity<List<PhongChieu>> getAllPhongChieu(@RequestParam("maCN") String maCN) throws SQLException{
        return ResponseEntity.ok(service.getAllPhongChieu(maCN));
    }
}
