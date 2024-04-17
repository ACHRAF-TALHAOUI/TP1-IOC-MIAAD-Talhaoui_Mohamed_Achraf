package dao;

import org.springframework.stereotype.Component;

@Component("dao")
public class DaoImpl implements IDao{
    @Override
    public double getData() {
         System.out.println("Version Base de donnees");
         double temp = Math.random()*40/Math.PI*8;
         return temp;
    }
}
