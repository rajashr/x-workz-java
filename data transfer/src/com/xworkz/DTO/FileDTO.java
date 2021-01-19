package com.xworkz.DTO;
import java.util.Date;

public class FileDTO {
	private String name;
    private String type;
    private double size;
    private String location;
    private Date createdDate;
    //constructor overloadig
    public FileDTO() {
    	System.out.println("created file dto using default constructor");
    }
    
    public FileDTO(String name,double size) {
    	System.out.println("created fileDTO using parameterised constructor");
    	
    	this.name=name;
    	this.size=size;
    	
    }
    public FileDTO(String name,double size,String type,String location,Date createdDate) {
    	System.out.println("created file DTO by using parameterised constructor");
    	this.createdDate=createdDate;
    	this.location=location;
    	this.name=name;
    	this.size=size;
    	this.type=type;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getSize() {
		return size;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
