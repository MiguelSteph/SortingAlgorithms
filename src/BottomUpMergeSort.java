
/**
 * 
 * @author KAKANAKOU MIGUEL
 *
 */
public final class BottomUpMergeSort {

	/**
	 * Use the merge sort method to sort the given array A
	 * 
	 * @param A Array of Comparable that contains the object to sort
	 */
	public static void sort(Comparable[] A) {
		if (A == null)
			return;
		int len = A.length;
		int subSize = 1;
		int lo, mid, hi;
		while (subSize < len ) {
			lo = -2 * subSize;
			while (true) {
				lo = lo + 2 * subSize;
				mid = lo + subSize - 1;
				hi = mid + subSize;
				
				if (mid >= len)
					break;
				else if (hi >= len)
					hi = len - 1;
				merge(A, lo, mid, hi);
			}
			subSize *= 2;
		}
	}

	private static void merge(Comparable[] A, int lo, int mid, int hi) {
		int leftSize = mid - lo + 1;
		int rightSize = hi - mid;
		Comparable[] left = new Comparable[leftSize];
		Comparable[] right = new Comparable[rightSize];

		for (int i = 0; i < leftSize; i++)
			left[i] = A[lo + i];

		for (int i = 0; i < rightSize; i++)
			right[i] = A[mid + i + 1];

		int leftPt = 0;
		int rightPt = 0;
		for (int i = lo; i <= hi; i++) {
			if (leftPt >= leftSize) {
				A[i] = right[rightPt];
				rightPt++;
			} else if (rightPt >= rightSize) {
				A[i] = left[leftPt];
				leftPt++;
			} else {
				if (less(right[rightPt], left[leftPt])) {
					A[i] = right[rightPt];
					rightPt++;
				} else {
					A[i] = left[leftPt];
					leftPt++;
				}
			}
		}
	}

	private static boolean less(Comparable a, Comparable b) {
		int cmp = a.compareTo(b);
		if (cmp < 0)
			return true;
		return false;
	}

}
