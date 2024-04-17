package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MetierImpl implements IMetier {
   // @Autowired
    private IDao dao;

    public MetierImpl(IDao dao){ //pour injection avec constructeur
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double temp = dao.getData();
        double res = temp*11/Math.tan(84/Math.PI);
        return res;
    }
    public void setDao(IDao dao) {
         this.dao = dao;
    }
}
