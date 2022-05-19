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
	
	public char getRepresentacao() {
		char representacao = '-';

		int max = 0;
		if (componentes.size() > 0) {
			for (int i = 0; i < componentes.size(); i++) {
				if (componentes.get(i).getPrioridade() > max){
					max = componentes.get(i).getPrioridade();
					representacao = componentes.get(i).getID();
				}
			}
		}
		else if (this.visitada == true) representacao = '*';
		
		return representacao;
	}

	public Boolean getVisitada() {
		return visitada;
	}
	public void setVisitada() {
		this.visitada = true;
	}
}
