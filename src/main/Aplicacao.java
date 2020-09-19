package main;

import cliente.ExibidorGraficoSistemaDeArquivos;
import composite.Arquivo;
import composite.ItemSistemaArquivos;
import composite.Pasta;

public class Aplicacao {

	public static void main(String[] args) {
		Pasta pastaA = new Pasta("PASTA A");
		Pasta pastaB = new Pasta("PASTA B");
		Pasta pastaC = new Pasta("PASTA C");

		Arquivo arquivo1 = new Arquivo("ARQUIVO 1", ".pdf");
		Arquivo arquivo2 = new Arquivo("ARQUIVO 2", ".docx");
		Arquivo arquivo3 = new Arquivo("ARQUIVO 3", ".pptx");
		try {
			pastaA.add(arquivo1);
			pastaA.add(arquivo2);
			pastaA.add(arquivo3);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		/**
		 * TODO COMPOSITE.06  
		 * 
		 * 1. Crie mais 6 arquivos. 
		 * 2. Adicione 3 arquivos ainda nao adicionados em outras pastas na pastaB e mais outros 3 arquivos nao usados em outras pastas na pastaC. 
		 * 3. Confira se as execucoes de apresentacao das 3 pastas abaixo estao acordo com o esperado.
		 */
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaB);
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaC);

		/**
		 * TODO COMPOSITE.06
		 * 1. Adicione a pastaC dentro da pastaB
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaB);

		/**
		 * TODO COMPOSITE.06
		 * 1. Adicione a pastaB dentro da pastaA
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		
		/**
		 * TODO COMPOSITE.06
		 * 1. Crie uma pastaD e adicione-a na pastaA
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		
		/**
		 * TODO COMPOSITE.06
		 * 1. Mova a pastaB para a pastaD
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		
		/**
		 * TODO COMPOSITE.06
		 * 1. Mova a pastaD para a pastaB
		 * 2. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(pastaA);
		
		/**
		 * TODO COMPOSITE.07
		 * 1. Precisamos criar uma classe conteiner de nome ArquivoCompactado.
		 * 2. Instancie um ArquivoCompactado e adicione a pastaA nele.
		 * 3. Confira se a execucao de apresentacao da pasta esta de acordo com o esperado.
		 */
		ItemSistemaArquivos arquivoCompactado = null; //instancie um ArquivoCompactado
		//adicione a pastaA ao arquivoCompactado
		ExibidorGraficoSistemaDeArquivos.exibirItemJanelaSwing(arquivoCompactado);
		

	}

}
