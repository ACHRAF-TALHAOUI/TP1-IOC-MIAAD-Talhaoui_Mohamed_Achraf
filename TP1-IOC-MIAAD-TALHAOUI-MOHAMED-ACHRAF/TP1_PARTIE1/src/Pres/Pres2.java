package Pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args)  {
        try {
            Scanner scanner = new Scanner(new File("config.txt"));
            String daoClassname = scanner.nextLine();
            Class cDao= Class.forName(daoClassname);
            IDao dao=(IDao) cDao.getConstructor().newInstance();
            //System.out.println(dao.getData());

            String metierClassname = scanner.nextLine();
            Class cMetier = Class.forName(metierClassname);
            IMetier metier = (IMetier) cMetier.getConstructor().newInstance();
            //System.out.println(metier.getData());

            Method setDao= cMetier.getDeclaredMethod("setDao",IDao.class);
            setDao.invoke(metier, dao);

            System.out.println("resultats="+metier.calcul());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}