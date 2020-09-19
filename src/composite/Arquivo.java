package composite;

public class Arquivo extends ItemSistemaArquivos {

	private String extensao;
	
	public Arquivo(String nome, String extensao) {
		super(nome);
		this.extensao = extensao;
	}
	
	@Override
	public String getNome() {
		return super.getNome()+this.extensao;
	}
	
	@Override
	public int tamanhoEmBytes() {
		return getNome().getBytes().length + getExtensao().getBytes().length;
	}

	public String getExtensao() {
		return extensao;
	}
	
	public void setExtensao(String extensao) {
		this.extensao = extensao;
	}

	@Override
	public void deletar() {
		System.out.println("Arquivo '"+ getNome() + "' removido com sucesso!");//simula remocao do arquivo
	}

	@Override
	public void mover(Pasta destino) {
		getPastaPai().remove(this);
		try {
			destino.add(this);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public ItemSistemaArquivos buscar(String nome) {
		return (nome != null && nome.equals(getNome()))? this : null;
	}
	
//	@Override
//	public ItemSistemaArquivos[] getConteudo() {
		/* TODO COMPOSITE.02
		 * 
		 * 1. Este metodo deve ser implementado somente por um objeto conteiner (aqui no arquivo ele nao faz nada). 
		 * 2. Essa implementacao dependera do tipo de objeto conteiner e tambem queremos que o acesso a este metodo seja 
		 * transparente (sem acomplamentos instanceof e cast cliente). Devemos colocar uma implementacao padrao vazia 
		 * (ou com lanÃ§amento de excecao por padrao aqui), desobrigando essa implementacao aqui, 
		 * ou, devemos deixar esse metodo ainda como sendo abstrato na superclasse, permanecendo essa implementacao padrao vazia aqui?  
		 */
//		return null;
//	}
	
	//INATHAN - tirar essa implementação, acredito que seja mais interessante

}
