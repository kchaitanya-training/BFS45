package PairProgramming;

public class WrapperClasses {

    public static void main(String[] args) {

        int primInt = 1;
        double primDou = 2.22;
        byte primByt = -126;

        Integer wrappedInt = primInt;
        System.out.println(wrappedInt);

        Double wrappedDou = Double.valueOf(primDou);
        System.out.println(wrappedDou);

        Float wrappedFlo = Float.valueOf(primInt);
        System.out.println(wrappedFlo);

        Byte wrappedByte = Byte.valueOf(primByt);
        System.out.println(wrappedByte);

    }


}
