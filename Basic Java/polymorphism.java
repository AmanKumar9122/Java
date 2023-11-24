// not the correct form but it shows polymorphism
class AeroPlane1
{
    public void takeOff()
    {
        System.out.println("AeroPlane is taking off");
    }
    public void fly()
    {
        System.out.println("AeroPlane is Flying");
    }
}
class CargoPlane1 extends AeroPlane1
{
    public void takeOff()
    {
        System.out.println("CargoPlane requires longer runway");
    }
   public void fly()
   {
    System.out.println("Cargoplane flies at lower height");
   }  
}
class PassengerPlane1 extends AeroPlane1
{
    public void takeOff()
    {
        System.out.println("PassengerPlane requires medium size runway");
    }
    public void fly()
    {
    System.out.println("PassengerPlane flies at medium height");
    }
}
public class polymorphism {
    public static void main(String[] args) {
        CargoPlane1 cp=new CargoPlane1();
        
        PassengerPlane1 pp=new PassengerPlane1();
       
        AeroPlane1 ref;

        ref=cp;

        ref.takeOff();
        ref.fly();

        System.out.println("------------------------------------------------");
        ref=pp;

        ref.takeOff();
        ref.fly();

       // pp=cp;
    }
}
