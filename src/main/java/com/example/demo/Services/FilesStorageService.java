package com.example.demo.Services;

import java.nio.file.Path;
import java.util.stream.Stream;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

public interface FilesStorageService {
	public void init();

	public void save(MultipartFile file);

	public void saveQRCode(MultipartFile file);

	public Resource load(String filename);

	public void deleteAll();

	public void saveHinhPhim(MultipartFile file);

	public Stream<Path> loadAll();
}
