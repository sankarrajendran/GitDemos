package san.learn;

import java.util.Arrays;

public class MinimumSwap2 {
	
	public static void main(String[] args) {
		int[] a = {2,3,4,1,5};
		int swap = minimumSwaps(a);
		System.out.println(swap);
		for (int i : a) {
			System.out.print(i+" ");
		}
	}

	static int minimumSwaps(int[] a) {
        boolean loopControl = true;
        int swapCount = 0;
        while(loopControl){
            int sorted = 0;
            for(int i = 0 ; i < a.length; i++){
                if(a[i] == (i + 1)){
                    sorted++;
                    continue;
                }else{
                    int v = a[i];
                    if(a[v - 1] < v){
                        int t = a[v - 1];
                        a[v - 1] = v;
                        a[i] = t;
                        swapCount++;
                    }
                }
            }
            if(sorted == a.length)loopControl = false;
            sorted = 0;
        }
        return swapCount;
    }
}
