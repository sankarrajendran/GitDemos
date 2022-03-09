package san.learn.datastructuredemo.algortim.sorting;

public class MergeSortDemo {

	public static void main(String[] args) {
		int[] a = {3,6,2,1};
		
		MergeSortDemo msd = new MergeSortDemo();
		
		msd.sort(a, 0, a.length - 1);
		
		for (int i : a)	System.out.println(i);
	}

	public void sort(int[] arr, int l, int r) {
		if(l < r) {
			int m = l + (r - l) / 2;
			
			sort(arr, l, m);
			sort(arr, m + 1 , r);
			
			merge(arr, l, m, r);
		}
	}
	
	public void merge(int[] arr, int l, int m, int r) {
		int n1 = m - l + 1;
		int n2 = r - m;
		
		int[] L = new int[n1];
		int[] R = new int[n2];
		
		for(int i = 0; i < n1; i++)
			L[i] = arr[l + i];
		for(int j = 0; j < n2; j++)
			R[j] = arr[m + 1 + j];
		
		int i = 0, j = 0, k = l;
		
		while(i < n1 && j < n2) {
			if(L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			}else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}
		while(i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}
		while(j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}
	
}
