import java.util.Scanner;

public class Exercicios_09 {
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int numeroSelecionado = 0; //Indica sabor selecionado 
		int brocolis = 1; // sabor pizza		
		int calabresa = 1; // sabor pizza
		int frango = 1; // sabor pizza
		int sabor = 0; // segundo scanner
		
		boolean satisfeito = false;
		boolean satisfeitoFatias = false;
		
		
		System.out.print("Digite sabor da pizza desejada.   "
				+ "\nOp��es:"
				+ "\n1 - Brocolis"
				+ "\n2 - Calabresa"        //Primeira impress�o no console 
				+ "\n3 - Frango"
				+ "\nSabor: ");
		
		numeroSelecionado = scanner.nextInt(); // Leitor da Op��o "scanner"
		
		// *********************************** Brocolis
		
				if (numeroSelecionado == 1)  {  // Caso verdadeiro 
				while(!satisfeitoFatias) {        // Repete at� que seja falso
					 
					System.out.println("Voc� selecionou Brocolis, Deseja mais uma fatia?"
						+ "\n1 - Sim"       //impress�o caso selecione broclis 
						+ "\n2 - N�o");
					sabor = scanner.nextInt(); // Leitor da Op��o lida
					 if (sabor == 1)  // Caso verdadeiro 
						brocolis ++; // Soma brocolis
				 else {
						 System.out.println("Voc� comeu " + brocolis + " de fatias de Brocolis ");
					satisfeitoFatias = true;
				 }
				}
				}
				// *********************************** Calabresa
				else if (numeroSelecionado == 2)  {  // Caso verdadeiro 
					while(!satisfeitoFatias) {  // Repete at� que seja falso
						
						System.out.println("Voc� selecionou Calabresa, Deseja mais uma fatia?"
							+ "\n1 - Sim"       //impress�o caso selecione Calabresa
							+ "\n2 - N�o");
						
						sabor = scanner.nextInt();
						 if (sabor == 1) // Caso verdadeiro 
							calabresa ++;
						 else {
							 	System.out.println("Voc� comeu " + calabresa + " de fatias de calabresa ");
					    satisfeitoFatias = true;
						 }
					}
					}
						// *********************************** Frango 
					    
						else if (numeroSelecionado == 3)  { 
							while(!satisfeitoFatias) {  
								
								System.out.println("Voc� selecionou Frango,Deseja mais uma fatia?"
									+ "\n1 - Sim"      
									+ "\n2 - N�o");
								
								sabor = scanner.nextInt();
								 if (sabor == 1)
									frango ++;
								 else {
									 	System.out.println("Voc� comeu " + frango + " de fatias de frango ");
							    satisfeitoFatias = true;
				
								 }
							}			 
						}		 
					}
					
					}