import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Variabel dan tipe data
        int jumlahData;
        float total = 0;
        float rataRata;

        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        jumlahData = input.nextInt();

        // Array satu dimensi
        float[] data = new float[jumlahData];

        // Input data menggunakan while loop
        int i = 0;
        while (i < jumlahData) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextFloat();
            i++;
        }

        // Menghitung total menggunakan for loop
        for (int j = 0; j < jumlahData; j++) {
            total += data[j];
        }

        // Menghitung rata-rata
        rataRata = total / jumlahData;

        // Output
        System.out.println("Rata-rata: " + rataRata);
    }
}