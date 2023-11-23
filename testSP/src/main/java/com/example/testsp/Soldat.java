package com.example.testsp;

public class Soldat implements Component {
    private String nume;

    public Soldat(String nume) {
        this.nume = nume;
    }

    @Override
    public void adauga(Component componenta) {
        System.out.println("Nu se poate adăuga într-o unitate.");
    }

    @Override
    public void elimina(Component componenta) {
        System.out.println("Nu se poate elimina dintr-o unitate.");
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Soldat: " + nume);
    }
}
