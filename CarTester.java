public class CarTester{

  public static void main(String[] args){
 Car myCar = new Car("Toyota", "sUpRA", 15.0, 23.5);

 System.out.Println(myCar.toString());

 myCar.drive(35.4); //drives the car for 35.4 miles

 System.out.println("Drove 35.4 miles "+myCar);

 myCar.addFuel(1.0);

 System.out.println(myCar);
  }
}
