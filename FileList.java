package java_learn;
//递归打印目录下的文件，并且可以缩进的形式
import java.io.*;
public class FileList {
	public static void main (String[] args){
		File f =new File("C:\\Program Files");
		tree(f,0);
	}
	private static void tree(File f,int level) {
		File[] childs = f.listFiles();
		String preStr = "";
		for (int i = 0;i<level;i++){
			preStr +="    ";
		}
		for(int i =0 ;i<childs.length;i++) {
			System.out.println(preStr + childs[i].getName());
			if(childs[i].isDirectory()) {
				tree(childs[i],level + 1);
			}
		}
	}
}
