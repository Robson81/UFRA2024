package POO;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Teste {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant	d03 = Instant.now();
		LocalDate d04 = LocalDate.parse("2024-10-09");
		LocalDateTime d05 = LocalDateTime.parse("2024-10-09T01:02:03");

		
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05 = " + d05);


	
	
	}

}
