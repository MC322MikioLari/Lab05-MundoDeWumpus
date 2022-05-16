package pt.c40task.l05wumpus;
/*

Her�i: �P�
Wumpus: �W�
Buraco: �B�
Ouro: �O�
Fedor: �f�
Brisa: �b�

*/

public class MontadorCaverna {
	Caverna caverna;
	Heroi h;
	Wumpus w;
	Ouro o;
	Buraco b;
	int pos[] = new int[2];
	int nHeroi, nWumpus, nBuraco, nOuro;
	
	public MontadorCaverna(String[][] cave) {
		for (int l = 0; l < cave.length; l++) {
	        for (int c = 0; c < cave[l].length; c++) {
	        	if (c != 3)
	        		pos[c] = Integer.parseInt(cave[l][c]);
	        	else {
	        		switch (cave[l][c]) {
		        		case "P":{
		        			h = new Heroi(pos);
		        			this.caverna.ConectaComponente(pos[0], pos[1], h);
		        			break;
		        		}
		        		case "W":{
		        			w = new Wumpus(pos[0], pos[1]);
		        			this.caverna.ConectaComponente(pos[0], pos[1], w);
		        			break;
		        		}
		        		case "B":{
		        			b = new Buraco();
		        			this.caverna.ConectaComponente(pos[0], pos[1], b);
		        			break;
		        		}
		        		case "O":{
		        			o  = new Ouro();
		        			this.caverna.ConectaComponente(pos[0], pos[1], o);
		        			break;
		        		}
	        		}
	        	}
	        }
		}
	}
	
	public boolean CavernaVerifica�ao(String[][] cave) {
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
		if (nBuraco == 3 || nBuraco == 2 && nWumpus == 1 && nHeroi == 1 && nOuro == 1)
			return true;
		return false;
	}
	
}
