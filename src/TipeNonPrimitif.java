public class TipeNonPrimitif {
    public static void main(String[] args) {
        Integer iniInteger = 100;
        Long iniLong = 1000L;

        Byte iniByte;
        iniByte = 100;

        System.out.println(iniInteger);
        System.out.println(iniLong);
        System.out.println(iniByte);

        int Integer2 = 1000;
        Integer iniObject = Integer2;

        short iniShort = iniObject.shortValue();
        long iniLong2 = iniObject.longValue();
        System.out.println("\n" + iniShort );
        System.out.println(iniLong2);
        System.out.println(iniObject);


    }
}
