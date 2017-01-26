/**
 * 
 * @author KAKANAKOU MIGUEL
 *
 */
public final class SelectionSort {

	/**
	 * Use the selection sort method to sort the given array A
	 * 
	 * @param A Array of Comparable that contains the object to sort
	 */
	public static void sort(Comparable[] A) {
		if (A == null)
			return;
		int indice;
		int len = A.length;
		for (int i = 0; i < len - 1; i++) {
			indice = minIndice(A, i, len);
			swap(A, indice, i);
		}
	}

	private static boolean less(Comparable[] A, int i, int j) {
		int cmp = A[i].compareTo(A[j]);
		if (cmp < 0)
			return true;
		return false;
	}

	private static void swap(Comparable[] A, int i, int j) {
		Comparable inter = A[i];
		A[i] = A[j];
		A[j] = inter;
	}

	private static int minIndice(Comparable[] A, int lo, int hi) {
		int indice = lo;
		for (int i = lo + 1; i < hi; i++) {
			if (less(A, i, indice))
				indice = i;
		}
		return indice;
	}

}
