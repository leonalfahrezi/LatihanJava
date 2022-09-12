public class Topic2 {
    public static void main(String[] args) {
        printSomething("Balonku", 5);
        printSomething("Gebetanku", sum(1,10));
    }

    private static void printSomething(String anyString, int anyInteger) {
        System.out.println(anyString + " " + anyInteger);
    }

    private static int sum(int Angka1, int Angka2) {
        return Angka1 + Angka2;
    }
}
