package java_learn;
import java.io.*;
public class Employee{
	String name;
	int age;
	String designation;
	double salary;
	public Employee(String name){
		this.name = name;
	}
	public void empage(int empage){
		age = empage;
	}
	public void empdesignation(String empdesig){
		designation = empdesig;
	}
	public void empSlary(double empsalary){
		salary = empsalary;
	}
	public void printemplpyee(){
		System.out.println("Name:"+ name);
		System.out.println("age:"+ age);
		System.out.println("designation:"+ designation);
		System.out.println("salary:"+ salary);
		
	}
}
