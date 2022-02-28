package san.learn;

public class BalancedBrakets {
	
	static int cal = 0;
	
	public static void main(String[] args) {
		String s = "[](){()}";
		System.out.println(checkBrackets(s));
		System.out.println(cal);
	}
	
	public static String checkBrackets(String s) {
		cal++;
		char c = s.charAt(0);
		char oc;
		if(c == '[') oc = ']';
		else if(c == '{') oc = '}';
		else if(c == '(') oc = ')';
		else return "NO";
		int lastIndex = s.lastIndexOf(oc);
		if(lastIndex == 1 && s.length() == 2) {
			return "Yes";
		}else if(lastIndex == -1) {
			return "No";
		}
		if(lastIndex == s.length() - 1) {
			String sS = s.substring(1, s.length() - 1);
			String rs = checkBrackets(sS);
			if(rs.equalsIgnoreCase("No"))
				return "No";
		} else if(lastIndex < s.length() - 1){
			String sS = s.substring(lastIndex + 1);
			if(sS.length() == 1)
				return "No";
			String r1 = checkBrackets(sS);
			if(r1.equalsIgnoreCase("No"))
				return "No";
			if(s.substring(0, lastIndex).length() > 2) {
			sS = s.substring(1 , lastIndex);
			r1 = checkBrackets(sS);
			if(r1.equalsIgnoreCase("No"))
				return "No";
			}
		}
		return "Yes";
	}
}
