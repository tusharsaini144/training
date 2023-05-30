public class Constructor {
    int a,b;
    Constructor(int a,int b)
    {
        this.a=a;
        this.b=b;
        System.out.println(a+b);
    }
    void display()
    {
        System.out.println(+a+" "+b);
    }
    public static void main(String[] args) {
        Constructor obj = new Constructor(2, 4);
obj.display();
    }
}
