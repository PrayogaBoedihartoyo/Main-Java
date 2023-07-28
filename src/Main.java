package src;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputUser = new Scanner(System.in);
        String pilihanUser;

        while (true) {
            clearScreen();
            System.out.println("Daftar Menu");
            System.out.println("===========");
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
                default -> System.err.println("Pilihan anda bukan 1-5");
            }
            getYesorNo();
        }
    }

    private static void getYesorNo() {
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n" + "Apakah anda ingin kembali ke menu?" + " (y/n)? ");

        String pilihanUser = terminalInput.next();

        while (!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n" + "Apakah anda ingin kembali ke menu?" + " (y/n)? ");
            pilihanUser = terminalInput.next();
        }
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else if (System.getProperty("os.name").contains("Linux")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else if (System.getProperty("os.name").contains("Mac")) {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            } else {
                System.out.println("Tidak Bisa Clear Screen");
            }
        } catch (Exception e) {
            System.out.println("Tidak Bisa Clear Screen");
        }
    }

    private static void TampilkanData() {
        System.out.println("Jaga Jarak");
    }
}
