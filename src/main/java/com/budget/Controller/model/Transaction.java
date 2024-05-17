package com.budget.Controller.model;


import javax.persistence.*;

@Entity
@Table(name = "Transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id_Transaction;
    private float Montant ;
    private String Description;

    public Transaction(float montant) {
        Montant = montant;
    }

    public Transaction(String description) {
        Description = description;
    }

    public Transaction() {

    }

    public String getDescription() {
        return Description;
    }

    public int getId_Transaction() {
        return Id_Transaction;
    }

    public float getMontant() {
        return Montant;
    }

    public void setId_Transaction(int id_Transaction) {
        Id_Transaction = id_Transaction;
    }

    public void setMontant(float montant) {
        Montant = montant;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public Transaction(int id_Transaction) {
        Id_Transaction = id_Transaction;
    }
}
