package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {

        //  A.l'injection des dépendances
        //  2. Par instanciation dynamique

        //dao
        Scanner scanner = new Scanner(new File("config.txt"));
        String daoClassName = scanner.nextLine();
        Class cDao = Class.forName(daoClassName);
        IDao dao=(IDao) cDao.getConstructor().newInstance();


        //Metier
        String metierClassName= scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier =(IMetier) cMetier.getConstructor().newInstance();
        Method setDao = cMetier.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,dao); // Injection des dependances

        // affichage du résultat avec la methode calcul()
        System.out.println("Resultat = "+ metier.calcul());
    }
}
