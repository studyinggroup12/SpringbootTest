package com.sola.controller;

import java.io.File;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class UploadController {
	
	@GetMapping("/upload")
	public String uploadpath() {
		return "upload";
	}
	
	@GetMapping("/upload2")
	public String uploadpath2() {
		return "upload2";
	}
	
	@PostMapping("/upload")
	@ResponseBody
	public String upload(@RequestParam("file") MultipartFile file) {
		if(file.isEmpty()) {
			return "上传失败，请选择文件！";
		}
		String fileName=file.getOriginalFilename();
		String filePath="E:\\workspace\\SpringbootTest\\src\\main\\resources\\static\\upload\\image\\";
		File dest=new File(filePath+fileName);
		try {
			file.transferTo(dest);
			return "上传成功";
		}catch (IOException e) {
			e.printStackTrace();
		}
		return "上传失败,请查看该文件是否超过了10M";
	}
	
	
}
