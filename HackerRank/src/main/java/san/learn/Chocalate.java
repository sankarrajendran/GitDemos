package san.learn;

public class Chocalate {

	public static void main(String[] args) {
		System.out.println(totalChoc(5, 0, 2, 5));
	}
	
	public static int totalChoc(int totalChoc, int balanceWrapper, int openedWrapperCount, int currentOpennedWrapper) {
		int chocByWrapper = currentOpennedWrapper / openedWrapperCount;
		int balanceOpenWrapper = currentOpennedWrapper % openedWrapperCount;
		
		if((balanceWrapper + balanceOpenWrapper) == openedWrapperCount) {
			totalChoc += (chocByWrapper + 1);
			balanceWrapper = 0;
		}else {
			
			balanceWrapper = balanceOpenWrapper;
			totalChoc += chocByWrapper;
		}
		
		totalChoc(totalChoc,balanceWrapper,openedWrapperCount,chocByWrapper);
		
		return totalChoc;
	}
}
