package com.budget.Controller.model;


import javax.persistence.*;

@Entity
@Table(name="Categorie")
public class Categorie {
    private String Logement;

    public String getAlimentation() {
        return Alimentation;
    }

    public void setAlimentation(String alimentation) {
        Alimentation = alimentation;
    }

    public String getTransport() {
        return Transport;
    }

    public void setTransport(String transport) {
        Transport = transport;
    }

    public String getLogement() {
        return Logement;
    }

    public void setLogement(String logement) {
        Logement = logement;
    }

    private String Transport;
    private String Alimentation;

}

