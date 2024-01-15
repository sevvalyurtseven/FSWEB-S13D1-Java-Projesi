public class Main {
    // NOT: main methodun oldugu yerden proje baslar!
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // TODO call shouldWakeUp method!
        System.out.println("Havlayan Kopegimiz: " + shouldWakeUp(true, 1));
        System.out.println("Havlayan Kopegimiz: " + shouldWakeUp(false, 2));
        System.out.println("Havlayan Kopegimiz: " + shouldWakeUp(true, 8));
        System.out.println("Havlayan Kopegimiz: " + shouldWakeUp(true, -1));

        System.out.println("Yaş Tespiti: " + hasTeen(9, 99, 19));
        System.out.println("Yaş Tespiti: " + hasTeen(23, 15, 42));
        System.out.println("Yaş Tespiti: " + hasTeen(22, 23, 34));

        System.out.println("Yaş Tespiti: " + hasTeen2(9, 99, 19));
        System.out.println("Yaş Tespiti: " + hasTeen2(23, 15, 42));
        System.out.println("Yaş Tespiti: " + hasTeen2(22, 23, 34));
    }

    // NOT: Metodumuzu statik bir main metodunun icinde cagirabilmek icin statik yazmaliyiz.
    // Cunku statik bir metodu yalnizca statik bir metodda cagirabiliriz.

    // NOT: Metodumuz true ya da false bir deger döneceği için public static boolean seklinde
    // yazdik!
    public static boolean shouldWakeUp(boolean isDogBarking, int clock){

        if(clock < 0 || clock > 23 || !isDogBarking) return false;
        return clock < 8 || clock >= 20;
    }

    public static boolean hasTeen(int firstAge, int secondAge, int thirdAge){
        return (firstAge >= 13 && firstAge <=19) || (secondAge >= 13 && secondAge <=19) || (thirdAge >= 13 && thirdAge <=19);
    }

    //FARKLI BIR YOL:

    public static boolean hasTeen2(int... ages){
        if(ages.length != 3){
            return false;
        }
        for (int age: ages){
            if(age>=13 && age <=19){
                return true;
            }
        }
        return false;
    }
}