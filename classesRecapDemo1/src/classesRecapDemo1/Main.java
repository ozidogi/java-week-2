package classesRecapDemo1;

public class Main {

	public static void main(String[] args) {
		//DortIslem class'ını kullanacağımız zaman onun bir reference'ını oluşturmamız gerekiyor.
		DortIslem dortIslem = new DortIslem();
		
		int bolmeSonuc = dortIslem.Bol(14, 2);
		System.out.println(bolmeSonuc);
		
		

	}

}
