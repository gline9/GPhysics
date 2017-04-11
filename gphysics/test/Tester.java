package gphysics.test;

import gphysics.constants.Constants;
import gunits.measure.Measure;
import gunits.unit.basal.Distance;
import gunits.unit.basal.Mass;
import gunits.unit.derived.Energy;

public class Tester {
	public static void main(String[] args){
		Measure distance = new Measure(46.5, Distance.METERS);
		
		//Measure energy = new Measure(29, Energy.KILOCALORIES);
		
		Measure mass = new Measure(150, Mass.POUNDS);
		
		Measure energy = distance.multiply(mass).multiply(Constants.g);
		
		System.out.println(energy.convertTo(Energy.KILOCALORIES));
	}
}
