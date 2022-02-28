package san.learn;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SherlockandtheValidString {

	public static void main(String[] args) {
		String s = "abc";
		int cV,pV;
		Map<Character, Integer> m = new HashMap<Character, Integer>();
		Arrays.asList(s.toCharArray()).stream().forEach(e ->{
			System.out.println(e);
				
		});
	}

	public void processMap(Map<Character, Integer> m, char c) {
		
	}
}
