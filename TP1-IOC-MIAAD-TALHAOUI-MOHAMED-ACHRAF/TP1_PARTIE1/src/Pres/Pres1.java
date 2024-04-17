package Pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        // A. l'injection des dépendances
        // 1. instanciation statique.
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);
        System.out.println("Resultat = "+ metier.calcul());

    }

}
