import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int Sim = 1;
	do{
			
		System.out.println(" Insira o valor do Produto:");
		
		double produto;
		
		
		 produto = sc.nextDouble();
		
	
		 if(produto < 100 ) {
			 
			produto = produto - ((produto *3)/100);
					 
				System.out.println("O desconto na sua compra e de " + produto );
		 } 
		 
		 else if(produto >= 100 && produto <= 299) {
			 
			 produto = produto - ((produto *5)/100);
			 	
			 	System.out.println("O desconto na sua compra e de" + produto );
			 }
		 else if(produto >= 300 && produto <= 500) {
			 
			 produto = produto - ((produto *9)/100);
			 
			 	System.out.println("O desconto na sua compra e de" + produto );
		 }
		 else if (produto > 500) {
			 
			 produto = produto - ((produto *12)/100);
			 
			 	System.out.println("O desconto na sua compra e de" + produto );
		 } 
			
					 	 
			 
	 
	 
	 	System.out.println("Deseja realizar outra pesquisa: 1-Sim / 2-Não");
	 	 	Sim = sc.nextInt();
	 	 	 
	}while(Sim == 1);
	
	sc.close();
	
	}

}


