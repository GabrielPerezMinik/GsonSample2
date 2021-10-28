package gsonsample;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Datos {

	public static void main(String[] args) {
		
		String nombre;
		String apellidos;
		int edad;
		
		System.out.println("Introduce tu nombre");
		Scanner scanner = new Scanner(System.in);
		nombre = scanner.nextLine();
		System.out.println("Introduce tu Apellidos");
		Scanner scan = new Scanner(System.in);
		apellidos = scanner.nextLine();
		System.out.println("Introduce tu edad");
		Scanner scann = new Scanner(System.in);
		edad = scanner.nextInt();
		
		if(nombre.equals("")) {
			System.out.println("Introduce tu nombre");
			Scanner scanner2 = new Scanner(System.in);
			nombre = scanner.nextLine();
		}else if(apellidos.equals("")) {
			System.out.println("Introduce tu Apellidos");
			Scanner scan2 = new Scanner(System.in);
			apellidos = scanner.nextLine();
		}else if(edad==0 || edad<0) {

			System.out.println("Introduce tu edad");
			Scanner scann2 = new Scanner(System.in);
			edad = scanner.nextInt();
		}
		
		//if((nombre.equals("")) | apellidos.equals("") | edad==0) {
		
			
		//}
		
		scanner.close();
		scan.close();
		scann.close();
		Persona p = new Persona(nombre,apellidos,edad);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}

}
