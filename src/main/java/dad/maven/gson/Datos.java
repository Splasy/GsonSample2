package dad.maven.gson;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Datos {
	
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Persona p = new Persona();
		
		System.out.println("�C�mo te llamas?");
		p.nombre = entrada.nextLine();
		System.out.println("�Cu�les son tus apellidos?");
		p.apellidos = entrada.nextLine();
		System.out.println("Cu�ntos a�os tienes?");
		p.edad = entrada.nextInt();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}
	
}