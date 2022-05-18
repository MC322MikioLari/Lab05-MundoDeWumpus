package pt.c40task.l05wumpus;

public class Sala {
	Heroi h;
	Wumpus w;
	Ouro o;
	Buraco B;
	Brisa brisa;
	Fedor f;
	Boolean visitada;
	public Sala() {
		this.h = null;
		this.w = null;
		this.o = null;
		this.B = null;
		this.brisa = null;
		this.f = null;
		this.visitada = false;
	}
	public Wumpus temWumpus() {
		return w;
	}

	public Ouro temOuroO() {
		return o;
	}

	public Buraco temBuraco() {
		return B;
	}

	public Boolean getVisitada() {
		return visitada;
	}
	public void setVisitada() {
		this.visitada = true;
	}
}
