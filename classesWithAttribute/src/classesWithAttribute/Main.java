package classesWithAttribute;

public class Main {

	public static void main(String[] args) {
		Product product = new Product(1,"Laptop","Asus Laptop", 5000, 3, "siyah");
//		product.setName("Laptop");
//		product.setId(1);
//		product.setDescription("Asus Laptop");
//		product.setPrice(5000);
//		product.setStock(3);
//		product.setColour("siyah");
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());
	}

}
