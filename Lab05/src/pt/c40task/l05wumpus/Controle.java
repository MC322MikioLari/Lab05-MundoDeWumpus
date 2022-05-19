package pt.c40task.l05wumpus;

import pt.c40task.l05wumpus.Componentes.Heroi;

// Uma Classe de Controle do Jogo. Essa classe deve controlar os movimentos e pontuacao do jogo.

public class Controle {
	private int score;
	private String playerName;
	private char status;
	private Heroi heroi;
	private String message;
		

	public Controle(Heroi heroi) {
		score = 0;
		status = 'P';		
		this.heroi = heroi;
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
	
	public String getMessage() {
		return message;
	}

	
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public void setStatus(char status) {
		this.status = status;
	}
	
	public void setScore(int score) {
		this.score = score;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}

	
	public boolean comandoValido(char comando) {
		if (comando == 'w' || comando == 'a'|| comando == 's' || comando == 'd' ||
				comando == 'k' || comando == 'c' || comando == 'q') {
			return true;
		}
		else return false;
	}
	
	
	public void executa(char comando) {
		if (comando == 'w' || comando == 'a'|| comando == 's' || comando == 'd') {
			status = heroi.Movimento(comando);
			score -= 15;			
		}
		else if (comando == 'k') {
			heroi.sacarFlecha();
			score -= 100;
		}
		else if (comando == 'c') {
			heroi.capturouOuro();
		}
		else if (comando == 'q') {
			message = "Volte sempre !";
		}
		
		if (status == 'W') score += 1000;
		if (status == 'L') score -= 1000;
		
	}

}
