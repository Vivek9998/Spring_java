package com.spring.photoApp.photoz.clone;

public class Photo {
	private String id;
	private String fileName;
	public String getId() {
		return id;
	}
	
// this is bean file.	
	public Photo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Photo(String id, String fileName) {
		super();
		this.id = id;
		this.fileName = fileName;
	}


	public void setId(String id) {
		this.id = id;
	}
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
}
