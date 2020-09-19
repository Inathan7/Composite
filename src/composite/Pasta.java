package composite;
import java.util.HashSet;
import java.util.Set;

public class Pasta extends ItemSistemaArquivos {

	private Set<ItemSistemaArquivos> itens = new HashSet<>();

	public Pasta(String nome) {
		super(nome);
	}
	
	public void remove(ItemSistemaArquivos item) {
		itens.remove(item);
		item.setPastaPai(null);
	}
	
	public ItemSistemaArquivos[] getConteudo() {
		return (ItemSistemaArquivos[]) this.itens.toArray();
	}
	
	@Override
	public int tamanhoEmBytes() {
		int tamanho = 0;
		for (ItemSistemaArquivos item : itens) {
			tamanho += item.tamanhoEmBytes();
		}
		return tamanho + getNome().getBytes().length;
	}

	@Override
	public void deletar() {
		/**
		 * TODO COMPOSITE.01  // Feito
		 * 
		 * 1. Implemente a remocao fisica de cada item interno da pasta. 
		 * 2. Verifique se faz sentido se este metodo tambem deve implementar propagacao de chamada de deletar() para cada um dos itens internos da propria pasta.
		 */
		
		//INATHAN -> 
		
		itens.clear();  //Acho que funciona assim
		
		System.out.println("Pasta '" + getNome() + "' apagada com sucesso!"); //simula remocao da pasta
	}
	
	@Override
	public void mover(Pasta destino) {
		/** 
		 * TODO COMPOSITE.03  //Feito
		 * 
		 * 1. Implemente o mover desta pasta para a referenciada no parametro de entrada de destino. Veja a implementaao de Arquivo.mover() para se inspirar.
		 * 2. Verifique se faz sentido se este metodo tambem deve implementar propagacao de chamada de mover() para cada um dos itens internos da propria pasta.
		 */
		
		//INATHAN ->
		
		getPastaPai().remove(this);
		try {
			destino.add(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Pasta '" + getNome() + "' movida com sucesso!");
		
	}
	
	@Override
	public ItemSistemaArquivos buscar(String nome) {
		/**
		 * TODO COMPOSITE.04
		 * 
		 * 1. Implemente uma busca desta pasta para outras internas a ela. 
		 * 2. Use propopagacao da chamada de buscar() para itens filhos devolverem um item, caso se tenha o mesmo nome, ou, que se retorne null se nao 
		 * houver item com o mesmo nome. 
		 */
		
		//INATHAN ->
		
		//NÃO ENTENDI O QUE QUIS DIZER, PODEMOS VER JUNTOS.
		
		return null;
	}
	
	public void add(ItemSistemaArquivos item) throws Exception {
		/** 
		 * TODO COMPOSITE.04
		 * 1. Altere esta implementacao para lancar uma excecao em caso do mesmo item ja existir nesta pasta ou em pastas filhas.
		 * 2. Use propagacao da chamada de buscar(nome) para itens filhos para checar se ha um item de mesmo nome.
		 * 2. Caso esse item nao exista, pode prosseguir adicionado como indicado no codigo abaixo.
		 */
		
		//INATHAN ->
		
		if (buscar(item.getNome()) != null) {
			throw new Exception("Item já existe");
		}
		
		itens.add(item);
		item.setPastaPai(this);
	}
	
	
	

}
