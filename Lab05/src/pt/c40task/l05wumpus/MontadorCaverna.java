package pt.c40task.l05wumpus;
/*
Herói: “P”
Wumpus: “W”
Buraco: “B”
Ouro: “O”
Fedor: “f”
Brisa: “b”
*/

import pt.c40task.l05wumpus.Componentes.*;


public class MontadorCaverna {
	private Caverna caverna;
	int pos[] = new int[2];
	int nHeroi, nWumpus, nBuraco, nOuro;
	
	public MontadorCaverna(String[][] cave) {
		caverna = new Caverna();
		for (int l = 0; l < cave.length; l++) {
	        for (int c = 0; c < cave[l].length; c++) {
	        	if (c != 3)
	        		pos[c] = Integer.parseInt(cave[l][c]);
	        	else {
	        		switch (cave[l][c]) {
		        		case "P":{
		        			Heroi h = new Heroi(pos[0], pos[1], caverna);
		        			this.caverna.ConectaComponente(pos[0], pos[1], h);
		        			break;
		        		}
		        		case "W":{
		        			Wumpus w = new Wumpus(pos[0], pos[1]);
		        			this.caverna.ConectaComponente(pos[0], pos[1], w);
		        			break;
		        		}
		        		case "B":{
		        			Buraco b = new Buraco(pos[0], pos[1], caverna);
		        			this.caverna.ConectaComponente(pos[0], pos[1], b);
		        			break;
		        		}
		        		case "O":{
		        			Ouro o  = new Ouro(pos[0], pos[1]);
		        			this.caverna.ConectaComponente(pos[0], pos[1], o);
		        			break;
		        		}
	        		}
	        	}
	        }
		}
	}
	
	public void CavernaVerificacao(String[][] cave) {
		for (int l = 0; l < cave.length; l++) {
	        for (int c = 0; c < cave[l].length; c++) {
	        	if (cave[l][c].equals("P"))
	        		nHeroi ++;
	        	else if (cave[l][c].equals("W"))
		        		nWumpus ++;
	        	else if (cave[l][c].equals("B"))
		        		nBuraco ++;
	        	else if (cave[l][c].equals("O"))
		        		nOuro ++;
	        	}
	        }
		if (nBuraco == 3 || nBuraco == 2 && nWumpus == 1 && nHeroi == 1 && nOuro == 1 != true) {
			PrintUtils.displayMessage("Caverna invalida");
			System.exit(1);
		}
	}

	public Caverna getCaverna() {
		return caverna;
	}
	
	public Heroi getHeroi() {
		return h;
	}
	
	
}
