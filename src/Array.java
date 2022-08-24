import java.util.Scanner;
public class Array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(elementArray());
    }

    public static String elementArray(){
        String [] arrayOfString;
        arrayOfString = new String[3];
        arrayOfString [0] = "Samuel";
        arrayOfString [1] = "Immanuel";
        arrayOfString [2] = "Sibuea";

        int element = sc.nextInt();

        return arrayOfString [element];
    }

    public static String changeArrayElement(){
        return null;
    }
}
