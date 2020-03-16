package com.dml.dao;

import java.util.List;

import com.dml.model.Contacto;

public interface ContactoDAO {
	
	  public void saveOrUpdate(Contacto contact);
	     
	  public void delete(int contactId);
	     
	  public Contacto get(int contactId);
	     
	  public List<Contacto> list();

}
