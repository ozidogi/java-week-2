package classesWithAttribute;

public class ProductManager {
	public void Add(Product product) {
		//Bu productları JDBC Kodları yazarak veritabanına ekleyebiliriz. Henüz bu konuya giriş yapmadık.
		System.out.println("Ürün eklendi: "+product.getName());
	
	}
	
	public void Add2(int id,String name, String description, int stockAmount, double price) {
		
	}

}
