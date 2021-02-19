package com.example.demo.view;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class BookBean {
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
}
