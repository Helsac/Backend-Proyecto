package com.proyecto.crud.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "GovernmentBFP")
public class GovernmentBFP implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private int yearOfBalance;
	private String state;
	private String category;
	private String item;
	private int amount;
	private int percentOfGdp;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getYearOfBalance() {
		return yearOfBalance;
	}
	public void setYearOfBalance(int yearOfBalance) {
		this.yearOfBalance = yearOfBalance;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public int getPercentOfGdp() {
		return percentOfGdp;
	}
	public void setPercentOfGdp(int percentOfGdp) {
		this.percentOfGdp = percentOfGdp;
	}
	
	public GovernmentBFP(Long id, int yearOfBalance, String state, String category, String item, int amount,
			int percentOfGdp) {
		super();
		this.id = id;
		this.yearOfBalance = yearOfBalance;
		this.state = state;
		this.category = category;
		this.item = item;
		this.amount = amount;
		this.percentOfGdp = percentOfGdp;
	}
	
	
	

}
