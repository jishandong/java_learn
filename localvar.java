package java_learn;

public class localvar{
	public void pupAge(){
		int age = 0;
		age =age + 7;
		System.out.println("小狗的年龄是：" + age);
	}
    public static void main(String args[]){
        localvar test = new localvar();
        test.pupAge();	
    }
}
