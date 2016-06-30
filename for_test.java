package java_learn;

public class for_test {
	public static void main(String args[]) {
		long result = 0;
		long f  = 1;
		int stop =4;
		for (int i = 1;i <=20; i++) {
			if (i==stop){
				break;
			} 
			f = f*i;
			result +=f;
		}
		System.out.println("result:"+result);
	}
	public  void while_test (String args[]){
		long sum = 0;
		for(int i = 1 ; i <99 ; i++) {
			sum = sum + i;
			System.out.print("sum="+sum);
		}
		
	}

}
//result = 1£¡+2£¡+3£¡+¡£¡£¡£¡£+10£¡