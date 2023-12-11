package classTest;



class Store{
	String productName;
	int productPrice;
	int stock;	
	
	public Store() {
		;
	}
	
	public Store(String productName, int productPrice, int stock) {
		this.productName = productName;
		this.productPrice = productPrice;
		this.stock = stock;
	}

	void sell(Customer customer) {
		stock--;
		customer.balance -= productPrice*((100-customer.discountRate)*0.01);
	}
}



class Customer{
	String name;
	String phoneNumber;
	int balance;
	int discountRate;
	public Customer() {
		;
	}
	public Customer(String name, String phoneNumber, int balance, int discountRate) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		this.discountRate = discountRate;
	}
	
	
}



public class ClassTask2 {
	
	public static void main(String[] args) {
		Store store = new Store("새우깡", 1500, 20);
		Customer customer = new Customer("손진혁","010-6489-6879",200000,20);
		store.sell(customer);
		System.out.println(customer.balance);
	}
}
