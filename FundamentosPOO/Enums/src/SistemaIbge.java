// qualquer classe do sistema poderá obter os objetos de EstadoBrasileiro
public class SistemaIbge {
	public static void main(String[] args) {
		//imprimindo os estados existentes no enum
		for(EstadoBrasileiro uf: EstadoBrasileiro.values() ) {
		   System.out.println(uf.getSigla() + "-" + uf.getNomeMaiusculo() + "-" + uf.getIbge());
		}
		
		//selecionando um estado a partir das opções disponíveis
		EstadoBrasileiro ufSelecionado = EstadoBrasileiro.SAO_PAULO;
		
		System.out.println("O estado selecionado foi: " + ufSelecionado.getNome() + " e seu código é " + ufSelecionado.getIbge());
	}
} 