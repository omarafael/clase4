package clase4;

import java.util.Arrays;

public class ej1av2 {

	
	
	
	
	public static void main(String[] args) {
		
		int n1=Integer.parseInt(args[0]);
		int n2=Integer.parseInt(args[1]);
		int n3=Integer.parseInt(args[2]);
		String orden = (args[3]);
		
		System.out.println(Arrays.toString(ordenador(n1,n2,n3,orden)));
		
		
		
		
		
		
		
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
