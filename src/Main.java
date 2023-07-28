package src;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner inputUser = new Scanner(System.in);
        String pilihanUser;

        while (true) {
            System.out.println("Daftar Menu");
            System.out.println("1. Tampilkan Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Ubah Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");

            System.out.print("Pilih Menu: ");
            pilihanUser = inputUser.next();

            switch (pilihanUser) {
                case "1" -> TampilkanData();
                case "2" -> System.out.println("Tambah Data");
                case "3" -> System.out.println("Ubah Data");
                case "4" -> System.out.println("Hapus Data");
                case "5" -> System.exit(0);
                default -> System.out.println("Menu Tidak Tersedia");
            }

            System.out.println("Apakah Anda Ingin Melanjutkan? (y/n) :");
            pilihanUser = inputUser.next();
            if (pilihanUser.equalsIgnoreCase("n")) {
                break;
            } else if (pilihanUser.equalsIgnoreCase("y")) {
                continue;
            } else {
                System.out.println("Pilihan Tidak Tersedia");
                break;
            }
        }
    }

    private static void TampilkanData() throws IOException {
        System.out.println("Jaga Jarak");
    }
}
