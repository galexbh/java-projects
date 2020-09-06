package inventory;

public class Product {
	//Declaraciones de campo de instancia
	private int id;
	private String nameProduct;
	private double price;
	private int units;
	private boolean productStatus;
	
	//establecer valores en 0 y null
	public Product() {
		this.id = 0;
		this.nameProduct = null;
		this.price = 0.0;
		this.units = 0;
		this.productStatus = true;
	}
	
	public Product(int id, String nameProduct, double price, int units) {
		this.id = id;
		this.nameProduct = nameProduct;
		this.price = price;
		this.units = units;
		this.productStatus = true;
	}

	public Product(int id, String nameProduct, double price, int units, boolean productStatus) {
		this.id = id;
		this.nameProduct = nameProduct;
		this.price = price;
		this.units = units;
		this.productStatus = productStatus;
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

	public boolean isProductStatus() {
		return productStatus;
	}

	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}
	
	public String getInvetory(){
		String validate = (productStatus == true)? "Activo":"Descatalogado";
		return "Product [id=" + id + ", nameProduct=" + nameProduct + ", price=" + price +"$" + ", units=" + units
				+" Stock Value=" + (price*units) + ", productStatus=" + validate + "]";
	}

	@Override
	public String toString() {
		String validate = (productStatus == true)? "Activo":"Descatalogado";
		return "Product [id=" + id + ", nameProduct=" + nameProduct + ", price=" + price +"$" + ", units=" + units
				+ ", productStatus=" + validate + "]";
	}

	
	
}
