package com.truvisorySolutions.application.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
@Entity
public class Invoice {
	@Id
	@GeneratedValue
	private int invoiceId;
	private String invoiceName;
	private int invoiceAmount;
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoiceName() {
		return invoiceName;
	}
	public void setInvoiceName(String invoiceName) {
		this.invoiceName = invoiceName;
	}
	public int getInvoiceAmount() {
		return invoiceAmount;
	}
	public void setInvoiceAmount(int invoiceAmount) {
		this.invoiceAmount = invoiceAmount;
	}
	/*
	 * public Invoice(int invoiceId, String invoiceName, int invoiceAmount) {
	 * super(); this.invoiceId = invoiceId; this.invoiceName = invoiceName;
	 * this.invoiceAmount = invoiceAmount; } public Invoice() { super(); }
	 */
	
	

}
