package loopDemo;

public class main {

	public static void main(String[] args) {
		//FOR
		for(int i=2; i<10; i+=2) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti");
		
		//WHİLE
		int i = 1;
		while(i<10) {
			System.out.println(i);
			i+=2;
			
		}
		System.out.println("While döngüsü bitti");
		
		//DO-WHİLE
		int j = 100;
		do {
			System.out.println(j);
			j+=2;
			
			
		}while(j<10);
		System.out.println("Do-While Döngüsü Bitti");

	}

}
