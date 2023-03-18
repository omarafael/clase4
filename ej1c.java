package clase4;

import java.util.Arrays;
import java.util.Scanner;

public class ej1c {

	public static void main(String[] args) {
		
		int n1=0;
		int n2=0;
		int n3=0;
		String orden="";
		
		if(args.length<4) {
			Scanner inp=new Scanner(System.in);
		    System.out.println("ingrese el primer numero a ordenar");
		    String nu=inp.nextLine();
		    n1=Integer.parseInt(nu);
		    System.out.println("ingrese el segundo numero a ordenar");
		    String nu1=inp.nextLine();
		    n2=Integer.parseInt(nu1);
		    System.out.println("ingrese el tercer munero a ordenar");
		    String nu2=inp.nextLine();
		    n3=Integer.parseInt(nu2);
		    System.out.println("ingrese el orden: ascendente o descendente");
		    orden=inp.nextLine();
		}
		
		else {
			n1=Integer.parseInt(args[0]);
			n2=Integer.parseInt(args[1]);
			n3=Integer.parseInt(args[2]);
			orden = (args[3]);
			
			System.out.println(Arrays.toString(ordenador(n1,n2,n3,orden)));
			
		}
		
		
		
		
		
		
		
	}
	
	public static int[]ordenador(int n1, int n2, int n3, String orden) {
		  int[] vectormt= new int[] {n1,n2,n3};
		   
		     for(int i=0; i<vectormt.length; i++){
		    	 for(int j=i+1; j<vectormt.length; j++) {
		    		 if (orden.equals("a")) {
		    	       if(vectormt[j]<vectormt[i]) {
		    			 int ant = vectormt[i];
		    	    	 int menor = vectormt[j];
		    			 vectormt[i]=menor;
		    			 vectormt[j]=ant;
		    			 
		    		    	 
		    		     }
		    	     
		    	 }
		    		 else if(orden.equals("d")){	 
		    			 if(vectormt[j]>vectormt[i]) {
		    			 int ant = vectormt[i];
		    	    	 int menor = vectormt[j];
		    			 vectormt[i]=menor;
		    			 vectormt[j]=ant;
		    			 
		    		    	 
		    		     }
		    		 
		           } 		 
		    		 
		    		 
		    	 }
		     
		     }
		
		return vectormt;
		
		
		
		}
	
}
