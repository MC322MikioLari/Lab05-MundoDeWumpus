package pt.c40task.l05wumpus;

// Uma Classe de Controle do Jogo. Essa classe deve controlar os movimentos e pontuacao do jogo.

public class Controle {
	private int score;
	private String playerName;
	private char status;
	private Heroi heroi;
		

	public Controle() {
		score = 0;
		status = 'P';		
	}
	
	
	public Heroi getHeroi() {
		return heroi;
	}
	
	public int getScore() {
		return score;
	}
	
	public char getStatus() {
		return status;
	}

	public String getPlayerName() {
		return playerName;
	}
	
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public void setHeroi(Heroi heroi) {
		this.heroi = heroi;
	}

	public void setStatus(char status) {
		this.status = status;
	}
	
	public void setScore(int score) {
		this.score = score;
	}

	
	public boolean comandoValido(char comando) {
		if (comando == 'w' || comando == 'a'|| comando == 's' || comando == 'd' ||
				comando == 'k' || comando == 'c' || comando == 'q') {
			return true;
		}
		else return false;
	}
	
	public void executa(char comando) {
		
	}

}
