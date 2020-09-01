/*
 * # ! Inventory
 * # * Fundamental concepts of Java
 * @author galexbh@protonmail.com
 * @version 0.2
 * */

package inventory;

import java.util.Scanner;

public class ProductTester {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Declaraciones.
		int tempNumber = 0;
		String tempName = "";
		int tempQty = 0;
		double tempPrice = 0.0;
		
		/*
		Product telefono = new Product();
		Product teclado = new Product();
		Product mouse = new Product(1,"Razer",24.99,3);
		Product boligrafo = new Product(2,"Bolic",0.99,7);
		Product grapadora = new Product(3,"ACME",1.99,13);
		Product lampara = new Product(4,"max",10.50,1);
		*/
		
		System.out.println("Ingrese el ID");
		tempNumber = in.nextInt();
		System.out.println("Ingrese el Nombre");
		in.nextLine();
		tempName = in.nextLine();
		System.out.println("Ingrese el Precio");
		tempPrice = in.nextDouble();
		System.out.println("Ingrese la cantidad");
		tempQty = in.nextInt();
		
		Product p1 = new Product(tempNumber,tempName,tempPrice,tempQty,false);
		
		/*
		System.out.println("Ingrese el ID");
		tempNumber = in.nextInt();
		System.out.println("Ingrese el Nombre");
		in.nextLine();
		tempName = in.nextLine();
		System.out.println("Ingrese el Precio");
		tempPrice = in.nextDouble();
		System.out.println("Ingrese la cantidad");
		tempQty = in.nextInt();
		
		Product p2 = new Product(tempNumber,tempName,tempPrice,tempQty,true);
		*/
		
		System.out.println(p1.toString());
		System.out.println(p1.getInvetory());
		
		
		in.close();
	}

}
