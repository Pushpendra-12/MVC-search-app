package com.searchEngine.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import jakarta.servlet.http.HttpSession;


@Controller
public class FileUploadController {
	
	@RequestMapping("/upload")
	public String showUploadForm() {
		return "fileForm";
	}
	
	@RequestMapping(path = "/uploadimage", method = RequestMethod.POST)
	public String processUpload(@RequestParam("profile") MultipartFile file, HttpSession session, Model model) {
		System.out.println("File upload handler");
		System.out.println(file.getSize());
		System.out.println(file.getName());
		System.out.println(file.getContentType());
		System.out.println(file.getOriginalFilename());
		
		String path = session.getServletContext().getRealPath("/")+ "WEB-INF" + File.separator + "uploads" + File.separator +  file.getOriginalFilename();
		System.out.println(path);
		try {
			byte[] data =  file.getBytes();
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(data);
			fos.close();
			model.addAttribute("msg", "uploaded succesfully");
			model.addAttribute("filename", file.getOriginalFilename());
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Uploading error");
			model.addAttribute("msg", "uploading error");
			
		}
		
		return "filesuccess";
	}

}
