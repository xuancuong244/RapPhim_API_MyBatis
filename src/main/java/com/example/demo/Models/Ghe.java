package com.example.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ghe {
    private String MaGhe;
    private String TenGhe;
    private int MaLoai;
    private int IdVe;
    private double gia;
    private int MaCTGhe;
}
