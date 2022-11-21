package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager implements CustomerCheckService{

	private CustomerCheckService _CheckService;
	
	public StarbucksCustomerManager (CustomerCheckService checkService) {
		_CheckService=checkService;
	}
	
	@Override
	public void Save(Customer customer) {
		
		if (_CheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		}
		
		
	}

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		return true;
	}
	
		
	}

	

}
