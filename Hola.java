import java.util.Scanner;

public class Hola{
	public static void main(String[] args){

			Scanner scn = new Scanner(System.in);
			Boolean salida = false;
			
			while(!salida){
				System.out.println("Dime tu nombre: ");
				String nombre = scn.nextLine();
				if(nombre.length()<1){
					System.out.println("El nombre no puede estar vacío");
				} else {
					System.out.println("Hola " + nombre);
					salida = true;
				}
			}
	}
}