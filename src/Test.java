
public class Test {

	public static void main(String[] args) {

		String[] A = { "zs", "qw", "qr", "miguel", "rtd", "fgs", "qq", "mk", "slao", "oiu", "vf", "xs", "er", "qw", "bv" };
		Integer[] B = { 2, 4, 7, 542, 0, 1, 3, 0, 6, 2, 7, 9, 10, 2, 4, 6, 0, 3, 2, 9, 2, 77, 33, 22, 5, 4, 2, 2, 2 };

		
//		SelectionSort.sort(A);
//		SelectionSort.sort(B);
//		
//		InsertionSort.sort(A);
//		InsertionSort.sort(B);
//		
//		ShellSort.sort(A);
//		ShellSort.sort(B);
//		
//		MergeSort.sort(A);
//		MergeSort.sort(B);
//		
//		QuickSort.sort(A);
//		QuickSort.sort(B);
//		
//		BottomUpMergeSort.sort(A);
//		BottomUpMergeSort.sort(B);
		
		HeapSort.sort(A);
		HeapSort.sort(B);
		
		//Display
		display(A);
		display(B);

	}

	private static void display(Comparable[] A){
		for(Comparable s: A){
			System.out.print(s+" ");
		}
		System.out.println();
		System.out.println();
	}
	
}
