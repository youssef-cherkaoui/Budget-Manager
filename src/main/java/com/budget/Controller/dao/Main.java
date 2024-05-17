package com.budget.Controller.dao;



import com.budget.Controller.model.Categorie;
import com.budget.Controller.model.Transaction;
import com.budget.Controller.model.User;
import com.budget.Controller.model.budget;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Locale;

public class Main {

    public static <Categorie> void main(String[] args) {
        // Create the EntityManagerFactory
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("default");

        // Create the EntityManager
        EntityManager entityManager = factory.createEntityManager();

        try {
            // Create a user object
            User user = new User();
            user.setName("youssef");


            Transaction transaction = new Transaction();
            transaction.setMontant(772);
            transaction.setDescription("description");

            budget Budget = new budget();
            Budget.setPrix(9000);


            


            // Start a transaction
            entityManager.getTransaction().begin();

            // Save the user object
            entityManager.persist(user);
            entityManager.persist(transaction);
            entityManager.persist(Budget);

            // Commit transaction
            entityManager.getTransaction().commit();
            System.out.println("Insteretion validée");
        } finally {
            entityManager.close();
            factory.close();
        }
    }
}