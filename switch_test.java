package java_learn;

public class switch_test {
	public static void main(String[] args) {
		int i =19;
		switch(i) {
		case 8 :
			System.out.println("8");
			break;
		/*
		 * case ¶à¸ö
		 */
		case 19:
		case 18:
			System.out.println("3");
			break;
		default:
			System.out.println("error");
		}
	}

}
