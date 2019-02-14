package Program;

import java.util.Random;

public class RandomGenerator {

	public static void main(String[] args) {
		
		
			String availableChars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!@#$%^&*()1234567890";
			final int MAX_VALUE = 12;
			StringBuilder sb = new StringBuilder();
			Random random = new Random();
			for (int i = 0; i < MAX_VALUE; i++) {
				sb.append(availableChars.charAt(random.nextInt(availableChars.length())));
				
			}
			System.out.println(sb);
			
		}

	

}
