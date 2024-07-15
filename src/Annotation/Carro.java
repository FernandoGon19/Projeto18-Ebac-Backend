package Annotation;

@Tabela(nome = "ListaCarro")
public class Carro {

	private String nomeCarro;
	private String corDoCarro;
	
	public Carro(String nomeCarro, String corDoCarro) {
		super();
		this.nomeCarro = nomeCarro;
		this.corDoCarro = corDoCarro;
	}

	public String getNomeCarro() {
		return nomeCarro;
	}

	public String getCorDoCarro() {
		return corDoCarro;
	}
	
	
	
}
