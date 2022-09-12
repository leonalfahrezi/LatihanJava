import java.util.Arrays;

public class Latihan {

    public static void main(String[] args) {

        //1 a
        for (int i = 2; i <= 32; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println(" \n");

        //1 b
        for (int i = 2; i <= 256 && i != 16 && i != 64 && i != 128; i *= 2) {
            System.out.print(i + " ");
        }

        System.out.println(" \n");

        //2
        String Hasil = " ";
        int[] angka3 = {6, 6, 5, 9, 2};
        Arrays.sort(angka3);
        for (int urutan : angka3) {
            Hasil = " " + urutan;
            System.out.println(Hasil);

            System.out.println(" \n");

            //3
            String Hasil1 = " ";
            char[] buatArray = {'M', 'A', 'K', 'A', 'N', 'N', 'A', 'S', 'I' };
            Arrays.sort(buatArray);
            for (char urutan1 : buatArray) {
                Hasil1 = " " + urutan1;
                System.out.println(Hasil1);
            }
        }
    }
}
