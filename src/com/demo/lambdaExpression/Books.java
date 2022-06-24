package com.demo.lambdaExpression;

public class Books {
	String title;
	String author;
	String bookName;
	int pages;

	Books(String title, String author, String bookName, int pages) {
		this.title = title;
		this.author = author;
		this.bookName = bookName;
		this.pages = pages;
	}

	public String getTitle() {
		return title;

	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public void setTitle(String title) {
		this.title = title;
	}

}
