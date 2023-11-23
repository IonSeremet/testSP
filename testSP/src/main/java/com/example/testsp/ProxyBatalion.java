package com.example.testsp;

public class ProxyBatalion implements ProxyComponent {
    private Batalion batalion;
    private String nume;

    public ProxyBatalion(String nume) {
        this.nume = nume;
    }

    @Override
    public void adauga(Component componenta) {

    }

    @Override
    public void elimina(Component componenta) {

    }

    @Override
    public void afiseazaDetalii() {
        long startTime = System.currentTimeMillis();

        if (batalion == null) {
            batalion = new Batalion(nume);
        }

        long endTime = System.currentTimeMillis();
        long duration = endTime - startTime;

        System.out.println("Detaliile au fost încărcate în " + duration + " milisecunde.");
        batalion.afiseazaDetalii();
    }
}
