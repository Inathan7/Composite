package composite;

/**
 * TODO COMPOSITE.07 // Feito
 * 1. Implemente este componente como contêiner capaz de adicionarmos.
 * 2. A extensao desse arquivo eh sempre .zip
 * 3. Você herdaria de Arquivo?
 */
public class ArquivoCompactado extends Pasta{
	
	public ArquivoCompactado(String nome) {
		super(nome+".zip");
		// TODO Auto-generated constructor stub
	}

}
