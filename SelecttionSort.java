package java_learn;

public class SelecttionSort {
	public static void main(String[] args) {
		int[] a = new int [args.length];
		int b[] = {1,3,4,7,6,5,4};
		
		for (int i =0;i < args.length;i++) {
			a[i] = Integer.parseInt(args[i]);				
		}
		print (b);
		sort(b);
		print(b);
		search(b,4);
		binarySearch(b, 4);
	}
	
	private static void print(int[] a) {
		//将数组打印出来
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i] + " ");
		}
	}
	
	private static void sort(int[] a) {
		//每次都是取最小值
		int k , temp;
		for(int i = 0;i<a.length;i++){
			//假设当前最小
			k = i;
			for (int j=k+1;j<a.length;j++){
				if(a[j]<a[k]) {
					//交换位置
					k=j;
				}
			}
			//交换
			if(k != i) {
				temp = a[i];
				a[i]= a[k];
				a[k] = temp;
			}
		}
	}
	public static int  search(int [] a ,int num) {
		for(int i =0 ;i<a.length;i++) {
			if(a[i] == num) {
				System.out.println(i);
				return i;
			}
		}
		return -1;
	}
	/*
	 * 二分法查找
	 * 
	 */
	public static int binarySearch(int[] a, int num) {
		if (a.length==0) return -1 ;
		int startPos = 0;
		int endPos = a.length-1;
		int m = (startPos+endPos)/2;
		while (startPos <= endPos) {
			if(num ==a[m]) {
				System.out.println(m);
				return m;
				}
			if(num > a[m]) {
				startPos = m+1;
			}
			if(num <a[m]) {
				endPos = m-1;
			}
			m = (startPos + endPos)/2;
		}		
		return -1;
	}
}
