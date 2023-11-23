package com.example.testsp;

import java.util.ArrayList;
import java.util.List;

public class BatalionGroup implements Component {
    private String nume;
    private List<Component> componente = new ArrayList<>();

    public BatalionGroup(String nume) {
        this.nume = nume;
    }

    @Override
    public void adauga(Component componenta) {
        componente.add(componenta);
    }

    @Override
    public void elimina(Component componenta) {
        componente.remove(componenta);
    }

    @Override
    public void afiseazaDetalii() {
        System.out.println("Batalion: " + nume);
        for (Component component : componente) {
            component.afiseazaDetalii();
        }
    }
}
