package pt.c40task.l05wumpus;

import pt.c40task.l05wumpus.Caverna;

public class Wumpus extends Componente{
	private boolean vivo;
	
	public Wumpus(int i, int j, Caverna caverna) {
		super('W', 4, i, j, caverna);
		this.vivo = true;
	}
	
	public void criaFedor(int i, int j) {
		cave.ConectaComponente(i-1, j, new Fedor(i-1, j, cave));
		cave.ConectaComponente(i+1, j, new Fedor(i+1, j, cave));
		cave.ConectaComponente(i, j-1, new Fedor(i, j-1, cave));
		cave.ConectaComponente(i, j+1, new Fedor(i, j+1, cave));
	}
	
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
}
