package classes;

public class Main {

	public static void main(String[] args) {
		//bir class nasıl çağrılır?
		//CustomerManager türünde bir variable tanımlıyoruz
		//Daha önceden tanımlanmış fonksiyonları "." koyarak kullanabiliyoruz
		//Classlar reference type'tır.
		CustomerManager customerManager = new CustomerManager();
		CustomerManager customerManager2 = new CustomerManager();
	
		
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		//Bellekte stack ve heap olmak üzere iki alan vardır.
		//Oluşturulan variable stack kısmında depolanır.
		//Variable'a karşılık gelen nesne heap kısmında depolanır.
		
		//value
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1;
		sayi1 = 30;
		//sayi2'yi print ettiğimizde ne yazacak? ---> 10 yazacak.
		System.out.println(sayi2);
		//Çünkü değer tipleri stack'te depolanır.
		
		int[] sayilar1 = new int[] {1,2,3};
		int[] sayilar2 = new int[] {4,5,6};
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		//Şimdi sayilar2 array'inin 0. elemanını çağırırsak ---> 10 yazacak.
		System.out.println(sayilar2[0]);
		//Çünkü sayilar1 ve sayilar2 birer array'dir ve arrayler reference type'tır.
		

		
		
	}

}


