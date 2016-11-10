package loesung;

public class RaumInhalte extends Flaechen implements IRaumInhalt{
	private double hoehe;
	public RaumInhalte(double[] params, double hoehe){
		super(params);
		this.hoehe=hoehe;
	}
	@Override
	public double getRaumInhalt() {
		return this.getFlaeche()*this.hoehe;
	}
}
