public class MethodVarArgm {
    public static void main(String[] args) {
        int [] values = {80, 50, 50, 58, 75};
        sayCongrats("Samuel", values);
        sayCongrats("Ichi", 80,90,100,80,75);

    }
    static void sayCongrats(String name, int... values){    // variabel argument (int ...)
        var total = 0;
        for(var value: values){
            total += value;
        }
        var finalValue = total/ values.length;
        if(finalValue >= 75)
            System.out.println("Selamat "+ name + ",anda lulus");
        else
            System.out.println("Maaf "+ name + ",anda gagal");
    }
}
