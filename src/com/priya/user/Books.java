package com.priya.user;

import java.time.LocalDate;

public class Books {
	private Integer id;
	private String name;
	private Integer price;
	private LocalDate date;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Books [id=" + id + ", name=" + name + ", price=" + price + ", date=" + date + "]";
	}
	public void setPublisheddate(LocalDate d) {
		// TODO Auto-generated method stub
		
	}
	
	

}
