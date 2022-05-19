package pt.c40task.l05wumpus.Componentes;
import java.util.Random;

import pt.c40task.l05wumpus.Caverna;

public class Heroi extends Componente {
	private int i, j;
	boolean flecha, vivo, flechaEquipada, ouroCapturado;
	String nome;
	char status;
	
	public Heroi(int i, int j, Caverna caverna) {
		super('P', 3, i, j, caverna);
		this.flecha = true;
		this.flechaEquipada = false;
		this.vivo = true;
		this.ouroCapturado = false;
		this.status = 'P';
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public boolean isFlecha() {
		return flecha;
	}
	public void perdeuFlecha() {
		this.flecha = false;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void morreu() {
		this.vivo = false;
	}
	public void sacarFlecha() {
		this.flechaEquipada = true;
	}
	public void capturouOuro() {
		this.ouroCapturado = true;
	}
	public boolean matarWumpus() {
		if (this.flechaEquipada == true) {
			this.perdeuFlecha();
			
			Random rand = new Random();
			int prob = rand.nextInt(100);
			if(prob < 50)
				return true;
			else
				return false;
		}
		return false;
	}
	/*
	w -> Heroi movimenta para a sala acima;
	s ->  Heroi movimenta para a sala abaixo;
	d ->  Heroi movimenta para a sala a direita;
	a ->  Heroi movimenta para a sala a esquerda;
	k -> Heroi equipa a flecha;
	c -> Heroi captura o ouro;
	q -> O usuario sai do jogo.
	*/
	
	public void Movimento(String movimento) {
		for (int i = 0; i < movimento.length(); i++) {
			String acao = movimento.substring(i);
			switch (acao) {
    			case "w":{
    				this.setI(i-1);
    			}
    			case "s":{
    				this.setI(i+1);
    			}
    			case "d":{
    				this.setJ(j+1);
    			}
    			case "a":{
    				this.setJ(j-1);
    			}
    		}
		}
	}
	public char Movimento(char movimento) {
		switch (movimento) {
			case 'w':{
				this.setI(i-1);
			}
			case 's':{
				this.setI(i+1);
			}
			case 'd':{
				this.setJ(j+1);
			}
			case 'a':{
				this.setJ(j-1);
			}	
		}
		return status;
	}
}
