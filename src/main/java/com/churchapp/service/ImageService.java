package com.churchapp.service;

import java.io.IOException;
import org.bson.BsonBinarySubType;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.churchapp.model.Photo;
import com.churchapp.repository.ImageRepository;

@Service
public class ImageService {
	@Autowired
	private ImageRepository iRepo;

    public String addPhoto(Integer churchId, MultipartFile file) throws IOException {
        Photo photo = new Photo();
        photo.setChurchId(churchId);
        photo.setImage(new Binary(BsonBinarySubType.BINARY, file.getBytes()));
        photo = iRepo.insert(photo); return photo.getId();
    }

    public Photo getPhoto(String id) {
        return iRepo.findById(id).get();
    }

}
