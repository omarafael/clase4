package clase4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class ej3 {

public static void main(String[] args)  {
	    
	
	try {
	
	
	    Scanner inp=new Scanner(System.in);
	    System.out.println("ingrese el desplazamiento");
	    String desplazamiento=inp.nextLine();  
		String archivoin="C:\\CursoJava\\EjerciciosAP\\ejprueba\\src\\clase4\\palabra.txt";
		String archivoout="C:\\CursoJava\\EjerciciosAP\\ejprueba\\src\\clase4\\palabracodificada.txt";
		
		int desp= Integer.parseInt(desplazamiento);
		
		for (String palabra:Files.readAllLines(Paths.get(archivoin))) {
		
			String palabracodificada= codificador (palabra, desp);
			Files.write(Paths.get(archivoout), palabracodificada.getBytes(), java.nio.file.StandardOpenOption.APPEND);
			String bajada="\n";
			Files.write(Paths.get(archivoout), bajada.getBytes(), java.nio.file.StandardOpenOption.APPEND);
		}
		System.out.println("Operacion exitosa");
		
		
	
	}	
	 catch (IOException e) {
			System.out.println("error");
			e.printStackTrace();
		  }
	
	
	
	
	
	}

	
	

	public static String codificador(String palabra, int desp) {
		String codif="";
		
		for (int i = 0; i < palabra.length(); i++) {
			codif = codif + siguientecaracter(palabra.charAt(i), desp);
		}
		return codif;
		}


	
	public static String decodificador(String palabra, int desp) {
        String deco="";
		
		for (int i = 0; i < palabra.length(); i++) {
			deco = deco + siguientecaracter(palabra.charAt(i), -desp);
		}
		return deco;
		}
	
	
	public static char siguientecaracter(char a, int desp) {
		String abcd="abcdefghijklmnñopqrstuvwxyz";
		char letra = 0;
		for (int j = 0; j < abcd.length(); j++) {
			if(abcd.charAt(j)==a) {
				int pos= j+ desp;
					if(pos<27 && pos>=0) { 
					letra= abcd.charAt(pos);
				}
				
				else {
					if (pos>=0) letra= abcd.charAt(pos-27);
					if (pos<0) letra= abcd.charAt(27+pos);
				}
			}
		
				
		}
			
			return letra;
			
	}
	
	
}
