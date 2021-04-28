package com.tyss.shop.Groceryshop;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.config.EntityManagerConfig;
import com.tyss.grocerybean.EntityManagerSample;
import com.tyss.grocerybean.GroceryList;

public class GroceryTest {
public static void main(String[] args) {
	GroceryList groceryList=new GroceryList();
	groceryList.setGid(1);
	groceryList.setName("sugar");
	groceryList.setPrice(40);
	
	ApplicationContext context = new AnnotationConfigApplicationContext(EntityManagerConfig.class);
    EntityManagerSample demo= context.getBean(EntityManagerSample.class);
    EntityManager entityManager=demo.getEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    entityTransaction.begin();
    entityManager.persist(groceryList);
    entityTransaction.commit();
    System.out.println("Record inserted succesfully"); 
}
}
