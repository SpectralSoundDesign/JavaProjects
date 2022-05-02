package gamelist;

import java.util.Scanner;

public class ListRun {
	
	Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*"Title=" + title + ", Platform=" + platform + ", Release Date=" + releaseDate + ", Age Rating="
		+ ageRating + ", Review Score=" + reviewScore;*/
		int length = 10;
		
		Games g1 = new Games("RDR2", "XBox", 2019, 'M', 98);
		Games g2 = new Games("Halo", "XBox", 2000, 'M', 100);
		
		
		g1.displayProgram();
		System.out.println(g1);
		System.out.println(g2);

	}

}
