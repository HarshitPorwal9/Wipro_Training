abstract class Vehicle
{
String model;
int year;
Vehicle(String model,int year)
{
this.model=model;
this.year=year;
}
abstract void start();
void displayInfo()
{
System.out.println("Model: "+model + ",Year: " + year);
}
}
class Car extends Vehicle implements FuelEfficient
{
Car(String model,int year)
{
super(model,year);

}
// @Override
void start()
{
System.out.println(model+"car is starting.");
}
// @Override
public void fuelEfficiency()
{
System.out.println(model+"car has good fuel efficiency.");
}
}
class Bike extends Vehicle 
{
Bike(String model,int year )
{
super(model,year);
}
// @Override
void start()
{
System.out.println(model+"bike is starting.");
}
}
interface FuelEfficient 
{
void fuelEfficiency();
}
public class Main
{
public static void main(String args[])
{
Vehicle car =new Car("Tesla",2020);
Vehicle bike=new Bike("Yamaha",2018);
car.displayInfo();
car.start();
if(car instanceof FuelEfficient)
{
((FuelEfficient)car).fuelEfficiency();
}
bike.displayInfo();
bike.start();
}
}