public class StackOverflowError {
    public static void main(String[] args) {
    loop(3718);
    }
    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai!");
        }else{
            System.out.println("Loop "+ value);
            loop(value-1);
        }
    }
}
