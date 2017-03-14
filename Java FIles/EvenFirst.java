public class EvenFirst {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 8, 1, 7, 6, 5, 2 };

		prt(arr);
		evenOdd(arr, 0, arr.length - 1);
		prt(arr);
	}

	static void evenOdd(int[] a, int i, int j) {
		if (i >= j)
			return;
		if (a[i] % 2 == 0)
			evenOdd(a, i + 1, j);
		else {
			if (a[j] % 2 == 0) {
				swap(a, i, j);
				evenOdd(a, i + 1, j - 1);
			} else
				evenOdd(a, i, j - 1);
		}
	}

	static void prt(int[] a)
	{
		for(int i=0;i<a.length;++i)
			System.out.print(a[i] + "  ");
		System.out.println();
	}

	static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
}
