public class OverloadMethod {
    public static void main(String[] args) {
        sayHello();
        sayHello("Samuel");
    }
    static void sayHello(){
        System.out.println("Hello");
    }
    static void sayHello(String name){
        System.out.println("Hello "+name);
    }
}
