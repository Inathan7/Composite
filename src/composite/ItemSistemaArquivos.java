package composite;

public abstract class ItemSistemaArquivos {
	
	//ficou aqui porque serve para conteineres e componentes simples.
	private String nome;
	
	//ficou aqui porque serve para conteineres e componentes simples.
	private Pasta pastaPai;

	//ficou aqui porque se aplica para conteineres e componentes simples.
	//abstrato pois eh mais seguro haver implementacoes povidas somente por subtipos concretos desta classe.
	public abstract void mover(Pasta destino);
	
	//ficou aqui porque se aplica para conteineres e componentes simples.
	//abstrato pois eh mais seguro haver implementacoes povidas somente por subtipos concretos desta classe
	public abstract int tamanhoEmBytes();
	
	//ficou aqui porque se aplica para conteineres e componentes simples.
	//abstrato pois eh mais seguro haver implementacoes povidas somente por subtipos concretos desta classe
	public abstract ItemSistemaArquivos buscar(String nome);
	
	public ItemSistemaArquivos(String nome) {
		setNome(nome);
	}
	
	
	//implementado aqui porque se aplica para conteineres e componentes simples.
	public Pasta getPastaPai() {
		return this.pastaPai;
	}
	
	//implementado aqui porque se aplica para conteineres e componentes simples.
	void setPastaPai(Pasta pastaPai) {
		this.pastaPai = pastaPai;
	}
	
	//implementado aqui porque se aplica para conteineres e componentes simples.
	public String getNome() {
		return nome;
	}
	
	//implementado aqui porque se aplica para conteineres e componentes simples.
	public void setNome(String nome) {
		/**
		 * TODO COMPOSITE.04
		 * 1. Nao deixe o nome ser mudado caso haja qualquer outro item de mesmo nome da pastaPai em diante.
		 * 2. Use this.pastaPai.buscar(nome) na implementacao
		 * 3. Se o nome nao estiver em uso sete o nome, caso contrario, lance uma excecao com o motivo.
		 */
		this.nome = nome;
	}
	
	/* TODO COMPOSITE.01
	 * 
	 * 1. Este metodo deve ser implementado por um objeto conteiner e por qualquer componente simples. 
	 * 2. Como dependera do tipo de objeto conteiner ou componente simples a implementacao e tambem queremos
	 * que o acesso a este metodo seja transparente (sem acomplamentos instanceof e cast no cliente). Devemos colocar uma 
	 * implementacao padrao vazia (ou com lançamento de excecao por padrao aqui), ou devemos deixar esse metodo abstrato?  
	 */
	public abstract void deletar(); //INATHAN - Abstrato eu acho
	
	
	/* TODO COMPOSITE.02
	 * 
	 * 1. Este metodo deve ser implementado somente por um objeto conteiner. 
	 * 2. Essa implementacao dependera do tipo de objeto conteiner e tambem queremos
	 * que o acesso a este metodo seja transparente (sem acomplamentos instanceof e cast cliente). Devemos colocar uma 
	 * implementacao padrao vazia (ou com lançamento de excecao por padrao aqui) ou devemos deixar esse metodo abstrato?  
	 */
	public /*abstract*/ ItemSistemaArquivos[] getConteudo() { //INATHAN - Padr�o eu acho
		return null;
	}
	
	
}
