package java_learn;

public class string_learn {
	public static void main(String[] args) {
		String s1 = "sun java",s2 = "Sun Java";
		System.out.println(s1.charAt(0));
		System.out.println(s1.length());
		System.out.println(s1.indexOf("java"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		String s = "我是程序员，我在学习java";
		String sr = s.replace('我', '你');
		System.out.println(sr);
		String a = "aaaaaaaaaaaaaBBBBBBBBBBBBBBBBBCCCCCCCCCC";
		int ucnt=0,Ucnt=0,ocnt=0;
		for (int i = 0;i<a.length();i++) {
			char c = a.charAt(i);
			if(Character.isLowerCase(c)){
				ucnt++;
			} else if(Character.isUpperCase(c)) {
				Ucnt++;
			} else {
				ocnt++;
			}
		}
		System.out.println(a.length());
		System.out.println(ucnt+" "+Ucnt+" "+ocnt+" " );
			
		
	}

}
