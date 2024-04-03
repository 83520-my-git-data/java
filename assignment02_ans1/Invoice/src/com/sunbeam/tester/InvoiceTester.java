package com.sunbeam.tester;

import com.sunbeam.Invoice.Invoice;

public class InvoiceTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Invoice i1 = new Invoice("100", "T", 10, 100 );
		System.out.println("Bill = "+ i1.calculateInvoice());

	}

}
