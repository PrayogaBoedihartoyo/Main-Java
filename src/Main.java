package src;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
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
                case "2" -> TambahData();
                case "3" -> UbahData();
                case "4" -> HapusData();
                case "5" -> {
                    Keluar();
                    return;
                }
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

    private static void TampilkanData() throws IOException {
        FileReader fileInput;
        BufferedReader bufferInput;

        try {
            fileInput = new FileReader("../database.txt");
            bufferInput = new BufferedReader(fileInput);
        } catch (Exception e) {
            System.err.println("Database tidak ditemukan");
            System.err.println("Silahkan tambah data terlebih dahulu");
            return;
        }

        System.out.println("\n| No |\t Tahun |\t Penulis              |\t Penerbit             |\t Judul Buku");
        System.out.println("====================================================================================================");
        String data = bufferInput.readLine();
        int nomorData = 0;

        while (data != null) {
            StringTokenizer stringToken = new StringTokenizer(data, ",");
            if (stringToken.hasMoreTokens()) {
                nomorData++;
                stringToken.nextToken();
                System.out.printf("| %2d ", nomorData);
                System.out.printf("|\t %4s  ", stringToken.nextToken());
                System.out.printf("|\t %-20s  ", stringToken.nextToken());
                System.out.printf("|\t %-20s  ", stringToken.nextToken());
                System.out.printf("|\t %s  ", stringToken.nextToken());
                System.out.println("\n");
            }
            data = bufferInput.readLine();
        }
        System.out.println("====================================================================================================");
    }

    private static void TambahData() {
        System.out.println("Jaga Jarak");
    }

    private static void UbahData() {
        System.out.println("Jaga Jarak");
    }

    private static void HapusData() {
        System.out.println("Jaga Jarak");
    }

    private static void Keluar() {
        System.out.println("Jaga Jarak");
    }
}
