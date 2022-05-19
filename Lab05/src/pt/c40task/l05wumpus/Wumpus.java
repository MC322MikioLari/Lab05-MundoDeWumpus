package pt.c40task.l05wumpus;

public class Wumpus extends Componentes{
	int i, j;
	boolean vivo;
	public Wumpus(int i, int j) {
		this.i = i;
		this.j = j;
		this.vivo = true;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
}
