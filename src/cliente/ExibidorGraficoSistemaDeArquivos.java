package cliente;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import composite.ItemSistemaArquivos;

public class ExibidorGraficoSistemaDeArquivos {

	public static void exibirItemJanelaSwing(ItemSistemaArquivos item) {
		/*
		 * TODO COMPOSITE.05
		 * 
		 * 1. Crie e exiba uma janela Swing.
		 * 2. Liste na janela todo o conteudo. Use formatarEmStringConteudoItem(item) disponivel nesta classe.
		 * 3. Exiba na janela o tamanho em bytes do item listado.
		 *
		 */
		
		//INATHAN ->   Ainda falta terminar
		
		JFrame view = new JFrame();
		JTextArea area = new JTextArea();
		
		view.setSize(1000, 700);
		view.setResizable(false);
		view.setLocationRelativeTo(null);
		
		area.setBounds(10, 10, 700, 500);
		area.setEditable(false);
		
		
		view.add(area);
		view.setVisible(true);
		
	}

	public static String formatarEmStringConteudoDoItem(ItemSistemaArquivos item, int recuoExibicao) {
		StringBuffer strBuffer = new StringBuffer();
		recuoExibicao = 0;
		if (item.getConteudo() != null) {
			for (ItemSistemaArquivos itemFilho : item.getConteudo()) {
				for (int i = 0; i < recuoExibicao; i++) {
					strBuffer.append(" ");
				}
				strBuffer.append("->");
				strBuffer.append(itemFilho.getNome());
				strBuffer.append(" (");
				strBuffer.append(itemFilho.tamanhoEmBytes());
				strBuffer.append(" bytes)\n");

				if (itemFilho.getConteudo() != null) {
					if (itemFilho.getConteudo().length > 0) {
						recuoExibicao++;
						strBuffer.append(formatarEmStringConteudoDoItem(itemFilho, recuoExibicao));
						recuoExibicao--;
					}
				}
			}
		}
		return strBuffer.toString();
	}

}
