package pt.c40task.l05wumpus;

public class Wumpus extends Componente{
	int i, j;
	boolean vivo;
	public Wumpus(int i, int j) {
		this.i = i;
		this.j = j;
		this.vivo = true;
	}
	
	public void criaFedor(int i, int j) {
		cave.ConectaComponente(i-1, j, new Fedor());
		cave.ConectaComponente(i+1, j, new Fedor());
		cave.ConectaComponente(i, j-1, new Fedor());
		cave.ConectaComponente(i-1, j+1, new Fedor());
	}
	
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
}
