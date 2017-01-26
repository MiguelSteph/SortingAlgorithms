
/**
 * 
 * @author KAKANAKOU MIGUEL
 *
 */
public final class ShellSort {

	/**
	 * Use the shell sort method to sort the given array A
	 * 
	 * @param A Array of Comparable that contains the object to sort
	 */
	public static void sort(Comparable[] A) {
		if (A == null)
			return;
		int h = computeMaxH(A.length);
		while (h >= 1) {
			hInsertionSort(A, h);
			h = h / 3;
		}
	}

	private static void hInsertionSort(Comparable[] A, int h) {
		Comparable curVal;
		int j;
		for (int i = h; i < A.length; i = i + h) {
			curVal = A[i];
			j = i - h;
			while ((j >= 0) && less(curVal, A[j])) {
				A[j + h] = A[j];
				j = j - h;
			}
			A[j + h] = curVal;
		}
	}

	private static int computeMaxH(int len) {
		int h = 1;
		while (h < len / 3)
			h = 3 * h + 1;
		return h;
	}

	private static boolean less(Comparable a, Comparable b) {
		int cmp = a.compareTo(b);
		if (cmp < 0)
			return true;
		return false;
	}
}
