/*
 * # ! Inventory
 * # * Fundamental concepts of Java
 * @author galexbh@protonmail.com
 * @version 0.3
 * */

package inventory;

import java.util.Scanner;

public class ProductTester {


	public static void main(String[] args) {
		// Declaraciones.

		Scanner in = new Scanner(System.in);

		int tempNumber = 0;
		String tempName = "";
		int tempQty = 0;
		double tempPrice = 0.0;
		int maxSize = -1;
		//int tempStatus = 1;
		//boolean centinela = true; 
		
		do {
			
			System.out.println("Introduzca el número de productos que desea añadir");
			System.out.println("Introduzca 0 si no desea añadir productos: \n");

			
			try {

				maxSize = in.nextInt();
				
				if(maxSize < 0) {
					System.out.println("Valor incorrecto introducido\n");
				}else if(maxSize == 0){
					System.out.println("No desea añadir productos\n");
					System.exit(0);
				}

			}catch (Exception e) {
				System.out.println("Error "+ e + "\n");
				in.nextLine();
			}
			
		} while (maxSize < 0);

		Product[] list = new Product[maxSize];

		for(int i = 0; i < maxSize; i++){
			
			list[i] = new Product(tempNumber,tempName,tempPrice,tempQty);
			//list[i] = new Product(tempNumber,tempName,tempPrice,tempQty,centinela);
			
			System.out.println("Ingrese el ID");
			list[i].setId(in.nextInt());
			
			System.out.println("Ingrese el Nombre");
			in.nextLine();
			list[i].setNameProduct(in.nextLine());
			
			System.out.println("Ingrese el Precio");
			list[i].setPrice(in.nextDouble());
			
			System.out.println("Ingrese la cantidad");
			list[i].setUnits(in.nextInt());
			
			if(tempQty == 0){
				 System.out.println("No se requieren productos.");
			}
			/*
			do {				
				System.out.println("Ingrese si esta activo");
				System.out.println("1. Si | 2. No");
				tempStatus = in.nextInt();
				
			switch(tempStatus) {
				case 1: {
					list[i].setProductStatus(true);
					centinela = false;
					break;
				}
				case 2: {
					list[i].setProductStatus(false);
					centinela = false;
					break;
				}
				default: {
					System.out.println("Ingrese un numero \n");
					centinela = true;
					break;
				}
				
				}
			}while(centinela);
			*/
		}
		
		
		for (Product product : list) {

			System.out.println(product.toString());
		}
		
		in.close();
	}

}
