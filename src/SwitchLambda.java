public class SwitchLambda {
    public static void main(String[] args) {
        var nilai = "A";

        switch (nilai) {
            case "A" -> System.out.println("Sangat baik");
            case "B", "C" -> System.out.println("Baik");
            case "D" -> System.out.println("Cukup");
            case "E" -> System.out.println("Buruk");
        }

        // Keyword yield
        /*
        String ucapan =switch (nilai){
            case "A":
                yield "Sangat baik";
            case "B", "C":
                yield "Baik";
            case "D":
                yield "Cukup";
            case "E":
                yield "Buruk";
                }

         */

        }
    }

