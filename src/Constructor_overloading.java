public class Constructor_overloading {
    int age;
    static String company="tcs";
    double salary;
    String name="";
    Constructor_overloading(int age,double salary,String name)
    {
        this.age=age;
        this.salary=salary;
        this.name=name;
        System.out.println(+age+"  "+salary+"  " +name+"  "  +company);
    }
    Constructor_overloading(int age,String name)
    {
        this.age=age;
        this.name=name;
        System.out.println(+age+"  " +name+"  "+company);
    }
    static void overload()
    {
        System.out.println("it can access directly");
    }
    public static void main(String[] args)
    {
        Constructor_overloading obj=new  Constructor_overloading(23,80000.25,"xyz");
        Constructor_overloading obj1=new Constructor_overloading(21,"abc");
        overload();
        //+Constructor_overloading.overload();
    }
}
