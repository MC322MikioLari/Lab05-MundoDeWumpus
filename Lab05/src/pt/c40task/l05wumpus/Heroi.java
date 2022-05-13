package pt.c40task.l05wumpus;

public class Heroi extends Componentes {
	int[] pos;
	public Heroi(int[] pos){
		this.pos = pos;
	}
	public int[] getPos() {
		return pos;
	}
	public void setPos(int[] pos) {
		this.pos = pos;
	}
}
