package com.anand.entity;

import jakarta.persistence.*;

@Entity
public class CurrencyConversion {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private Long id;

 private String fromCurrency;
 private String toCurrency;
 private double amount;
public CurrencyConversion() {
	super();
}
public CurrencyConversion(Long id, String fromCurrency, String toCurrency, double amount) {
	super();
	this.id = id;
	this.fromCurrency = fromCurrency;
	this.toCurrency = toCurrency;
	this.amount = amount;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFromCurrency() {
	return fromCurrency;
}
public void setFromCurrency(String fromCurrency) {
	this.fromCurrency = fromCurrency;
}
public String getToCurrency() {
	return toCurrency;
}
public void setToCurrency(String toCurrency) {
	this.toCurrency = toCurrency;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
@Override
public String toString() {
	return "CurrencyConversion [id=" + id + ", fromCurrency=" + fromCurrency + ", toCurrency=" + toCurrency
			+ ", amount=" + amount + "]";
}

 
}

