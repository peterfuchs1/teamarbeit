package loesung;

import java.util.Arrays;
import java.util.LinkedList;

public class Zahlen implements IZahlen {
	private LinkedList<Double> liste;
	public Zahlen(){
		liste=new LinkedList<>();
	}
	@Override
	public void add(double value){
		liste.add(value);
	}
	@Override
	public double getSumme(){
		double ret=0.0;
		for (double d: liste)
			ret+=d;
		return ret;
	}
	@Override
	public double getMinimum() {
		if (liste.isEmpty())
			throw new RuntimeException("Es ist noch keine Zahl vorhanden!");
		Double[] d=liste.toArray(new Double[]{});
		Arrays.sort(d);
		return d[0];
	}
	@Override
	public double getMaximum() {
		if (liste.isEmpty())
			throw new RuntimeException("Es ist noch keine Zahl vorhanden!");
		Double[] d=liste.toArray(new Double[]{});
		Arrays.sort(d);
		return d[d.length-1];
	}
}
