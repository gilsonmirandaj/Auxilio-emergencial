package classes;

public class MaeSolteira extends BolsaFamilia{
	
	private char filhos, estadoCivil;

	public char getFilhos() {
		return filhos;
	}

	public void setFilhos(char filhos) {
		this.filhos = filhos;
	}

	public char getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(char estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	
	/*void recebeAuxilio() {
		System.out.println("\nVocê possui filhos menores de 18 anos?: ");
		System.out.println("1 -  Sim");
		System.out.println("2 -  Não");
		setFilhos(ler.next().charAt(0));
		
		System.out.println("\nVocê é casada formalmente: ");
		System.out.println("1 -  Sim");
		System.out.println("2 -  Não");
		setEstadoCivil(ler.next().charAt(0));
		
		if(getSexo() == 'F' && getFilhos() == '1' && getEstadoCivil() == '2') {
			System.out.println("Você tem direito ao auxílio e o valor é de R$ 375,00.");
		} 
		else if(getNumDePessoas() >= 2 ) {
			System.out.println("Você tem direito ao auxílio e o valor é de R$ 250,00.");
		}
		else {
			System.out.println("Pessoas solteiras, sem filhos, não recebem bolsa família.");
		}
		
	}*/
	
	void estadoCivil() {
		
		
	}
	
	
	//void recebeAuxilio() {
		//char capturaSexo = getSexo();
		//char capturaFilhos = getFilhos();
		//char capturaEstado = getEstadoCivil();
		
		
	//}
	
	
	

}
