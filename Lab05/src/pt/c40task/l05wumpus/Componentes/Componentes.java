package pt.c40task.l05wumpus.Componentes;

import pt.c40task.l05wumpus.Caverna;

public class Componentes {
	Caverna cave;
	int i, j;
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	public int getJ() {
		return j;
	}
	public void setJ(int j) {
		this.j = j;
	}
	public void conectaCaverna(Caverna cave) {
		this.cave = cave;
	}
}
