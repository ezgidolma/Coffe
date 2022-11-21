package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Entities.Customer;

public class NeroCustomerManager extends BaseCustomerManager {

private CustomerCheckService _customerCheckService;
	
	
	public NeroCustomerManager(CustomerCheckService _customerCheckService) {
		this._customerCheckService = _customerCheckService;
	}

	
	@Override
	public void Save(Customer customer) {
		if (_customerCheckService.CheckIfRealPerson(customer)) {
			super.Save(customer);
		}else {
			System.out.println("Not a valid person");
		}
		
	}
	
	public boolean CheckIfRealPerson(Customer customer) {
		return true;
	}

}
