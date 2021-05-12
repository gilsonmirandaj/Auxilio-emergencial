package main;

public class NaoMaeSolteira extends NaoRecebeBolsa{
	
	NaoRecebeBolsa nrb = new NaoRecebeBolsa();
	
	private double rendaPerCapita = 0.0;

	public double getRendaPerCapita() {
		return rendaPerCapita;
	}

	public void setRendaPerCapita(double rendaPerCapita) {
		this.rendaPerCapita = rendaPerCapita;
	}
	
	void calculaPerCapita() {
		rendaPerCapita = (getRendaTotal()/getNumDePessoas());
		
	}

}
