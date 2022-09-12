import java.util.Arrays;

public class Latihan2 {
    public static void main(String[] args) {
        String Hasil = " ";
        char[] buatArray = {'M', 'A', 'K', 'A', 'N', 'N', 'A', 'S', 'I'};
        Arrays.sort(buatArray);
        for (char urutan : buatArray) {
            Hasil = " " + urutan;
            System.out.println(Hasil);
        }
    }
}
