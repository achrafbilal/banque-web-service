package org.example;

import proxy.BanqueService;
import proxy.BanqueWs;
import proxy.Compte;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BanqueService stub=new BanqueWs().getBanqueServicePort();
        double d=stub.convert(20);
        System.out.println(d);
        Compte c=stub.getCompte(2443);
        System.out.println(c.getSalaire());
        for (Compte compte:stub.listComptes()) {
            System.out.println(" - Compte numéro "+compte.getCode()+" a un salaire de : "+compte.getSalaire()+" dh");
        }
    }
}