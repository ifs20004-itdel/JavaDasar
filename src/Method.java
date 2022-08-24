public class Method {
    public static void main(String[] args) {
            sayHelloWorld();
            paramSayHelloWorld("Samuel", "Sibuea");
            System.out.println(sum(15,23));
    }
    static void sayHelloWorld(){
        System.out.println("Hello World");
        System.out.println("Hello Again MF");
    }

    static void paramSayHelloWorld(String firstName, String lastName){
        System.out.println(firstName + " "+ lastName);
    }

    static int sum(int num1, int num2){
        return num1+num2;
    }
}
