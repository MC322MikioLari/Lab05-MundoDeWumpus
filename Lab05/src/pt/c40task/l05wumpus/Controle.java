package pt.c40task.l05wumpus;

// Uma Classe de Controle do Jogo. Essa classe deve controlar os movimentos e pontuacao do jogo.

public class Controle {
	public int score;
	public String playerName;
	public String status;
	private Heroi heroi;
		
	public Controle() {
		score = 0;
		status = "P";		
	}
	
	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public void setHeroi(Heroi heroi) {
		this.heroi = heroi;
	}

	
	public int getScore() {
		return score;
	}

}
