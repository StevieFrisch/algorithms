public class HeapSort<Key extends Comparable<Key>> {
	public HeapSort() {
	}

	// Note the STATIC functions throughout

	// integrate a[] into compare
	private static boolean less(Comparable a[], int i, int j) {
		return a[i].compareTo(a[j]) < 0;
	}

	// integrate a[] into exch
	private static void exch(Comparable a[], int i, int j) {
		Comparable t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	// integrate a[] and N into sink
	private static void sink(Comparable a[], int k, int N) {
		while (2 * k <= N) {
			int j = 2 * k;
			if (j < N && less(a, j, j + 1))
				j++;
			if (!less(a, k, j))
				break;
			exch(a, k, j);
			k = j;
		}
	}
	
	// our static HEAPSORT method
	 public static void sort(Comparable[] a)
	  {
	     int N = a.length-1; // OOPS BOOK? Can't tell.
	     for (int k = N/2; k >= 1; k--)
	        sink(a, k, N);
	     while (N > 1)
	     {
	        exch(a, 1, N--);
	        sink(a, 1, N);
	     }
	}
	 
		public static boolean isSorted(Comparable[] a) { // Test whether the array entries are in order.
			for (int i = 1; i < a.length; i++)
				if (less(a, i, i-1))
					return false;
			return true;
		}
	

}
