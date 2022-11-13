package methodOverloading;

public class Main {

	public static void main(String[] args) {
		DortIslem dortIslem = new DortIslem();
		System.out.println(dortIslem.topla(5,7));
		
		//Method overloading özelliği sayesinde aynı method ile iki farklı işlemi gerçekleştirebildik.
		//İki parametre tanımlarsak iki parametrenin toplamını, dört parametre tanımlarsak dört parametrenin toplamını veriyor.
		
		
		System.out.println(dortIslem.topla(5, 7, 4, 8));
		

	}

}
