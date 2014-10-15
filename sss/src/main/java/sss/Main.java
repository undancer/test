package sss;

import java.io.File;
import java.util.Properties;

public class Main {
	public void send(){
		Properties pros = new Properties();
		pros = System.getProperties();
		System.out.println(pros);
	}
	public static void main(String args[]){
		new Main().send();
	}
	
}
