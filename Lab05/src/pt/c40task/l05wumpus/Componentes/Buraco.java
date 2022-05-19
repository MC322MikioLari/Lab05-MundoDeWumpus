package pt.c40task.l05wumpus.Componentes;

import pt.c40task.l05wumpus.Caverna;

public class Buraco extends Componente {
	private int i, j;
	
	public Buraco(int i, int j, Caverna caverna) {
		super('B', 4, i, j, caverna);
	}
	
	public void criaBrisa(int i, int j) {
		cave.ConectaComponente(i-1, j, new Brisa());
		cave.ConectaComponente(i+1, j, new Brisa());
		cave.ConectaComponente(i, j-1, new Brisa());
		cave.ConectaComponente(i-1, j+1, new Brisa());
	}

}
