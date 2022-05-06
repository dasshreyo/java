package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String author;
	private int price;

	public Book()
	{
	}

	public Book(Long id, String name, String author, int price)
	{
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Book(String name, String author, int price)
	{
		this.name = name;
		this.author = author;
		this.price = price;
	}

	public Long getId()
	{
		return id;
	}

	public void setId(Long id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String getAuthor()
	{
		return author;
	}

	public void setAuthor(String author)
	{
		this.author = author;
	}

	public int getPrice()
	{
		return price;
	}

	public void setPrice(int price)
	{
		this.price = price;
	}

	@Override
	public String toString()
	{
		return "Book{" + "id=" + id + ", name='" + name + '\'' + ", author='" + author + '\''
				+ ", price=" + price + '}';
	}

}
