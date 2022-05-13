package pt.c40task.l05wumpus;

public class Caverna {
	int[] pos;
	Sala cave[][];
	public Caverna() {
		
	}
	
	public void ConectaComponente(int[] pos, Heroi h) {
		this.cave[pos[0]][pos[1]].h = h;
	}
	public void ConectaComponente(int[] pos, Wumpus w) {
		this.cave[pos[0]][pos[1]].w = w;
	}
	public void ConectaComponente(int[] pos, Ouro o) {
		this.cave[pos[0]][pos[1]].o = o;
	}
	public void ConectaComponente(int[] pos, Buraco b) {
		this.cave[pos[0]][pos[1]].b = b;
	}
	public void ConectaComponente(int[] pos, Brisa brisa) {
		this.cave[pos[0]][pos[1]].brisa = brisa;
	}
	public void ConectaComponente(int[] pos, Fedor f) {
		this.cave[pos[0]][pos[1]].f = f;
	}
}
