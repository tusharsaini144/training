class FunctionOverloading {
    // Function to add two integers
    public static int add(int a, int b) {
        return a + b;
    }


    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    // Function to concatenate two strings
    public static String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {

              System.out.println(add(2, 3));
                System.out.println(add(2.0, 3.0, 4.0));
                System.out.println(add("Mahi is a king"," of india"));


    }


}
