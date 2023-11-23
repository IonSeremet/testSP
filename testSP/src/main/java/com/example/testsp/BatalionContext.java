package com.example.testsp;

public class BatalionContext {
    private Arme arme;

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public void preiaArmele() {
        if (arme != null) {
            arme.preiaArmele();
        } else {
            System.out.println("Batalionul nu are un set de arme");
        }
    }
}