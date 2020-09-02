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

	public Product(int id, String nameProduct, double price, int units, boolean productStatus) {
		this.id = id;
		this.nameProduct = nameProduct;
		this.price = price;
		this.units = units;
		this.productStatus = productStatus = true;
	}
	//Obtener id del producto
	protected int getId() {
		return this.id;
	}
	//establecer id del producto
	protected void setId(int id) {
		this.id = id;
	}
	//obtener nombre del producto
	protected String getNameProduct() {
		return this.nameProduct;
	}
	//establecer nombre del producto
	protected void setNameProduct(String nameProduct) {
		this.nameProduct = nameProduct;
	}
	//obtener precio del producto
	protected double getPrice() {
		return this.price;
	}
	//establecer nombre del producto
	protected void setPrice(double price) {
		this.price = price;
	}
	//obtener unidades
	protected int getUnits() {
		return this.units;
	}
	//establecer unidades
	protected void setUnits(int units) {
		this.units = units;
	}

	protected boolean isProductStatus() {
		return productStatus;
	}

	protected void setProductStatus(boolean productStatus) {
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
