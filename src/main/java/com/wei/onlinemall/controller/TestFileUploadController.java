package com.wei.onlinemall.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * @Author WeiJinLong
 * @Date 2022-09-15 16:31
 */

@RestController
@RequestMapping("/file")
public class TestFileUploadController {

    @PostMapping("/test")
    public String upload(@RequestParam("myfile") MultipartFile file, @RequestParam("description") String description) throws IOException {
   // public String upload(@RequestParam("myfile") MultipartFile file, @RequestParam(required = false) String description) throws IOException {
        System.out.println(description);
        if (!file.isEmpty()){
            String path = "E:/IdeaProjects/";
            String fileName = file.getOriginalFilename();
            File filePath = new File(path+File.separator+fileName);
            if (!filePath.exists()){
                filePath.mkdirs();
            }
            file.transferTo(filePath);
        }
            return "ok";

    }
}
