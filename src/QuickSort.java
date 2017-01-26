import java.util.Random;

/**
 * 
 * @author KAKANAKOU MIGUEL
 *
 */
public final class QuickSort {

	/**
	 * Use the Quicksort method to sort the given array A
	 * 
	 * @param A Array of Comparable that contains the object to sort
	 */
	public static void sort(Comparable[] A) {
		if (A == null)
			return;
		shuffle(A);
		sort(A, 0, A.length - 1);
	}

	private static void sort(Comparable[] A, int lo, int hi) {
		if (lo >= hi)
			return;
		int k = partition(A, lo, hi);
		sort(A, lo, k - 1);
		sort(A, k + 1, hi);
	}

	private static int partition(Comparable[] A, int lo, int hi) {
		int i = lo + 1;
		int j = hi;
		while (true) {
			while ((i < j) && !less(A[lo], A[i]))
				i++;
			while (less(A[lo], A[j]))
				j--;
			if (i >= j)
				break;
			swap(A, i, j);
			i++;
			j--;
		}
		swap(A, lo, j);
		return j;
	}

	private static void shuffle(Comparable[] A) {
		Random rdm = new Random();
		int r = 0;
		for (int i = 0; i < A.length; i++) {
			r = rdm.nextInt(i + 1);
			swap(A, i, r);
		}
	}

	private static void swap(Comparable[] A, int i, int j) {
		Comparable k = A[i];
		A[i] = A[j];
		A[j] = k;
	}

	private static boolean less(Comparable a, Comparable b) {
		int cmp = a.compareTo(b);
		if (cmp < 0)
			return true;
		return false;
	}

	private static boolean equals(Comparable a, Comparable b) {
		int cmp = a.compareTo(b);
		if (cmp == 0)
			return true;
		return false;
	}
}
