package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{

	private CustomerCheckService _CheckService;
	
	public StarbucksCustomerManager (CustomerCheckService checkService) {
		_CheckService=checkService;
	}
	@Override
	public void Save(Customer customer) {
		CheckIfRealPerson(customer);
		
	}

	private void CheckIfRealPerson(Customer customer) {
		
		
	}

}
