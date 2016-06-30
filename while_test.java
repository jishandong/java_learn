package java_learn;

public class while_test {
	public static void main(String[] args) {
		int i =0;
		while(i<10) {
			int skip =5;
			if (i == skip) continue;
			System.out.println(i);
			i++;
		}
		i = 0;
		do {
			System.out.println(i);
			i++;
		} while(i < 10);
	}

}
