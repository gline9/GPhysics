package gphysics.constants;

import gunits.measure.Measure;
import gunits.unit.basal.Distance;
import gunits.unit.basal.Time;

public class Constants {
	public static final Measure g = new Measure(9.801, Distance.METERS.per(Time.SECONDS.m(Time.SECONDS)));
}
