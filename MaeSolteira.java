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
		System.out.println("\nVoc� possui filhos menores de 18 anos?: ");
		System.out.println("1 -  Sim");
		System.out.println("2 -  N�o");
		setFilhos(ler.next().charAt(0));
		
		System.out.println("\nVoc� � casada formalmente: ");
		System.out.println("1 -  Sim");
		System.out.println("2 -  N�o");
		setEstadoCivil(ler.next().charAt(0));
		
		if(getSexo() == 'F' && getFilhos() == '1' && getEstadoCivil() == '2') {
			System.out.println("Voc� tem direito ao aux�lio e o valor � de R$ 375,00.");
		} 
		else if(getNumDePessoas() >= 2 ) {
			System.out.println("Voc� tem direito ao aux�lio e o valor � de R$ 250,00.");
		}
		else {
			System.out.println("Pessoas solteiras, sem filhos, n�o recebem bolsa fam�lia.");
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
