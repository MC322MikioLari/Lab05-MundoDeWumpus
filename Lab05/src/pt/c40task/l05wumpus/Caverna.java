package pt.c40task.l05wumpus;

import pt.c40task.l05wumpus.Componentes.Brisa;
import pt.c40task.l05wumpus.Componentes.Buraco;
import pt.c40task.l05wumpus.Componentes.Fedor;
import pt.c40task.l05wumpus.Componentes.Heroi;
import pt.c40task.l05wumpus.Componentes.Ouro;
import pt.c40task.l05wumpus.Componentes.Wumpus;

public class Caverna {
	Sala cave[][];
	public Caverna() {
		cave = new Sala[4][4];
		for (int i = 0; i < cave.length; i++) {
	        for (int j = 0; j < cave[i].length; j++) {
	        	cave[i][j]= new Sala(); 
	        }
		}
	}
	
	public void ConectaComponente(int i, int j, Heroi h) {
		this.cave[i][j].h = h;
	}
	public void ConectaComponente(int i, int j, Wumpus w) {
		this.cave[i][j].w = w;
	}
	public void ConectaComponente(int i, int j, Ouro o) {
		this.cave[i][j].o = o;
	}
	public void ConectaComponente(int i, int j, Buraco B) {
		this.cave[i][j].B = B;
	}
	public void ConectaComponente(int i, int j, Brisa brisa) {
		this.cave[i][j].brisa = brisa;
	}
	public void ConectaComponente(int i, int j, Fedor f) {
		this.cave[i][j].f = f;
	}
	
	public void criaFedor(int i, int j) {
		ConectaComponente(i-1, j, new Fedor());
		ConectaComponente(i+1, j, new Fedor());
		ConectaComponente(i, j-1, new Fedor());
		ConectaComponente(i-1, j+1, new Fedor());
	}
	public void criaBrisa(int i, int j) {
		ConectaComponente(i-1, j, new Brisa());
		ConectaComponente(i+1, j, new Brisa());
		ConectaComponente(i, j-1, new Brisa());
		ConectaComponente(i-1, j+1, new Brisa());
	}
	
	/*
	w -> Her�i movimenta para a sala acima;
	s ->  Her�i movimenta para a sala abaixo;
	d ->  Her�i movimenta para a sala a direita;
	a ->  Her�i movimenta para a sala a esquerda;
	k -> Her�i equipa a flecha;
	c -> Her�i captura o ouro;
	q -> O usu�rio sai do jogo.*/
	
	public Boolean VerificaMovimento(int i, int j, char movimento) {
		if (i < 0|| i >= 4 || j < 0 || j >= 4 )
			return false;
		if (movimento != 'w' && movimento != 's' && movimento != 'd' && movimento != 'a' && movimento != 'k' && movimento != 'c' && movimento != 'q')
			return false;
		return true;
	}

	public void MovimentoCav(int i, int j, int i_new, int j_new) {
		cave[i][j].setVisitada();
		cave[i][j].componente = cave[i_new][j_new].componente;
		cave[i][j].componente = null;
	}
	public boolean existeOuro(int i, int j) {
		if (cave[i][j].temOuro() == null)
			return false;
		return true;
	}
	public boolean existeWumpus(int i, int j) {
		if (cave[i][j].temWumpus() == null)
			return false;
		return true;
	}
	public boolean existeBuraco(int i, int j) {
		if (cave[i][j].temBuraco() == null)
			return false;
		return true;
	}
<<<<<<< HEAD
	public String[][] retornaSaida() {
		String[][] saida;
		saida = new String[4][4];
=======
	public char[][] retornaSaida() {
		char[][] saida;
		saida = new char[4][4];
>>>>>>> origin/mikio
		for (int i = 0; i < cave.length; i++) {
	        for (int j = 0; j < cave[i].length; j++) {
	        	if (cave[i][j].o != null)
	        		saida[i][j] = 'O';
	        	else if (cave[i][j].w != null)
	        		saida[i][j] = 'W';
	        	else if (cave[i][j].B != null)
	        		saida[i][j] = 'B';
	        	else if (cave[i][j].h != null)
	        		saida[i][j] = 'P';
	        	else if (cave[i][j].f != null)
	        		saida[i][j] = 'f';
	        	else if (cave[i][j].brisa != null)
	        		saida[i][j] = 'b';
	        	else {
	        		if (cave[i][j].visitada == true)
	        			saida[i][j] = '#';
	        		else
	        			saida[i][j] = '-';
	        	}
	        }
		}
		return saida;
	}
	public void imprimeCaverna(String[][] saida) {
		for(int i = 0; i < 4; i++) {
	    	  for(int j = 0; j < 4; j++) {
	    		  System.out.print(saida[i][j] + " ");
	    	  }
	    	  System.out.println();
		}
		
	}

}
























