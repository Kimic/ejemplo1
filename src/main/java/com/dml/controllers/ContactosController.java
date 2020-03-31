package com.dml.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.dml.dao.ContactoDAO;

public class ContactosController {

	 @Autowired
	 private ContactoDAO contactDAO;
	 
	 public void hacerAlgo() {
		 System.out.println("Hacer commit");
	 }
	 
}
