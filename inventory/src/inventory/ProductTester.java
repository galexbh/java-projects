package inventory;

//import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
//		Scanner scEntrada = new Scanner(System.in);
		
		Product telefono = new Product();
		Product teclado = new Product();
		Product mouse = new Product(1,"Razer",24.99,3);
		Product boligrafo = new Product(2,"Bolic",0.99,7);
		Product grapadora = new Product(3,"ACME",1.99,13);
		Product lampara = new Product(4,"max",10.50,1);
		
		System.out.println(telefono.toString());
		System.out.println(teclado.toString());
		System.out.println(mouse.toString());
		System.out.println(boligrafo.toString());
		System.out.println(grapadora.toString());
		System.out.println(lampara.toString());		
	}

}
