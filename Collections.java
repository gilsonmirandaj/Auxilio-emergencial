package classes;

import java.util.ArrayList;
import java.util.*;



public class Collections {
	
	
	
		String valorMS = "Voc� tem direito ao aux�lio e o valor � de R$ 375,00." ;
		String valorP2 = "Voc� tem direito ao aux�lio e o valor � de R$ 250,00.";
		String valorSBF = "Pessoas solteiras, sem filhos, n�o recebem bolsa fam�lia.";
		String valorP1 = "Voc� tem direito ao aux�lio e o valor � de R$ 150,00.";
		
		
		
		public Collections(String valorMS, String valorP2, String valorSBF, String valorP1) {
			super();
			this.valorMS = valorMS;
			this.valorP2 = valorP2;
			this.valorSBF = valorSBF;
			this.valorP1 = valorP1;
		}



		void array() {
		List<String> valores = new ArrayList<>();
		valores.add(valorMS);
		valores.add(valorP2);
		valores.add(valorSBF);
		valores.add(valorP1);		
		}
		
}
