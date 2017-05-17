package com.jihoon.mybbs.model;

// model패키지에 value값 정의 -> 도메인 모델링
// 큰거 부터 하나씩

// source - Generate getter & setter

public class Bbs {
	
	private long id;
	private String title;
	private String content;
	private String author;
	private String date;
	private int view;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	
	@Override
	public String toString(){
		return id + ":" + author + ":" + title + ":" + content;
	}
	
}
