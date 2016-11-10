package loesung;

public class Flaechen implements IFlaeche {
	private double[] params;
	public Flaechen(double[] params){
		if(params.length<1 || params.length>3)
			throw new RuntimeException("moegliche Parameter: Kreis(radius), Rechteck(laenge, breite), Dreieck(a,b,c) Anzahl erhaltener Parameter: "+params.length);
		this.params=params;
	}
	@Override
	public double getFlaeche() {
		double ret=0.0;
		switch(this.params.length){
			// 1 Parameter: Kreis(radius)
		case 1: 
			ret=Math.PI*params[0]*params[0];
			break;
			// 2 Parameter: Rechteck(laenge, breite)
		case 2:
			ret=params[0]*params[1];
			break;
		case 3:
			// 3 Parameter: Dreieck(a,b,c)
			// Sind alle drei Seitenlängen eines Dreiecks bekannt, so lässt sich der Satz des Heron anwenden:
			double a=params[0]; 
			double b=params[1];
			double c=params[2];		
			double s=(a+b+c)/2;
			ret=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		}
		return ret;
	}

}
