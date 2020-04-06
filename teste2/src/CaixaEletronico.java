

import java.util.Scanner;



public class CaixaEletronico {
	
    private static final int[] notasDisponiveis = {100,50,20,10};	
    private int valor;
    
    public int getValor() {
	return valor;
    }

	
    public void iniciarMenu() {
		
	int  valorDigitado=-1;
	Scanner sc = new Scanner(System.in);  
	int[][] vet;
     	
	while(valorDigitado!=0){
			
        System.out.println("Digite o valor que deseja Sacar:");
	    System.out.println("Digite 0 para sair:");   	
				  	
	    valorDigitado = sc.nextInt();
	    String s = String.valueOf(valorDigitado);
		    	
		if (verificarValor(s)) {
		    this.valor = valorDigitado;
		   vet = calcularNotas(getValor());
		   for(int i=0; i<vet.length; i++) {
				mostrarNotas(vet[i][0], vet[i][1]);
			   
		   }
		   
		}else {
                System.out.println("Digite um valor válido:");
		    		
		}
	}
            sc.close();
            System.out.println("Saque finalizado");
    	
    }
	
    public boolean verificarValor(String valor) {
		
	int val;
	 
            try {
			
		if (valor == null || valor.length() == 0) {
	            return false;
	         }else {
			val =  Integer.parseInt(valor);
			for(int i = 0; i< notasDisponiveis.length;i++) {
	        	     val = val % notasDisponiveis[i];
                        }
	    		if (val !=0) 
	        		 return false;
	        	 else
	        		 return true;
	         }
            }catch (NumberFormatException e) {
                return false;
            }
    }
	
    
    public void mostrarNotas(int numNotas, double nota) {
    	
    	System.out.println( "Entregar " + numNotas + " nota(s) de R$" + nota);
    }
    
    public int[][] calcularNotas(int val) {	
    int i=0;    
    int[][] vet= new int[notasDisponiveis.length][2];
  
    
    	while(i<notasDisponiveis.length) {
		
            if( val >= notasDisponiveis[i] ){
            
            	vet[i][1] = (notasDisponiveis[i]);
            	vet[i][0] = (int)(val/notasDisponiveis[i]);
            	val = val % notasDisponiveis[i];
            }
            i++;	
    	}
    	return vet;
    }
        
}
