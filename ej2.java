package clase4;


import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Paths;
import java.util.Scanner;


public class ej2 {

	public static void main(String[] args)  {
		Scanner inp=new Scanner(System.in);
		String archivo ="C:\\CursoJava\\EjerciciosAP\\ejprueba\\src\\clase4\\numeros.txt";
		System.out.println("ingrese tipo de operacion: suma o multiplicaion");
	    String operacion=inp.nextLine();
	   
	
		try {
			int suma=0;
			int multi=1;
		  
		    for (String linea : Files.readAllLines(Paths.get(archivo))) {
		        suma=suma+Integer.parseInt(linea);
		        multi=multi*Integer.parseInt(linea);
		      
		    }
		
		    if (operacion.equals("suma")) {
		    	System.out.println("La suma es:");
		    	System.out.println(suma);
		 
		    }
		    else {
		    
		 
		    System.out.println("La multiplicacion es:");
		    System.out.println(multi);
		    }
		} catch (IOException e) {
			
			e.printStackTrace();
		  }
		
	}
		
		
		
}
	
	
	
	
	
	

