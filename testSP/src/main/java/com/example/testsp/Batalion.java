package com.example.testsp;

import java.util.List;

public class Batalion implements Component {
    private String nume;
    private List<String> creaturi;

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setCreaturi(List<String> creaturi) {
        this.creaturi = creaturi;
    }

    public String getNume() {
        return nume;
    }

    public List<String> getCreaturi() {
        return creaturi;
    }

    public Batalion(String nume, List<String> creaturi) {
        this.nume = nume;
        this.creaturi = creaturi;
    }

    public Batalion(String nume) {
        this.nume = nume;
        incarcaDetalii();
    }

    private void incarcaDetalii() {
        System.out.println("Detaliile despre batalionul " + nume + " au fost încărcate.");
    }

    @Override
    public void adauga(Component componenta) {

    }

    @Override
    public void elimina(Component componenta) {

    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Batalion: " + nume);
    }
}
