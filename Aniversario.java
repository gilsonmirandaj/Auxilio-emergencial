package classes;

import java.util.Scanner;

public class Aniversario {
	
	Scanner ler = new Scanner(System.in);
	private int mesAniver;
	
	

	public int getMesAniver() {
		return mesAniver;
	}

	public void setMesAniver(int mesAniver) {
		this.mesAniver = mesAniver;
	}
	
	void leitura() {
		System.out.println("Indique seu m�s de nascimento, em n�mero.");
		mesAniver = ler.nextInt();
	}
	

	void mes(){
		switch(mesAniver) {
		
		case(1):
			System.out.println("Voc� ir� receber em 06/04");
		case(2):	
			System.out.println("Voc� ir� receber em 09/04");
		case(3):	
			System.out.println("Voc� ir� receber em 11/04");
		case(4):	
			System.out.println("Voc� ir� receber em 13/04");
		case(5):	
			System.out.println("Voc� ir� receber em 15/04");
		case(6):	
			System.out.println("Voc� ir� receber em 18/04");
		case(7):	
			System.out.println("Voc� ir� receber em 20/04");
		case(8):	
			System.out.println("Voc� ir� receber em 22/04");
		case(9):	
			System.out.println("Voc� ir� receber em 25/04");
		case(10):	
			System.out.println("Voc� ir� receber em 27/04");
		case(11):	
			System.out.println("Voc� ir� receber em 28/04");
		case(12):	
			System.out.println("Voc� ir� receber em 29/04");
		default:
			System.out.println("Op��o n�o reconhecida");
		}
		
	}
	
	

}
