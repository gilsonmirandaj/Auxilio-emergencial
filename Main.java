package classes;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Pessoa p = new Pessoa();
		NaoMaeSolteira nm = new NaoMaeSolteira();
		Aniversario aniver = new Aniversario();
		NaoRecebeBolsa nrb = new NaoRecebeBolsa();
		Scanner ler = new Scanner(System.in);
		
		System.out.println("========================================================");
		System.out.println("= Descubra se você tem direito ao auxílio emergencial. =");
		System.out.println("========================================================");

		p.getNome();
		p.idade();
		p.recebeBolsa();

		if (p.getRecebeBolsa() == '1') {
			p.numPessoas();
			p.sexo();
			p.recebeAuxilio();

		} else {

			nrb.tipoTrabalho();
			nm.renda();
			p.recebeAuxilio();

		}
		
		aniver.leitura();
		aniver.mes();

		ler.close();
	}

}
