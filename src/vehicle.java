public class vehicle {
    public void speed() {

        System.out.println("120 km/h");
    }
}
class bike extends vehicle {
    @Override
    public void speed() {
        super.speed();
        System.out.println("100 km/h");
    }
}class car extends vehicle{
    public void speed(){
        System.out.println("90 km/h");
    }
}
class creating_object
{
public static void main(String [] args)
{
   // vehicle obj=new vehicle();
    bike ob1=new bike();
    car ob2=new car();

ob1.speed();
   ob2.speed();





}
}
