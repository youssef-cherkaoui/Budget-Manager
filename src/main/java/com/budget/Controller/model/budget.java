package com.budget.Controller.model;


import javax.persistence.*;

@Entity
@Table(name="budget")
public class budget {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int IdBudget;
    private float prix;

    // Getters Setters

    public budget(float prix) {
        this.prix = prix;
    }

    public budget() {

    }

    public void setIdBudget(int idBudget) {
        IdBudget = idBudget;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getIdBudget() {
        return IdBudget;
    }

}

