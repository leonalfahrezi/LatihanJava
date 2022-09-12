public class Topic1 {
    public static void main(String[] args) {
        printWithoutParam();
        String Hello = "Hello";
        System.out.println(Hello + " " + addString("Binarian"));
    }

    private static void printWithoutParam() {
        System.out.println("Hello Guys!");
    }

    private static String addString(String anyWord) {
        return anyWord;
    }
}
