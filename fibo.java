package pro_buddy;

public class fibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		int[] a = new int[n];
		a[0] = 1;
		a[1] = 2;
		//int temp = 0;
		for (int i = 0; i < n; i++) {

			if(i+2<a.length) {
			a[i + 2] = a[i] + a[i + 1];

			System.out.println(a[i]);
//			// break;
//			if (a[i] % 2 == 0) {
//				temp = temp + a[i];
//				
//			}
//		}
//	}
//		System.out.println("value of temp is:" + temp);
	}

}
	}
}
	
