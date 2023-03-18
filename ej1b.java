package clase4;

import java.util.Arrays;
import java.util.Scanner;


public class ej1b {

public static void main(String[] args) {
		
	    Scanner inp=new Scanner(System.in);
	    System.out.println("ingrese el primer numero a ordenar");
	    String nu=inp.nextLine();
	    int n1=Integer.parseInt(nu);
	    System.out.println("ingrese el segundo numero a ordenar");
	    String nu1=inp.nextLine();
	    int n2=Integer.parseInt(nu1);
	    System.out.println("ingrese el tercer munero a ordenar");
	    String nu2=inp.nextLine();
	    int n3=Integer.parseInt(nu2);
	    System.out.println("ingrese el orden: ascendente o descendente");
	    String orden=inp.nextLine();
	   
		
		int[] numord=ordenador( n1,n2,n3,orden);
		System.out.println(Arrays.toString(numord));
	
		
	}
	
	
	
	public static int[]ordenador(int n1, int n2, int n3, String orden) {
	  int[] vectormt= new int[] {n1,n2,n3};
	   
	     for(int i=0; i<vectormt.length; i++){
	    	 for(int j=i+1; j<vectormt.length; j++) {
	    		 if (orden.equals("ascendente")) {
	    	       if(vectormt[j]<vectormt[i]) {
	    			 int ant = vectormt[i];
	    	    	 int menor = vectormt[j];
	    			 vectormt[i]=menor;
	    			 vectormt[j]=ant;
	    			 
	    		    	 
	    		     }
	    	     
	    	 }
	    		 else if(orden.equals("descendente")){	 
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
