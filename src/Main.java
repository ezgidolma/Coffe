import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new NeroCustomerManager() ;
		customerManager.Save(new Customer(0,"ezgi","dolma",LocalDate.of(2001, 12, 16),"123"));
		

	}
}
