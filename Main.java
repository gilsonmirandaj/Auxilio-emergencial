package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Pessoa p = new Pessoa();
		BolsaFamilia bf = new BolsaFamilia();
		MaeSolteira ms = new MaeSolteira();
		NaoRecebeBolsa nrb = new NaoRecebeBolsa(); 
		NaoMaeSolteira nm = new NaoMaeSolteira();
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Digite seu nome completo: ");
		p.setNome(ler.next());
		
		System.out.println("\nDigite sua idade: ");
		p.setIdade(ler.nextInt());
		
		if(p.getIdade() < 18) {
			System.out.println("Você não tem direito ao benefício, pois não completou 18 anos.");
			System.exit(0);
		}
		
		System.out.println("\nInforme se você é beneficiário do Bolsa Família: ");
		System.out.println("1 -  Sim");
		System.out.println("2 -  Não");
		p.setRecebeBolsa(ler.next().charAt(0));
		
		if(p.getRecebeBolsa() == '1') {
			System.out.println("\nQuantas pessoas moram na sua casa, incluindo você: ");
			p.setNumDePessoas(ler.nextInt());
			
			System.out.println("\nComo você se identifica: ");
			System.out.println("M - Masculino ");
			System.out.println("F - Feminino ");
			System.out.println("0 - Outros ");
			p.setSexo(ler.next().charAt(0));
			
			System.out.println("\nVocê possui filhos menores de 18 anos?: ");
			System.out.println("1 -  Sim");
			System.out.println("2 -  Não");
			ms.setFilhos(ler.next().charAt(0));
			
			System.out.println("\nVocê é casada formalmente: ");
			System.out.println("1 -  Sim");
			System.out.println("2 -  Não");
			ms.setEstadoCivil(ler.next().charAt(0));
			
			if(p.getSexo() == 'F' && ms.getFilhos() == '1' && ms.getEstadoCivil() == '2') {
				System.out.println("Você tem direito ao auxílio e o valor é de R$ 375,00.");
			} 
			else if(p.getNumDePessoas() >= 2 ) {
				System.out.println("Você tem direito ao auxílio e o valor é de R$ 250,00.");
			}
			else {
				System.out.println("Pessoas solteiras, sem filhos, não recebem bolsa família.");
			}
			
		} 
		else {
			System.out.println("\nIdentifique qual sua categoria de trabalho: ");
			System.out.println("1 - Estágio ou bolsa");
			System.out.println("2 - Trabalho Formal");
			System.out.println("3 - Trabalho informal");
			System.out.println("4 - Desempregado, recebendo auxílio desemprego ou aposentado");
			System.out.println("5 - Desempregado");
			nm.setTipoTrabalho(ler.next().charAt(0));
			
			if(nm.getTipoTrabalho() == '1' || nm.getTipoTrabalho() == '2' || nm.getTipoTrabalho() == '4') {
				System.out.println("Você não tem direito ao auxílio emergencial.");
				System.exit(0);
			} 
			
			System.out.println("Qual a renda total da sua família?");
			nm.setRendaTotal(ler.nextDouble());
			
			System.out.println("\nQuantas pessoas moram na sua casa, incluindo você: ");
			nm.setNumDePessoas(ler.nextInt());
			
			nm.calculaPerCapita();
			
			System.out.println(nm.getRendaPerCapita());	
	
		}
		
		ler.close();

	}

}
