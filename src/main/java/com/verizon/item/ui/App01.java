package com.verizon.item.ui;

import java.time.LocalDate;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import com.verizon.item.model.Catg;
import com.verizon.item.model.Item;
import com.verizon.item.util.ItemUtil;


public class App01 {
	public static void main(String[] args) {
		
	
	
	Item i=new Item("AC", LocalDate.of(2018, 9, 12),10000.00, Catg.ELEC, true);
	EntityManager em=ItemUtil.getEntityManagerFactory().createEntityManager();
	
	EntityTransaction txn=em.getTransaction();
	
	txn.begin();
	em.persist(i);
	txn.commit();
	ItemUtil.shutdown();
	
	
}}
