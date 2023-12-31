package com.red.red.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.red.red.entity.ImgUser;
import com.red.red.repository.ImgUserRepository;

@Service
public class ImgUserService {
    
    @Autowired
    ImgUserRepository imgUserRepository;

    
    public ImgUser create(MultipartFile archive) {

        if (archive != null) {
            try {
            
            ImgUser imgUser = new ImgUser();

            imgUser.setMime(archive.getContentType());
            imgUser.setImgName(archive.getName());
            imgUser.setContent(archive.getBytes());

            return imgUserRepository.save(imgUser); 

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }

        } else {
            
        }
        return null;
    }
}
