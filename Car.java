public class Car{

private String make;
private String model;
private int fuelEfficency; //MPG
private double tankSize;  //In Gallons
private double amtFuel;  //In gallons


public Car(String carMake, String carModel, double carMPG, double tankSize){
  make = carMake;
  model = carModel;
  fuelEfficency = carMPG;
  tankSize = carTank;
  amtFuel = tankSize;
}

public void drive(double milesDriven){
 double fuelUsed = milesDriven/fuelEfficency;
 if (fuelUsed > amtFuel){
   double milesTraveled = amtFuel*fuelEfficency;
   System.out.println("you ran out of gas and only got "+milesTraveled+ "miles")
 } else {
 amtFuel -= fuelUsed;
}

public addFuel(double fuelAdded){
  if (fuelAdded > (tankSize-amtFuel)){
    System.out.println("You added too much fuel")
  }else {
    amtFuel += fuelAdded;
  }
}

public String toString(){
  String result = "";
  result += "Make:"+make+"\nModel: "+model+"\nMPG: "+fuelEfficency;
  result += "\nTank Size: "+tankSize+"\nCurrent Ammount of fuel: "+amtFuel;
  return result;
}

}
