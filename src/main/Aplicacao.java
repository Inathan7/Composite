package main;

import cliente.ExibidorGraficoSistemaDeArquivos;
import composite.Arquivo;
import composite.ArquivoCompactado;
import composite.Pasta;

public class Aplicacao {

	public static void main(String[] args) {
		Pasta pastaA = new Pasta("PASTA A");
		Pasta pastaB = new Pasta("PASTA B");
		Pasta pastaC = new Pasta("PASTA C");

		Arquivo arquivo1 = new Arquivo("ARQUIVO 1", ".pdf");
		Arquivo arquivo2 = new Arquivo("ARQUIVO 2", ".docx");
		Arquivo arquivo3 = new Arquivo("ARQUIVO 3", ".pptx");
		
		Arquivo arquivo4 = new Arquivo("ARQUIVO 4", ".txt");
		Arquivo arquivo5 = new Arquivo("ARQUIVO 5", ".mp3");
		Arquivo arquivo6 = new Arquivo("ARQUIVO 6", ".xml");
		
		Arquivo arquivo7 = new Arquivo("ARQUIVO 7", ".mp4");
		Arquivo arquivo8 = new Arquivo("ARQUIVO 8", ".lrc");
		Arquivo arquivo9 = new Arquivo("ARQUIVO 9", ".exe");
		
		try {
			pastaA.add(arquivo1);
			pastaA.add(arquivo2);
			pastaA.add(arquivo3);
			
			pastaB.add(arquivo4);
			pastaB.add(arquivo5);
			pastaB.add(arquivo6);
			
			pastaC.add(arquivo7);
			pastaC.add(arquivo8);
			pastaC.add(arquivo9);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		/**
		 * TODO COMPOSITE.06 Feito 
		 * 
		 * 1. Crie mais 6 arquivos. 
		 * 2. Adicione 3 arquivos ainda nao adicionados em outras pastas na pastaB e mais outros 3 arquivos nao usados em outras pastas na pastaC. 
		 * 3. Confira se as execucoes de apresentacao das 3 pastas abaixo estao acordo com o esperado.
		 */
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaB);
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaC);

		/**
		 * TODO COMPOSITE.06 //Feito
		 * 1. Adicione a pastaC dentro da pastaB
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		try {
			pastaB.add(pastaC);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaB);

		/**
		 * TODO COMPOSITE.06 //Feito
		 * 1. Adicione a pastaB dentro da pastaA
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		try {
			pastaA.add(pastaB);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		
		/**
		 * TODO COMPOSITE.06 //Feito
		 * 1. Crie uma pastaD e adicione-a na pastaA
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		Pasta pastaD = new Pasta("Pasta D");
		try {
			pastaA.add(pastaD);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		
		/**
		 * TODO COMPOSITE.06 //Feito
		 * 1. Mova a pastaB para a pastaD
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		pastaB.mover(pastaD);
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		
		/**
		 * TODO COMPOSITE.06 //Feito
		 * 1. Mova a pastaD para a pastaB
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		pastaD.mover(pastaB);
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		
		/**
		 * TODO COMPOSITE.07
		 * 1. Precisamos criar uma classe conteiner de nome ArquivoCompactado.
		 * 2. Instancie um ArquivoCompactado e adicione a pastaA nele.
		 * 3. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		Pasta arquivoCompactado = new ArquivoCompactado("ArquivoCompactado"); //instancie um ArquivoCompactado
		//adicione a pastaA ao arquivoCompactado
		try {
			arquivoCompactado.add(pastaA);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(arquivoCompactado);
		

	}

}
