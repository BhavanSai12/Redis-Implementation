package com.truvisorySolutions.application.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.truvisorySolutions.application.entity.Invoice;
import com.truvisorySolutions.application.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
	@Autowired
	InvoiceService invoiceService;
	
	@GetMapping("/allInv")
	public ResponseEntity<List<Invoice>>getAllInvoices(){
		return ResponseEntity.ok(invoiceService.getAllInvoices());	
	}
	
	@PostMapping("/saveInv")
	public Invoice saveInvoice(@RequestBody Invoice inv) {
		return invoiceService.saveInvoice(inv);	
	}
	
	
	@GetMapping("/getOne/{Id}")
	public Invoice getOnenvoice(@PathVariable Integer id) {
		return invoiceService.getOneInvoice(id);	
	}
	
	@PutMapping("/modify/{id}")
	public Invoice updateInvoice(@RequestBody Invoice inv,@PathVariable Integer id) {
		return invoiceService.updateInvoice(inv,id);	
	}
	@DeleteMapping("/delete/{id}")
	public String deleteInvoice(@PathVariable Integer id) {
		invoiceService.deleteInvoice(id);
		return "Employee with id : "+id+"Deleted !";	
	}
	
	
}
