package classesWithAttribute;

public class Product {
	
	public Product(int _id, String _name, String _description, double _price, int _stockAmount, String _colour) {
		System.out.println("Constructor blok çalıştı");
		this._id = _id;
		this._name = _name;
		this._description = _description;
		this._price = _price;
		this._stockAmount = _stockAmount;
		this._colour = _colour;
		
	}
	
	public Product() {
	}
	
	//Aşağıdaki ürün özelliklerine attribute veya field denebilir.
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _colour;
	private String _code;
	
	//attribute'ların başına private yazdığımız zaman onları public'ten private'e çevirmiş oluruz.
	//Private attribute, sadece tanımlandığı blokta geçerlidir.
	//Private attribute'lara başka classlarda da ulaşabilmek için getter ve setter yazarız.
	
	//getter
	
	public int getId(){
		return _id;
	}
	public String getName(){
		return _name;
	}
	public String getDescription(){
		return _description;
	}
	public double getPrice(){
		return _price;
	}
	public int getStock(){
		return _stockAmount;
	}
	public String getColour(){
		return _colour;
	}
	public String getCode(){
		return _name.substring(0,1) + _id;
	}
	
	//setter
	
	public void setId(int id){
		_id = id;	
	}
	public void setName(String name){
		_name = name;	
	}
	public void setDescription(String description){
		_description = description;	
	}
	public void setPrice(double price){
		_price = price;	
	}
	public void setStock(int stockAmount){
		_stockAmount = stockAmount;	
	}
	public void setColour(String colour){
		_colour = colour;	
	}
}
