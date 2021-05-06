class MethodOverloading2 {

    // this method accepts int
    private static void display(int a){
        System.out.println("Got Integer data.");
    }

    // this method  accepts String object
    private static void display(String a){
        System.out.println("Got String object.");
    }

    // this method  accepts Character object
    private static void display(char a){
        System.out.println("Got Character object.");
    }

    
    public static void main(String[] args) {
        display(1);
        display("Hello");
        display('b');
        display(1000);
    }
}
