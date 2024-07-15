package Annotation;

public class APP {
	public static void main(String[] args) {
        // Obter a classe do Carro
        Class<?> classeCarro = Carro.class;

        // Verificar se a anotação Tabela está presente
        if (classeCarro.isAnnotationPresent(Tabela.class)) {
        	
            // Obter a instância da anotação Tabela
            Tabela tabelaAnnotation = classeCarro.getAnnotation(Tabela.class);

            // Imprimir o nome da tabela
            System.out.println("Nome da tabela: " + tabelaAnnotation.nome());
        } else {
            System.out.println("A anotação Tabela não está presente na classe Carro.");
        }
    }
}
