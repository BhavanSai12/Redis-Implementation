package com.truvisorySolutions.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.truvisorySolutions.application.entity.Invoice;
import com.truvisorySolutions.application.repository.InvoiceRepository;

@Service
public class InvoiceServiceImpl implements InvoiceService {
	@Autowired
	private InvoiceRepository invoiceRepository;

	@Override
	public Invoice saveInvoice(Invoice inv) {
		
		return invoiceRepository.save(inv);
	}

	@Override
	public Invoice updateInvoice(Invoice inv, Integer invId) {
		Invoice invoice=invoiceRepository.findById(invId).orElseThrow();
		invoice.setInvoiceAmount(inv.getInvoiceAmount());
		invoice.setInvoiceName(inv.getInvoiceName());
		return invoiceRepository.save(inv);
	}

	@Override
	public void deleteInvoice(Integer invId) {
	
		Invoice invoice=invoiceRepository.findById(invId).orElseThrow();
		invoiceRepository.delete(invoice);
		
	}

	@Override
	public Invoice getOneInvoice(Integer invId) {
		Invoice invoice =invoiceRepository.findById(invId).orElseThrow();
		
		return invoice;
	}

	@Override
	public List<Invoice> getAllInvoices() {
		
		return invoiceRepository.findAll();
	}
	

}
