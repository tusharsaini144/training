public class FunctionOverloading {
    // Function to add two integers
    public  int add(int a, int b) {
        return a + b;
    }


    public double add(double a, double b, double c) {
        return a + b + c;
    }

    // Function to concatenate two strings
    public  String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
       /* int result1 = add(2, 3);
        int result2 = add(2.0, 3.0, 4.0);
        String result3 = add("Hello, ", "world!");

        System.out.println("Result 1: " + result1);
        System.out.println("Result 2: " + result2);
        System.out.println("Result 3: " + result3);*/
        FunctionOverloading obj=new FunctionOverloading();
       System.out.println( obj.add(2,3));
        System.out.println(obj.add(2.0,3.9,8.9));
        System.out.println( obj.add("csk","dhoni"));

    }


}
