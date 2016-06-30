package java_learn;

public class puppy {
	int puppyage;
	public puppy(String name){
		System.out.println("passd name id :" + name);	
	}
	public void setage(int age){
		puppyage = age;
	}
	public int getage(){
		System.out.println("puppy's age is " + puppyage);
		return puppyage;
	}
	public static void main(String []args){
		puppy mypuppy = new puppy("tommy");
		mypuppy.setage(2);
		mypuppy.getage();
		System.out.println("variable value:" + mypuppy.puppyage);
	}

}
