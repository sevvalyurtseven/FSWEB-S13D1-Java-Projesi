public class Main {
    // NOT: main methodun oldugu yerden proje baslar!
    public static void main(String[] args) {
        System.out.println("Hello World!");
        // TODO call shouldWakeUp method!
        System.out.println("Havlayan Kopegimiz: " + shouldWakeUp(true, 1));
        System.out.println("Havlayan Kopegimiz: " + shouldWakeUp(false, 2));
        System.out.println("Havlayan Kopegimiz: " + shouldWakeUp(true, 8));
        System.out.println("Havlayan Kopegimiz: " + shouldWakeUp(true, -1));
    }

    // NOT: Metodumuzu statik bir main metodunun icinde cagirabilmek icin statik yazmaliyiz.
    // Cunku statik bir metodu yalnizca statik bir metodda cagirabiliriz.

    // NOT: Metodumuz true ya da false bir deger döneceği için public static boolean seklinde
    // yazdik!
    public static boolean shouldWakeUp(boolean isDogBarking, int clock){

        if(clock < 0 || clock > 23 || !isDogBarking) return false;
        return clock < 8 || clock >= 20;
    }
}