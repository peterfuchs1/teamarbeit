package loesung;

public class TestKlasse {

	public static void main(String[] args) {
		int i =4;
		RaumInhalte[] r=new RaumInhalte[i];
		r[--i]=new RaumInhalte(new double[]{3.0,4.0},3);
		r[--i]=new RaumInhalte(new double[]{3.0,4.0,5.0},3);
		r[--i]=new RaumInhalte(new double[]{3.0},3);
		r[--i]=new RaumInhalte(new double[]{4,2,3},3);
		for (int j=0;j< r.length;++j){
			System.out.println("Flaeche: "+r[j].getFlaeche());
			System.out.println("Rauminhalt: "+r[j].getRaumInhalt());
		}
		Zahlen z=new Zahlen();
		for(int j=0;j<100;++j){
			z.add(Math.random()*10);
			System.out.println("Summe aktuell: "+z.getSumme());
			System.out.println("Maximum aktuell: "+z.getMaximum());
			System.out.println("Minimum aktuell: "+z.getMinimum());
		}
	}

}
