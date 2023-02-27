package Day19.Ex5;

import java.util.Scanner;

public class 실행 { // class S
	public static void main(String[] args) { // main S
		
		Scanner scanner = new Scanner(System.in);
		
		Thread thread = new Music();
		thread.start();
		
		Music music = new Music();
		Movie movie = new Movie();
		movie.start();
		
		while(true) { // while S
			
			System.out.println("1.음악재생 2.영화재생");
			int ch = scanner.nextInt();
			// 음악
			if(ch==1 && music.stop == false) {
				music.start();
				music.stop = true;
			}
			else if(ch==1 && music.stop == true) {
				music.stop = false;
			}
			// 영화
			else if(ch==2 && movie.stop == false) {
				movie.start();
				movie.stop = true;
			}
			else if(ch==2 && movie.stop == true) {
				movie.stop = false;
			}
		} // while E
		
	} // main E
} // class E
