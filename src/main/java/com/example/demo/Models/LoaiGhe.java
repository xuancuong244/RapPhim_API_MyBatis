package com.example.demo.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoaiGhe {
    private int MaLoaiGhe;
    private String TenLoai;
    private long PhuThu;
}
