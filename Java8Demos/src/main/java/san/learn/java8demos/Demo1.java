package san.learn.java8demos;

import java.util.Arrays;
import java.util.List;

public class Demo1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
		
		numbers.stream().map(String::valueOf).forEach(System.out::println);
		
		System.out.println(
				numbers.stream().reduce(1, (t, e) -> Integer.sum(t, e)) +" : "+
				numbers.stream().reduce(Integer::sum)
				);
	}

	 
	
}
