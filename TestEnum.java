package java_learn;

public class TestEnum {
	public enum myColor {red,green,blue};
	//只能取三者的一个
	public static void main(String[] args){
		myColor m =myColor.red;
		switch(m) {
		case red:
			System.out.println("red");
			break;
		case green:
			System.out.println("green");
			break;
		default:
			System.out.println("default");		
		}
		System.out.println(m);
	}

}
