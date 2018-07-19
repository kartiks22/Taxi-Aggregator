//package iiitb.ess201a7.r99999;

//import iiitb.ess201a7.a7base.*;

import java.util.ArrayList;

public class Fleet16128 extends Fleet {

	private static int fid = 6128;
	private ArrayList <Car16128> carList;
	public Fleet16128(String colour) {
		super(fid,colour);
		carList = new ArrayList <Car16128>();
	}
	@Override
	public void addCar(int speed) {
		carList.add(new Car16128(speed));
	}

	@Override
	public Car findNearestCar(Location loc) {
		double
		return null;
	}
}
