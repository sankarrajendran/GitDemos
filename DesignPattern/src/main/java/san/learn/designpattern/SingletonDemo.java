package san.learn.designpattern;

import java.util.Iterator;

public class SingletonDemo {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			System.out.println(SingletonEager.getInstance());
		}
	}

}

class SingletonEager{
	public static SingletonEager se = new SingletonEager();
	
	public SingletonEager() {}
	
	public static SingletonEager getInstance() {
		if(se == null)
			se = new SingletonEager();
		return se;
	}
}