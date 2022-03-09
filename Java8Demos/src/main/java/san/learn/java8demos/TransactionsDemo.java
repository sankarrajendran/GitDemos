package san.learn.java8demos;

import static java.util.stream.Collectors.*;
import static java.util.Comparator.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class TransactionsDemo {

	public static void main(String[] args) {
		Transaction t1 = new Transaction(1,"Grocery","Dal",80);
		Transaction t2 = new Transaction(2,"Fruit","Apple",200);
		Transaction t3 = new Transaction(3,"Vegitable", "beans",20);
		Transaction t4 = new Transaction(4,"Grocery", "oil", 150);
		Transaction t5 = new Transaction(5,"Fruit", "PineApple",300);
		Transaction t6 = new Transaction(5,"Vegitable","brinjal",100);
		Transaction t7 = new Transaction(5,"Fruit","Orange",300);
		Transaction t8 = new Transaction(5,"Vegitable","carrot", 50);
		
		List<Transaction> l = Arrays.asList(t1,t2,t3,t4,t5,t6,t7,t8);
		
		//Print only Vegitable by Sort
		l.stream().filter(t -> t.getType().equalsIgnoreCase("Vegitable"))
		.sorted(comparing(Transaction::getItem))
		.sorted(comparing(Transaction::getItem).reversed())
		.forEach(System.out::println);
		
		System.out.println("Reversed Fruits ******************************************************");
		
		//Total Amount
		l.stream().map(Transaction::getItem).forEach(System.out::println);
		System.out.println("Get only for Item in list ******************************************************");
		List<Integer> la = Arrays.asList(3,4,5,6,7,8);
		
	
		la.stream().map(t -> t * t).forEach(System.out::println);
		System.out.println("multiple by same item s******************************************************");
		
		System.out.println("=================== Stream filter process ===================");
		//Limit only the top n item
		la.stream().map(t -> t * t).limit(2).forEach(System.out::println);
		System.out.println("Limit 2 items ******************************************************");
		
		//Skip value
		la.stream().limit(4).skip(2).forEach(System.out::println);
		System.out.println("Skip 2 from limit 4******************************************************");
		
		//Duplicate remove by distinct
		la.stream().map(t -> t * t).distinct().forEach(System.out::println);
		System.out.println("******************************************************");
		
		
		System.out.println("Stream Finding and Matching , anyMatch, allMatch, noneMatch ===================");
		
		/**
		 * Return true if all in stream is greater than 2, If any one find as less than , then return false.
		 */
		System.out.println(la.stream().allMatch(t -> t > 2));
		/**
		 * Return true if any one match 
		 */
		System.out.println("Any Match : "+la.stream().anyMatch(t -> t > 7));
		
		
		//Finding
		/**
		 * Finding will return the Optional object
		 */
		la.stream().filter(t -> t > 5).findAny().ifPresent(System.out::println);
		
		List<String> st = Arrays.asList("siva","sankar");
		
		st.stream().map(String::length).forEach(System.out::println);
		
		OptionalInt min = l.stream().mapToInt(Transaction::getPrice).min();
		System.out.println("Minimum Price : "+min.getAsInt());
		
	}
	
}

class Transaction{
	private int tID;
	private String type;
	private String item;
	private int price;
	public Transaction(int tID, String type, String item, int price) {
		super();
		this.tID = tID;
		this.type = type;
		this.item = item;
		this.price = price;
	}
	public int gettID() {
		return tID;
	}
	public void settID(int tID) {
		this.tID = tID;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getItem() {
		return item;
	}
	public int getPrice() {
		return price;
	}
	@Override
	public String toString() {
		return "Transaction [tID=" + tID + ", type=" + type + ", item=" + item + ", price=" + price + "]";
	}
	
}