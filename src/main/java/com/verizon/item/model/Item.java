package com.verizon.item.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="item")
public class Item {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="icode")
	private int identificationCode;
	@Column(name="title")
	private String itemTitle;
	@Column(name="packDt")
	private LocalDate packageDate;
	@Column
	private double price;
	@Enumerated(EnumType.STRING)
	@Column(name="catg")
	private Catg category;
	@Column(name="frag")
	private boolean frag;
	
	
	public Item() {
		
	}


	public Item(String itemTitle, LocalDate packageDate, double price, Catg category, boolean frag) {
		super();
		this.itemTitle = itemTitle;
		this.packageDate = packageDate;
		this.price = price;
		this.category = category;
		this.frag = frag;
	}


	public int getIdentificationCode() {
		return identificationCode;
	}


	public void setIdentificationCode(int identificationCode) {
		this.identificationCode = identificationCode;
	}


	public String getItemTitle() {
		return itemTitle;
	}


	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}


	public LocalDate getPackageDate() {
		return packageDate;
	}


	public void setPackageDate(LocalDate packageDate) {
		this.packageDate = packageDate;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Catg getCategory() {
		return category;
	}


	public void setCategory(Catg category) {
		this.category = category;
	}


	public boolean isFrag() {
		return frag;
	}


	public void setFrag(boolean frag) {
		this.frag = frag;
	}


	@Override
	public String toString() {
		return "Item [identificationCode=" + identificationCode + ", itemTitle=" + itemTitle + ", packageDate="
				+ packageDate + ", price=" + price + ", category=" + category + ", frag=" + frag + "]";
	}
	

}
