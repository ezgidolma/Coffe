package Adapter;

import Abstract.CustomerCheckService;
import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter  implements CustomerCheckService{


	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		
		KPSPublicSoap client = new KPSPublicSoapProxy();
		
		try 
		{
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationaltyId()), customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth().getYear());
		} 
		catch (Exception e) 
		{
		}
		return false;
	}


}
