package com.example.testsp;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestSpApplication {

    public static void main(String[] args) {

        //Composite pattern
        BatalionGroup batalionPrincipal = new BatalionGroup("Batalionul lui Aragon");

        Soldat elf1 = new Soldat("Malfurion");
        Soldat elf2 = new Soldat("Illidan");
        Soldat elf3 = new Soldat("Tyrande");
        Soldat gnom1 = new Soldat("Khaz Modan");
        Soldat gnom2 = new Soldat("Hagin");


        BatalionGroup batalionElfi = new BatalionGroup("Batalion Elfi");
        batalionElfi.adauga(elf1);
        batalionElfi.adauga(elf2);
        batalionElfi.adauga(elf3);

        BatalionGroup batalionPrincipalGnomi = new BatalionGroup("Batalion Gnomi");
        batalionPrincipalGnomi.adauga(gnom1);
        batalionPrincipalGnomi.adauga(gnom2);

        batalionPrincipal.adauga(batalionElfi);
        batalionPrincipal.adauga(batalionPrincipalGnomi);

        batalionPrincipal.afiseazaDetalii();
        System.out.println("                              ");
        System.out.println("------------------------------");
        System.out.println("                              ");

        //Proxy Pattern
    ProxyComponent batalionProxy = new ProxyBatalion("Proxy");

        System.out.println("Detaliile nu au fost încărcate încă.");

        batalionProxy.afiseazaDetalii();

        System.out.println("                              ");
        System.out.println("------------------------------");
        System.out.println("                              ");

        //Strategy Pattern
        BatalionContext batalion = new BatalionContext();

        batalion.setArme(new Sabii());
        batalion.preiaArmele();

        batalion.setArme(new Arcuri());
        batalion.preiaArmele();
    }

}
