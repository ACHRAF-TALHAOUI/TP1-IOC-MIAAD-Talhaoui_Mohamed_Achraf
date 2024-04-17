package pres;

import dao.DaoImpl;
import metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        // A. l'injection des dépendances
        // 1 . Par instanciation statique
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        //metier.setDao(dao);
        System.out.println("Resultat = "+ metier.calcul());

    }

}
