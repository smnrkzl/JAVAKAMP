package miniProjeAsalSayi;

public class main {

	public static void main(String[] args) {
		int number = 2;
		int remainder = number % 2;
		boolean isPrime = true;
		
		if(number==1) {
			System.out.println("Sayı asal değildir");
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
		}
		
		for(int i=2; i<number; i++) {
			if(number%i == 0) {
				isPrime = false;
			}
		}
		
		if (isPrime) {
			System.out.println("Sayı Asaldır!");
		} else {
			System.out.println("Sayı Asal Değildir!");
		}

	}

}