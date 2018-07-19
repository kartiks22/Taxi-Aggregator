//package iiitb.ess201a7.r99999;

//import iiitb.ess201a7.a7base.*;

public class Car16128 extends Car {

	private Location loc;
	private int status;
	private Trip t;
	private static int id = 6128;
	public Car16128(int speed) {
		super(id,speed);
		//maxSpeed =speed;
		status = Idle;
	}

	@Override
	public void setLocation(Location l) {
		// TODO Auto-generated method stub
		loc=l;
	}

	@Override
	public Location getLocation() {
		// TODO Auto-generated method stub
		//return null;
		return loc;
	}

	@Override
	public void setStatus(int s) {
		// TODO Auto-generated method stub
		status = s;
	}

	@Override
	public int getStatus() {
		// TODO Auto-generated method stub
		return status;
	}

	@Override
	public void assignTrip(Trip trip) {
		// TODO Auto-generated method stub
		return t;
	}

	@Override
	public Location getStart() {
		// TODO Auto-generated method stub
		if(status>(Idle)) return t.getStart();
		return null;
	}

	@Override
	public Trip getTrip() {
		return null;// TODO Auto-generated method stub
	}

	@Override
	public Location getDest() {
		// TODO Auto-generated method stub
		if(status>(Idle)) return t.getDest();
		return null;
	}

	@Override
	public void updateLocation(double deltaT) {
		// TODO Auto-generated method stub
		if(status==Booked) {
			double D = Math.sqrt(Math.pow((loc.getX()-t.getStart().getX()),2)+Math.pow((loc.getY()-t.getStart().getY()),2));
			double d=maxSpeed*deltaT;
			int X=(int)(((D*loc.getX())+((D-d)*t.getStart().getX()))/D);
			int Y=(int)(((D*loc.getY())+((D-d)*t.getStart().getY()))/D);
			loc.set(X,Y);
		}
		else if(status==OnTrip) {
			double D = Math.sqrt(Math.pow((loc.getX()-t.getDest().getX()),2)+Math.pow((loc.getY()-t.getDest().getY()),2));
			double d=maxSpeed*deltaT;
			int X=(int)(((D*loc.getX())+((D-d)*t.getDest().getX()))/D);
			int Y=(int)(((D*loc.getY())+((D-d)*t.getDest().getY()))/D);
			loc.set(X,Y);
		}
	}



}
