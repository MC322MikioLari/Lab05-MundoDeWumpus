package pt.c40task.l05wumpus.Componentes;

import pt.c40task.l05wumpus.Caverna;

public class Buraco extends Componente {
	
	public Buraco(int i, int j, Caverna caverna) {
		super('B', 4, i, j, caverna);
	}
	
	public void criaBrisa(int i, int j) {
		cave.ConectaComponente(i-1, j, new Brisa(i-1, j, cave));
		cave.ConectaComponente(i+1, j, new Brisa(i+1, j, cave));
		cave.ConectaComponente(i, j-1, new Brisa(i, j-1, cave));
		cave.ConectaComponente(i-1, j+1, new Brisa(i, j+1, cave));
	}

}
