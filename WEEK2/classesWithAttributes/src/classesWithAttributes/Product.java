package classesWithAttributes;

public class Product {
	/*public Product (int id, String name, String description, double price, int stockAmount,String renk) {
		System.out.println("Yapıcı blok çalıştı.");
		this.id =id;
		this.renk =renk;
		this.name =name;
		this.price = price;
		this.description =description;
		this.stockAmount = stockAmount;
	
	}*/
	
	
	
     int _id;
     private String _name;
     private String _description;
     private double _price;
     private int _stockAmount;
     
     //getter
     public int getId() {
    	 return _id;
     }
     
     //setter
     public void setId(int id) {
    	 _id =id;
     }

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		this._name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		this._description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		this._price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		this._stockAmount = stockAmount;
	}
}
