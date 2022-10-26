package interfaceex;

public class CustomerTest {

	public static void main(String[] args) {

		Customer customer = new Customer();
	
		Buy buyer = customer;
		buyer.buy();
		buyer.order();
		System.out.println("=====================");
		
		Sell seller = customer;
		seller.sell();
		seller.order();
		System.out.println("=====================");
		
		
		if( seller instanceof Customer){
			Customer customer2 = (Customer)seller;  // 다운 캐스팅
			customer2.buy();
			customer2.sell();
		}
		
		customer.order();
	}
}


