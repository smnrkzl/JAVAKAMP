package recapDemo1;

public class main {

	public static void main(String[] args) {
		int sayi1 = 14;
		int sayi2 = 15;
		int sayi3 = 16;
		int enBuyuk = sayi3;
		
		if(enBuyuk<sayi1) {
			enBuyuk = sayi1;
		}
		
		if(enBuyuk<sayi2) {
			enBuyuk = sayi2;
		}
		
		System.out.println("En büyük = " + enBuyuk);

	}

}
