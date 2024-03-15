import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdaptor;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.NeroCustomer;
import Entities.StarbucksCustomer;

import java.util.Date;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {

        //starbucks customer ekleme
        StarbucksCustomer starbucksCustomer1 =new StarbucksCustomer(1,"Ugur","Dülger",new Date(2000, 5,9),"11111111111",1);
        BaseCustomerManager customerManager1 = new StarbucksCustomerManager(new MernisServiceAdaptor());
        customerManager1.Save(starbucksCustomer1);

        //Nero customer ekleme
        NeroCustomer neroCustomer1 = new NeroCustomer(2,"Ugur","Dülger",new Date(2000, 5,9),"11111111111");
        BaseCustomerManager customerManager2 = new NeroCustomerManager();
        customerManager2.Save(neroCustomer1);

        //starbucks da alınan kahve kadar yıldız kazanadırma
        customerManager1.addStar(starbucksCustomer1,5);
    }
}