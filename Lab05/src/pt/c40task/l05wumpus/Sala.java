package pt.c40task.l05wumpus;

import java.util.ArrayList;

import pt.c40task.l05wumpus.Componentes.*;


public class Sala {
	private ArrayList<Componente> componentes;
	private boolean visitada;
	
	
	public Sala() {
		this.componentes = new ArrayList<Componente>();
		this.visitada = false;
	}
	
	
	public void conectaComponente(Componente componente) {
		this.componentes.add(componente);
	}
	
	public Componente getComponente() {
		for (int i = 0; i < componentes.size(); i++) {
			if (componentes.get(i).getID() == 'B') return ;
		}
	}

	public Boolean getVisitada() {
		return visitada;
	}
	public void setVisitada() {
		this.visitada = true;
	}
}
