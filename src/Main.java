import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Adapter.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
	
		BaseCustomerManager customerNero = new NeroCustomerManager(new MernisServiceAdapter());
		customerNero.Save(new Customer(1, "MustBeRealName", "MustBeRealSurname", LocalDate.of(2012, 12, 12), "MustBeRealNationalId"));
		

		BaseCustomerManager customerNero1 = new NeroCustomerManager(new MernisServiceAdapter());
		customerNero1.Save(new Customer(1, "Ezgi", "Dolna", LocalDate.of(2012, 1, 12), "12233"));
		
		BaseCustomerManager customerStarbucks = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerStarbucks.Save(new Customer(1, "MustBeRealName", "MustBeRealSurname", LocalDate.of(2012, 12, 12), "MustBeRealNationalId"));
		
		
	}
}
