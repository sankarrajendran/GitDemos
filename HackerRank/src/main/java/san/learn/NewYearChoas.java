package san.learn;

public class NewYearChoas {

	public static void main(String[] args) {
		int[] q = {2,1,5,3,4};
		minimumBribes(q);
	}

	static void minimumBribes(int[] q) {
        int jump = 0;
        for(int i = 0 ; i < q.length; i++){// 2 1 5 3 4
            int cV = q[i];//5
            int pV = i + 1;// i =2 , pV  = 3
            if(cV >= (pV + 2)){
                System.out.println("Too chaotic");
                return;
            } else if(cV < pV){
                continue;
            } else{
                jump += (cV - pV);
            }
        }
        System.out.println(jump);
    }
	
}
