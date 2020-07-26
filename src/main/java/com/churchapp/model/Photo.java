package com.churchapp.model;

import org.bson.types.Binary;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "church_images")
public class Photo {

    @Id
    private String id;
    private int churchId;
    private Binary image;
    
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public int getChurchId() {
		return churchId;
	}
	
	public void setChurchId(int churchId) {
		this.churchId = churchId;
	}
	
	public Binary getImage() {
		return image;
	}
	
	public void setImage(Binary image) {
		this.image = image;
	}

}
