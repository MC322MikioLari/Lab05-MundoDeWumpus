package pt.c40task.l05wumpus.Componentes;

import pt.c40task.l05wumpus.Caverna;

public class Componente {
	protected Caverna cave;
	protected int i, j;
	private char ID;
	private int prioridade;
	
	public Componente(int i, int j, Caverna caverna) {
		this.conectaCaverna(caverna);
		this.setID('#');
		this.setPrioridade(0);
		this.setI(i);
		this.setJ(j);
	}
	
	public Componente(char id, int prioridade, int i, int j, Caverna caverna) {
		this.conectaCaverna(caverna);
		this.setID(id);
		this.setPrioridade(prioridade);
		this.setI(i);
		this.setJ(j);
	}
	
	public Componente() {}
	
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
	
	public char getID() {
		return ID;
	}

	public void setID(char iD) {
		this.ID = iD;
	}

	public int getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(int prioridade) {
		this.prioridade = prioridade;
	}

	public void conectaCaverna(Caverna cave) {
		this.cave = cave;
	}
}
