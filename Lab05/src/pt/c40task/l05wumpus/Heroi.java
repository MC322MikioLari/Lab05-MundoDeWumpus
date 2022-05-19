package pt.c40task.l05wumpus;
import java.util.Random;

public class Heroi extends Componentes {
	private int i, j, score;
	boolean flecha, vivo, flechaEquipada, ouroCapturado;
	String nome;
	Caverna caverna;
	
	public Heroi(int i, int j) {
		this.i = i;
		this.j = j;
		this.flecha = true;
		this.flechaEquipada = false;
		this.vivo = true;
		this.ouroCapturado = false;
		this.score = 0;
		this.nome = "";
	}
	
	
	public Caverna getCaverna() {
		return caverna;
	}
	public void setCaverna(Caverna caverna) {
		this.caverna = caverna;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
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
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
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
	w -> Herói movimenta para a sala acima;
	s ->  Herói movimenta para a sala abaixo;
	d ->  Herói movimenta para a sala a direita;
	a ->  Herói movimenta para a sala a esquerda;
	k -> Herói equipa a flecha;
	c -> Herói captura o ouro;
	q -> O usuário sai do jogo.*/
	
	public void Movimento(String movimento) {
		for (int i = 0; i < movimento.length(); i++) {
			String ação = movimento.substring(i);
			switch (ação) {
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
    			case "k":{
    				this.sacarFlecha();
    			}
    			case "c":{
    				this.capturouOuro();
    			}
    			case "q":{
    				
    			}
    		}
		}
	}
}
