//
//final method can be inherit
public class Final_method {
    final void run()
    {
        System.out.println("running...");
    }
}
class Honda2 extends Final_method {
    public static void main(String args[]){
        new Final_method ().run();
    }
}


