package main;
import java.util.Scanner;

import usuarios.Usuarios;
import filmes.Filme;
import recomendacoes.Recomendacoes;



public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int recomed = 0;
		
		//Pacote filmes
		//Cria��o do primeiro filme. 
		
		Filme filme1 = new Filme('1', "John Wick", "Filme de a��o com cachorro.", "a��o", "www.teste.com.br", "Curtidas:");
		//System.out.println(filme1.id + " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse + " " + filme1.link);		// + " " + filme1.curtidaUsers);
		
		//Cria��o do segundo filme. 
	
		Filme filme2 = new Filme('2', "Jack Ryan", "Filme de a��o da amazom.", "a��o", "www.teste2.com.br", "Curtidas:");
		//System.out.println(filme2.id + " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse + " " + filme2.link);		// + " " + filme2.curtidaUsers);
	
		//Cria��o do Terceiro filme. 

		Filme filme3 = new Filme('3', "Homem Aranha", "Filme de a��o e emo��o.", "a��o", "www.teste3.com.br", "Curtidas:");
		//System.out.println(filme3.id + " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse + " " + filme3.link);		//+ " " + filme3.curtidaUsers);

		//Cria��o do Quarto filme
		Filme filme4 = new Filme('4', "The chamado", "Filme de terror e suspense", "Terror", "www.teste4.com.br", "Curtidas:");
		//System.out.println(filme4.id + " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse + " " + filme4.link);		// + " " + filme1.curtidaUsers);
		
		//Cria��o do Quinto filme. 
	
		Filme filme5 = new Filme('5', "De ferias com a familia ", "Filme de com�dia, familia.", "com�dia", "www.teste5.com.br", "Curtidas:");
		//System.out.println(filme5.id + " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse + " " + filme5.link);		// + " " + filme2.curtidaUsers);
	
		//Cria��o do Sexto filme. 

		Filme filme6 = new Filme('6', "Homem Aranha 2", "Filme de a��o e emo��o2.", "a��o", "www.teste6.com.br", "Curtidas:");
		//System.out.println(filme3.id + " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse + " " + filme6.link);		//+ " " + filme3.curtidaUsers);

		
		//Pacote usuario 
		// cria��o de um novo usuario
		
		Usuarios userFlix01 = new Usuarios("Wagner Pedroso" ,"Rua Manus n�:615","24.10.1995");
	//	System.out.println(userFlix01.nomeCompleto + " " + userFlix01.endereco + " " + userFlix01.dataNascimento); // + " " + userFlix01.curtidaUser);
		
		// cria��o do Segundo usuario. 
		
		Usuarios userFlix02 = new Usuarios("Jessica Milwerstet" ,"Rua Manus n�:615","05/12/2000");
	//	System.out.println(userFlix02.nomeCompleto + " " + userFlix01.endereco + " " + userFlix01.dataNascimento); // + " " + userFlix02.curtidaUser);
		
		// cria��o do Terceiro usuario. 
		
		Usuarios userFlix03 = new Usuarios("Jessica Milwerstet Pedroso" ,"Rua Manus n�:615","05/12/2000");
	//	System.out.println(userFlix03.nomeCompleto + " " + userFlix01.endereco + " " + userFlix01.dataNascimento); // + " " + userFlix03.curtidaUser);
		
		// cria��o do Quarto usuario. 
		
		Usuarios userFlix04 = new Usuarios("Jessica 04" ,"Rua Manus n�:615","05/12/2004");
	//	System.out.println(userFlix04.nomeCompleto + " " + userFlix04.endereco + " " + userFlix04.dataNascimento); // + " " + userFlix04.curtidaUser);
		
		// cria��o do Quinto usuario. 
		
		Usuarios userFlix05 = new Usuarios("Jessica 05" ,"Rua Manus n�:615","05/12/2005");
	//  System.out.println(userFlix05.nomeCompleto + " " + userFlix05.endereco + " " + userFlix05.dataNascimento); // + " " + userFlix05.curtidaUser);
		
		
		
//		//Menu 
//		System.out.println("Ol�, Bem vindo ao DevInFlix de Wagner Pedroso.");
//		
//		System.out.println("Menu: \n1 - Para assistir filmes  \n2 - Curtit filmes \n3 - Recomendar filmes \n4 - Sujerir novos filmes ");
//		
//		int menu = scanner.nextInt(); //Scanner Seleciona Filme 		
//		 if (menu == 1)
//		
//		System.out.println("Escolha seu Filme: ");
//		 
//		 if (menu == 2)
//			 
//		 System.out.println("Selecione seu filme para Curtir S2 :");
//		 
//		 if (menu == 3)
//			 
//			 System.out.println("Selecione seu filme para Recomendar =) :");
//			 
//		 else  {
//			 System.out.println("Digite nome do filme para recomendar: ");
//			 //  recomendacoes1 = Scanner.string(); 
//	String recome = scanner.next();
//	System.out.println("Sua recomenda��o de filme foi: " + recome);
//			 }
//			
				//Menu 
				System.out.println("Ol�, Bem vindo ao DevInFlix de Wagner Pedroso.");
				
				
				System.out.println("Menu: \n1 - Para assistir filmes  \n2 - Curtit filmes \n3 - Recomendar filmes \n4 - Sujerir novos filmes \n5 - Voc� j� recomendou? ");
				
				
				int menu = scanner.nextInt(); //Scanner Seleciona Filme 		
				if (menu == 1) {
				
				System.out.println("Escolha seu Filme: ");
				
				 System.out.println("Selecione seu filme para Assistir:");
					System.out.println("1" +  " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse);// + " " + filme1.link);
					System.out.println("2" +  " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse);// + " " + filme2.link);
					System.out.println("3" +  " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse);// + " " + filme3.link);
					System.out.println("4" +  " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse);// + " " + filme4.link);
					System.out.println("5" +  " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse);// + " " + filme5.link);
					System.out.println("6" +  " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse);// + " " + filme6.link);
					System.out.println("Op��o: ");
					
					//Seleciona Filme
					int id = scanner.nextInt(); //Scanner Seleciona Filme 		
					 //Filme 01
					 if (id == 1)  // Caso verdadeiro 
					System.out.println("Play " + filme1.nome);	 
					 //Filme 02
					 if (id == 2) // Caso verdadeiro 
					 System.out.println("Play " + filme2.nome);		 
					//Filme 03		  
					 if (id == 3) // Caso verdadeiro 
					 System.out.println("Play " + filme3.nome);	
					 //Filme04
					 if (id == 4)  // Caso verdadeiro 
					System.out.println("Play " + filme4.nome);	 
					//Filme 05
					if (id == 5) // Caso verdadeiro 
					 System.out.println("Play " + filme5.nome);		 
					//Filme 06		  
					 if (id == 6) // Caso verdadeiro 
					 System.out.println("Play " + filme6.nome);	
					 
				
				}
				 if (menu == 2)  {
					 
				 System.out.println("Selecione seu filme para Curti :");
						System.out.println("1" +  " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse);// + " " + filme1.link);
						System.out.println("2" +  " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse);// + " " + filme2.link);
						System.out.println("3" +  " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse);// + " " + filme3.link);
						System.out.println("4" +  " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse);// + " " + filme4.link);
						System.out.println("5" +  " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse);// + " " + filme5.link);
						System.out.println("6" +  " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse);// + " " + filme6.link);
						System.out.println("Op��o: ");
						
						//Seleciona Filme
						int id = scanner.nextInt(); //Scanner Seleciona Filme 		
						 if (id == 1)  // Caso verdadeiro 
							 System.out.println("Voc� curtiu " + filme1.nome);	 
						 		 //Filme 02
						 if (id == 2) // Caso verdadeiro 
						 System.out.println("Voc� curtiu " + filme2.nome);		 
						//Filme 03		  
						 if (id == 3) // Caso verdadeiro 
						 System.out.println("Voc� curtiu " + filme3.nome);	
						//Filme 04
						 if (id == 4)  // Caso verdadeiro 
							 System.out.println("Voc� curtiu " + filme4.nome);	 
						 		 //Filme 05
						 if (id == 5) // Caso verdadeiro 
						 System.out.println("Voc� curtiu " + filme5.nome);		 
						//Filme 06		  
						 if (id == 6) // Caso verdadeiro 
						 System.out.println("Voc� curtiu " + filme6.nome);
						 
						 
						 System.out.println("Digite nome do filme caso queira sugerir para novos filmes : ");
						 
					 
				 }
				 
				 if (menu == 3) {
					 System.out.println("Selecione seu filme para recomenda-lo: ");
						System.out.println("1" +  " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse);// + " " + filme1.link);
						System.out.println("2" +  " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse);// + " " + filme2.link);
						System.out.println("3" +  " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse);// + " " + filme3.link);
						System.out.println("4" +  " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse);// + " " + filme4.link);
						System.out.println("5" +  " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse);// + " " + filme5.link);
						System.out.println("6" +  " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse);// + " " + filme6.link);
						System.out.println("Op��o: ");
						
						//Seleciona Filme
						int id = scanner.nextInt(); //Scanner Seleciona Filme 		
						 if (id == 1)  // Caso verdadeiro 
						System.out.println("recomendaou  " + filme1.nome);	 
						 		 //Filme 02
						 if (id == 2) // Caso verdadeiro 
						 System.out.println("recomendou " + filme2.nome);		 
						//Filme 03		  
						 if (id == 3) // Caso verdadeiro 
						 System.out.println("recomendou " + filme3.nome);	
						 //Filme 04
						 if (id == 4)  // Caso verdadeiro 
						System.out.println("recomendou  " + filme4.nome);	 
						 //Filme 05		  
						 if (id == 5) // Caso verdadeiro 
						 System.out.println("recomendou " + filme5.nome);	
						 //Filme 06		  
						 if (id == 6) // Caso verdadeiro 
						 System.out.println("recomendou " + filme6.nome);
						 
						 System.out.println("Digite o e-mail ou usuario para recomendar : ");
						 String user = scanner.next();
						 System.out.println("Voc� enviou sua recomenda��o para: " + user);
						 
					 System.out.println("Digite nome do filme caso queira sugerir para novos filmes : ");
				 
				 }
				 
				 
				 if (menu == 4) {
					 
					 System.out.println("Voc� poder� indicar 1 filme ao m�s. \nDigite nome do filme para Indicar : "); {  
				 String recomenda = scanner.next();
				 System.out.println("Sua recomenda��o de filme foi: " + recomenda);
				 System.out.println("Selecione seu filme para assistir:");
				 System.out.println("Menu: \n1 - Para assistir filmes  \n2 - Curtit filmes \n3 - Recomendar filmes \n4 - Sujerir novos filmes \n5 - Voc� j� recomendou? ");
					
					
					int menu1 = scanner.nextInt();				
				 
				 
				  recomed ++;
			//	 System.out.println(recomed);
				// System.out.println("Selecione seu filme para assistir:");
					 }
				 }
				 
				 if (menu == 5) {
					 System.out.println("Voc� selecionou " + recomed + " filmes");
					 				
					 System.out.println("Selecione seu filme para assistir:");
					 System.out.println("Menu: \n1 - Para assistir filmes  \n2 - Curtit filmes \n3 - Recomendar filmes \n4 - Sujerir novos filmes \n5 - Voc� j� recomendou? ");
						
						
						int menu1 = scanner.nextInt();
					 
				 }
				 
				 
				 
		 //Lista flimes
		System.out.println("1" +  " " + filme1.nome + " " + filme1.genero + " " + filme1.sinopse);// + " " + filme1.link);
		System.out.println("2" +  " " + filme2.nome + " " + filme2.genero + " " + filme2.sinopse);// + " " + filme2.link);
		System.out.println("3" +  " " + filme3.nome + " " + filme3.genero + " " + filme3.sinopse);// + " " + filme3.link);
		System.out.println("4" +  " " + filme4.nome + " " + filme4.genero + " " + filme4.sinopse);// + " " + filme4.link);
		System.out.println("5" +  " " + filme5.nome + " " + filme5.genero + " " + filme5.sinopse);// + " " + filme5.link);
		System.out.println("6" +  " " + filme6.nome + " " + filme6.genero + " " + filme6.sinopse);// + " " + filme6.link);
		System.out.println("Op��o: ");
	
		//Seleciona Filme
		
		int id = scanner.nextInt(); //Scanner Seleciona Filme 		
		 if (id == 1) // Caso verdadeiro 
		System.out.println("Voc� Selecionou " + filme1.nome);	 
		 		 //Filme 02
		 if (id == 2) // Caso verdadeiro 
		 System.out.println("Voc� Selecionou " + filme2.nome);		 
		//Filme 03		  
		 if (id == 3) // Caso verdadeiro 
		 System.out.println("Voc� Selecionou " + filme3.nome);	 
			//Filme 04
		 if (id == 4)  // Caso verdadeiro 
		System.out.println("Voc� Selecionou " + filme4.nome);	 
		 		 //Filme 05
		 if (id == 5) // Caso verdadeiro 
		 System.out.println("Voc� Selecionou "+ filme5.nome);		 
		//Filme 06		  
		 if (id == 6) // Caso verdadeiro 
		 System.out.println("Voc� Selecionou " + filme6.nome);
		 

		 //Recomanda filme selecionado 
		 System.out.println("Antes de assistir, voc� deseja ? \n1 - Curtir filme  \n2 - Recomenda filme \n3 - Assistir Filme \nOp��o: ");
		  int recomendacoes = scanner.nextInt(); //Scanner Seleciona se deseja recomendar 
		
		  if (recomendacoes == 1) // Caso verdadeiro 
				System.out.println("Voc� curitu ");
			 
			 if (recomendacoes == 2) // Caso verdadeiro 
					System.out.println("Voc� Recomendou ");
			 if (recomendacoes == 3) // Caso verdadeiro 
					System.out.println("Play filme now ");
			 else {
				 System.out.println("Play filme");
		 }

	}	 
}		 
			 
			 
		
			 
			 
			 
			 
			 
			 
			 
			 
			
		  
		  
		  
		  
		  
		  
		  
//		 	int id = scanner.nextInt(); // Leitor da Op��o "scanner"
//		 	 if (id == 1)   {  // Caso verdadeiro 
//				while(!satisfeitoFatias) {        // Repete at� que seja falso
//					 
//					System.out.println("Voc� selecionou Brocolis, Deseja mais uma fatia?"
//						+ "\n1 - Sim"       //impress�o caso selecione broclis 
//						+ "\n2 - N�o");
//					sabor = scanner.nextInt(); // Leitor da Op��o lida
//					 if (sabor == 1)  // Caso verdadeiro 
//						brocolis ++; // Soma brocolis
//				 else {
//						 System.out.println("Voc� comeu " + brocolis + " de fatias de Brocolis ");
//					satisfeitoFatias = true;
//				 }
		 	
		 	
		 	
		 	
		 	
		 	
		 	
//	    satisfeitoFatias = true;
//		
	
		
		
//		Recomendacoes = scanner.String();

// 	if (numeroSelecionado == 1)  {  // Caso verdadeiro 
//			//while(!satisfeitoFatias) {        // Repete at� que seja falso
//				 
 		//		System.out.println("Voc� selecionou John Wick, Deseja curti esse filme?");
//					+ "\n1 - Sim"       //altera para true o curitiu filme **Acrecentar o User+curitu em Filmes* 
//					+ "\n2 - N�o");
//				sabor = scanner.nextInt(); // Leitor da Op��o lida
//				 if (sabor == 1)  // Caso verdadeiro 
//					 ; // Soma brocolis
	//		 else {
		 
			//	 System.out.println("Filme n�o recomendado");
		 
		 
//				satisfeitoFatias = true;
		 
//			 }
//			}
//			}
//			// *********************************** Calabresa
//			else if (numeroSelecionado == 2)  {  // Caso verdadeiro 
//				while(!satisfeitoFatias) {  // Repete at� que seja falso
//					
//					System.out.println("Voc� selecionou Calabresa, Deseja mais uma fatia?"
//						+ "\n1 - Sim"       //impress�o caso selecione Calabresa
//						+ "\n2 - N�o");
//					
//					sabor = scanner.nextInt();
//					 if (sabor == 1) // Caso verdadeiro 
//						calabresa ++;
//					 else {
//						 	System.out.println("Voc� comeu " + calabresa + " de fatias de calabresa ");
//				    satisfeitoFatias = true;
//					 }
//				}
//				}
//					// *********************************** Frango 
//				    
//					else if (numeroSelecionado == 3)  { 
//						while(!satisfeitoFatias) {  
//							
//							System.out.println("Voc� selecionou Frango,Deseja mais uma fatia?"
//								+ "\n1 - Sim"      
//								+ "\n2 - N�o");
//							
//							sabor = scanner.nextInt();
//							 if (sabor == 1)
//								frango ++;
//							 else {
//								 	System.out.println("Voc� comeu " + frango + " de fatias de frango ");
//						    satisfeitoFatias = true;
//			
	

//	private static void recomendacoes1(String next) {
		// TODO Auto-generated method stub
		
	


//Parte comentada 
//;	
	
	
//				 filme1.nome = "John Wick";
//				 filme1.sinopse = "Filme de a��o com cachorro";
//				 filme1.genero = "a��o";
//				 filme1.link = "www.teste.com.br";
			