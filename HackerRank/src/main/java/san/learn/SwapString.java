package san.learn;

public class SwapString {

	public static void main(String[] args) {
		swapString("abcd", 5);
	}

	public static void swapString(String str, int swapCount) {
		int sL = str.length();
		char[] ca = new char[sL];
		for(int i = 0; i  < sL ; i++) {
			int cAI = i + swapCount;
			if(cAI < sL)
				ca[cAI] = str.charAt(i);
			else
				ca[cAI - sL] = str.charAt(i);
		}
		System.out.println(str = String.copyValueOf(ca));
	}
	
}
