package com.internousdev.login.dto;

public class LoginDTO {
	private int id;
	private String name;
	private String Password;

	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPassword(){
		return Password;
	}
	public void setPassword(String password){
		this.Password = password;
	}


}
