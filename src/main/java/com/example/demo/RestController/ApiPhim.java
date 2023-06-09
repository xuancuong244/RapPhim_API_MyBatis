package com.example.demo.RestController;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.demo.Models.Phim;
import com.example.demo.Services.PhimService;

@RestController
@RequestMapping("/api/phim")
@CrossOrigin(origins = "*")
public class ApiPhim {
	@Autowired
	PhimService service;
	
	@GetMapping("/getAllPhim")
	public ResponseEntity<List<Phim>> getAllPhim() throws SQLException{
		return ResponseEntity.ok(service.getAllPhim());
	}
	@GetMapping("/getAllPhim2")
	public ResponseEntity<List<Phim>> getAllPhim2() throws SQLException{
		return ResponseEntity.ok(service.getAllPhim2());
	}
	
	@GetMapping("/getMaPhim")
	public ResponseEntity<Phim> getMaPhim(@RequestParam("maPhim")String maPhim,@RequestParam("ngay") String ngay) throws SQLException{
		System.out.println(maPhim);
//		System.out.println(service.getMaPhim(maPhim));
		return ResponseEntity.ok(service.getMaPhim(maPhim,ngay));
	}
	@GetMapping("/uploadHinh")
	public ResponseEntity<Integer> uploadHinh(@RequestParam("hinh")String maPhim,@RequestParam("maPhim") String ngay) throws SQLException{
//		System.out.println(service.getMaPhim(maPhim));
		return ResponseEntity.ok(service.updateHinh(maPhim,ngay));
	}
	

//	@GetMapping("/getGioBatDau")
//	public ResponseEntity<List<Phim>> getGioBatDau(@RequestParam("maPhim")String maPhim,@RequestParam("ngayChieu")String Ngay) throws SQLException{
//		System.out.println(maPhim);
//		return ResponseEntity.ok(service.getGioBatDau(maPhim, Ngay));
//	}

	@PostMapping("/insertPhim")
	public ResponseEntity<Integer> insertPhim(@RequestBody Phim phim) throws SQLException{
		return ResponseEntity.ok(service.insertPhim(phim));
	}
	@PostMapping("/updatePhim")
	public ResponseEntity<Integer> updatePhim(@RequestBody Phim phim) throws SQLException{
		return ResponseEntity.ok(service.updatePhim(phim));
	}

	@GetMapping("/deletePhim")
	public ResponseEntity<Integer> deletePhim(@RequestParam("maPhim") String maPhim) throws SQLException{
		return ResponseEntity.ok(service.deletePhim(maPhim));
	}
}
