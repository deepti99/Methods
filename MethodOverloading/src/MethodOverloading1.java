
//1. Overloading by changing the number of arguments


class MethodOverloading1 {
    private static void display(int a){
        System.out.println("First method of display is called with Arguments: " + a);
    }

    private static void display(int a, int b){
        System.out.println("Second method of display is called with Arguments: " + a + " and " + b);
    }
    
    private static void display(int a, int b, int c){
        System.out.println("Third method of display is called with Arguments: " + a + " and " + b + " and " + c);
    }

    public static void main(String[] args) {
        display(1, 2, 3);
        display(1, 4);
        display(1);
    }
}


