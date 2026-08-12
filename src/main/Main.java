package main;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 Scanner teclado = new Scanner(System.in);
		 	

	       System.out.println("Ingrese su nombre: ");
String nombre = teclado.nextLine();

System.out.println("Ingrese su edad: ");
int edad = teclado.nextInt();

// Consumimos el Enter que queda después de nextInt()
teclado.nextLine();

System.out.println("Ingrese su sexo: ");
String sexo = teclado.nextLine();

System.out.println("Hola " + nombre);
System.out.println("Su edad es -> " + edad);
System.out.println("De sexo -> " + sexo);

teclado.close();
	}

}
