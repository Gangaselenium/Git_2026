package Test;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Random r =new Random();
		
		
		for(int i=1;i<5;i++) {
			
			String s=RandomStringUtils.randomAlphabetic(4);
			
			System.out.println(s);
		}

	}

}
