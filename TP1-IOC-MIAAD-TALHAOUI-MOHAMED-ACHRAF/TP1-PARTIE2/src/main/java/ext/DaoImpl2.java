package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImpl2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version Capteurs");
        double temp=Math.cos(48)*98/Math.PI;
        return temp;
    }
}
