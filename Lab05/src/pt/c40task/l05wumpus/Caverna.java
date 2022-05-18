package pt.c40task.l05wumpus;

public class Caverna {
	Sala cave[][];
	public Caverna() {
		cave = new Sala[4][4];
		for (int i = 0; i < cave.length; i++) {
	        for (int j = 0; j < cave[i].length; j++) {
	        	cave[i][j]= new Sala(); 
	        }
		}
	}
	
	public void ConectaComponente(int i, int j, Heroi h) {
		this.cave[i][j].h = h;
	}
	public void ConectaComponente(int i, int j, Wumpus w) {
		this.cave[i][j].w = w;
	}
	public void ConectaComponente(int i, int j, Ouro o) {
		this.cave[i][j].o = o;
	}
	public void ConectaComponente(int i, int j, Buraco B) {
		this.cave[i][j].B = B;
	}
	public void ConectaComponente(int i, int j, Brisa brisa) {
		this.cave[i][j].brisa = brisa;
	}
	public void ConectaComponente(int i, int j, Fedor f) {
		this.cave[i][j].f = f;
	}
	
	public void criaFedor(int i, int j) {
		ConectaComponente(i-1, j, new Fedor());
		ConectaComponente(i+1, j, new Fedor());
		ConectaComponente(i, j-1, new Fedor());
		ConectaComponente(i-1, j+1, new Fedor());
	}
	public void criaBrisa(int i, int j) {
		ConectaComponente(i-1, j, new Brisa());
		ConectaComponente(i+1, j, new Brisa());
		ConectaComponente(i, j-1, new Brisa());
		ConectaComponente(i-1, j+1, new Brisa());
	}
	
	/*
	w -> Herói movimenta para a sala acima;
	s ->  Herói movimenta para a sala abaixo;
	d ->  Herói movimenta para a sala a direita;
	a ->  Herói movimenta para a sala a esquerda;
	k -> Herói equipa a flecha;
	c -> Herói captura o ouro;
	q -> O usuário sai do jogo.*/
	
	public Boolean VerificaMovimento(int i, int j, char movimento) {
		if (i < 0|| i >= 4 || j < 0 || j >= 4 )
			return false;
		if (movimento != 'w' && movimento != 's' && movimento != 'd' && movimento != 'a' && movimento != 'k' && movimento != 'c' && movimento != 'q')
			return false;
		return true;
	}
	
	public void movimento(int i, int j) {
		cave[i][j].setVisitada();
	}
	
	public void retornaSaida() {
		String[][] saida;
		saida = new String[4][4];
		for (int i = 0; i < cave.length; i++) {
	        for (int j = 0; j < cave[i].length; j++) {
	        	if (cave[i][j].o != null)
	        		saida[i][j] = "O";
	        	else if (cave[i][j].w != null)
	        		saida[i][j] = "W";
	        	else if (cave[i][j].B != null)
	        		saida[i][j] = "B";
	        	else if (cave[i][j].h != null)
	        		saida[i][j] = "P";
	        	else if (cave[i][j].f != null)
	        		saida[i][j] = "f";
	        	else if (cave[i][j].brisa != null)
	        		saida[i][j] = "b";
	        	else {
	        		if (cave[i][j].visitada == true)
	        			saida[i][j] = "#";
	        		else
	        			saida[i][j] = "-";
	        	}
	        }
		}
	}
}
























