package san.learn.datastructuredemo.list;

import java.util.*;
import java.util.stream.IntStream;

public class ArrayListDemo {

	public static void main(String[] args) throws InterruptedException {
		List<Integer> l = new ArrayList<>();
		
		IntStream.range(1, 100).forEach(l::add);
		
		Runnable r1 = () -> l.forEach(e -> {
			try {
				Thread.sleep(200);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName()+" print "+ e);
		});
		
		Runnable r2 = () -> {
			System.out.println(Thread.currentThread().getName()+" going to add 101 value at 33 index position.");
			l.add(33, 101);};
			
		Thread t1 = new Thread(r1);
		t1.start();
		Thread.sleep(2000);
		System.out.println("Thread 2 going to start.");
		Thread t2 = new Thread(r2);
		t2.start();
		
		
		
	}
	
	

}
