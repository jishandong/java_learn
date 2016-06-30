package java_learn;

public class digui_clc {
	public static void main(String[] args) {
		System.out.println(method(5));
		System.out.println(fab(5));
	}
	
	public static int method(int n) {
		if (n == 1)
			return 1;
		else
			return n*method(n-1);
	}
	
	public static int fab(int n) {
		if (n == 1 || n == 2){
			return 1;
		} else {
			return fab(n-1) + fab(n-2);
		}
		
	}

}
