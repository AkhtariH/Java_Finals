package com.company;

import com.company.employee.Contractor;
import com.company.employee.FullTime;
import com.company.employee.PartTime;
import com.company.order.ExpressOrder;
import com.company.order.NormalOrder;
import com.company.order.Order;
import com.company.store.Customer;
import com.company.store.Product;
import com.company.store.Store;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_PURPLE = "\u001B[35m";

    public static void main(String[] args) {

		//Creating store
		Store store = new Store("Media Markt");

		//Creating customers
		Customer c1 = new Customer(1, "Arnold");
		Customer c2 = new Customer(2, "Bob");
		Customer c3 = new Customer(3, "Hemon");

		//Creating employees
		FullTime e1 = new FullTime(1, "Damon", 15);
		FullTime e2 = new FullTime(2, "Thom", 15);
		Contractor e3 = new Contractor(3, "Malcolm", 20);
		PartTime e4 = new PartTime(4, "Pip", 13);
		PartTime e5 = new PartTime(5, "Pop", 13);

		//Creating products
		Product p1 = new Product(1, "TV", 135);
		Product p2 = new Product(2, "Mouse pad", 12);
		Product p3 = new Product(3, "iPhone XS", 756);
		Product p4 = new Product(4, "iPad", 567);
		Product p5 = new Product(5, "Samsung", 5);
		Product p6 = new Product(6, "iPod", 415);
		Product p7 = new Product(7, "Airpods", 230);

		//LocalDate
		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.now();
		LocalDate date3 = LocalDate.now();

		//Creating orders
		NormalOrder o1 = new NormalOrder(1, date1);
		NormalOrder o2 = new NormalOrder(2, date2);
		ExpressOrder o3 = new ExpressOrder(3, date3);
		ExpressOrder o4 = new ExpressOrder(4, date3);



		//Adding customers to list
		store.addCustomerToList(c1);
		store.addCustomerToList(c2);
		store.addCustomerToList(c3);

		//Adding employees to list
		store.addEmployeeToList(e1);
		store.addEmployeeToList(e2);
		store.addEmployeeToList(e3);
		store.addEmployeeToList(e4);
		store.addEmployeeToList(e5);

		//Adding orders to list
		store.addOrderToList(o1);
		store.addOrderToList(o2);
		store.addOrderToList(o3);
		store.addOrderToList(o4);


		//Adding products to order
		o1.addProduct(p1);
		o1.addProduct(p2);
		o1.addProduct(p3);
		o2.addProduct(p4);
		o2.addProduct(p5);
		o3.addProduct(p6);
		o3.addProduct(p7);

//		//Adding orders to customer
//		c1.addOrder(o1);
//		c2.addOrder(o2);
//		c3.addOrder(o3);

		//Adding orders to employees
		e1.addOrder(o1);
		e3.addOrder(o2);
		e4.addOrder(o3);
		e4.addOrder(o4);

		ArrayList<Order> o1Collection = new ArrayList<>();
		o1Collection.add(o1);
		o1Collection.add(o2);
		//Adding customers to order
		store.customersToOrder(c1, o1Collection);
/*		store.CustomersToOrder(c2, o2);
		store.CustomersToOrder(c3, o3);
		store.CustomersToOrder(c1, o2);*/

		//Adding employees to order
		//store.EmployeesToOrder(e1, o1);
		//store.EmployeesToOrder(e3, o2);
		//store.EmployeesToOrder(e4, o3);
		//store.EmployeesToOrder(e4, o4);

		Scanner myObj = new Scanner(System.in);
		System.out.println( "Info about store "+ ANSI_GREEN + store.getStoreName() + ANSI_RESET +": 1");
		System.out.println("Info about" + ANSI_GREEN + " customers" + ANSI_RESET + ": 2");
		System.out.println("Info about" + ANSI_GREEN + " orders" + ANSI_RESET + ": 3");
		System.out.println("Info about" + ANSI_GREEN + " employees" + ANSI_RESET + ": 4");
		System.out.println(ANSI_PURPLE + "When done type exit" + ANSI_RESET);
		boolean validData = true;

		// String input
		String input = "";

		while(validData) {
			try
			{
				input = myObj.next();
			}
			catch (InputMismatchException ex)
			{
				System.out.println(ex.getMessage());
			}

			if (input.equals("1"))
			{
				System.out.println("Total revenue of " + store.getStoreName() + " is " + ANSI_GREEN + store.calculateRevenue() + "\u20ac." + ANSI_RESET);
			}
			else if (input.equals("2"))
			{
				store.printInfoCustomer();
			}
			else if (input.equals("3"))
			{
				store.printInfoOrder();
			}
			else if (input.equals("4"))
			{
				store.printInfoEmployee();
			}
			else if (input.equals("exit"))
			{
				break;
			}
			else
			{
				System.out.println("Type again!");
			}
		}
	}
}
