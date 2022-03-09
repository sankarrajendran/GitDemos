package san.learn.datastructuredemo.algortim.sorting;

public class QuickSortDemo {
	
	public static void main(String[] args) {
		
		int[] arr= {4,2,5,7,1,9,8,3};
		QuickSortDemo qsd = new QuickSortDemo();
		
		qsd.qucikSort(0, arr.length - 1, arr);
		
		for(int i = 0; i < arr.length ; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void qucikSort(int iV, int eV, int[] arr) {
		int loc;
		if(eV > iV) {
			loc = partition(iV, eV, arr);
			qucikSort(iV, loc - 1, arr);
			qucikSort(loc, eV, arr);
		}
	}
	
	public int partition(int iV, int eV, int[] arr) {
		int i = iV - 1;
		int pivot = arr[eV];
		for(int j = iV; j < eV ; j++) {
			if(arr[j] < pivot) {
				i++;
				swap(i, j, arr);
			}
		}
		i++;
		swap(i, eV, arr);
		return i;
	}

	private void swap(int i, int j, int[] arr) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
}
