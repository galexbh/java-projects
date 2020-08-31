package inventory;

public class Product {
	//Declaraciones de campo de instancia
	private int id;
	private String nameProduct;
	private double price;
	private int units;
	
	//establecer valores en 0 y null
	public Product() {
		this.id = 0;
		this.nameProduct = null;
		this.price = 0.0;
		this.units = 0;
	}

	public Product(int id, String nameProduct, double price, int units) {
		this.id = id;
		this.nameProduct = nameProduct;
		this.price = price;
		this.units = units;
	}
	//Obtener id del producto
	public int getId() {
		return this.id;
	}
	//establecer id del producto
	public void setId(int id) {
		this.id = id;
	}
	//obtener nombre del producto
	public String getNameProduct() {
		return this.nameProduct;
	}
	//establecer nombre del producto
	public void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	//obtener precio del producto
	public double getPrice() {
		return this.price;
	}
	//establecer nombre del producto
	public void setPrice(double price) {
		this.price = price;
	}
	//obtener unidades
	public int getUnits() {
		return this.units;
	}
	//establecer unidades
	public void setUnits(int units) {
		this.units = units;
	}

	@Override
	// Obtener id, nombre, precio y unidades
	public String toString() {
		return "Product [id= " + id + ", nameProduct= " + nameProduct + ", price= " + price + "$" +", units= " + units + "]";
	}
	
}
