/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaseksepsi;

/**
 *
 * @author user
 */
import java.io.*;

public class PerbaikanSederhana {
    public static void main(String[] args) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("data.txt"));
            String line = br.readLine();

            if (line == null) {
                System.out.println("File kosong!");
                return;
            }

            int angka = Integer.parseInt(line);

            if (angka == 0) {
                System.out.println("Tidak bisa membagi dengan nol.");
            } else {
                System.out.println("Hasil: " + (10 / angka));
            }

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan.");
        } catch (NumberFormatException e) {
            System.out.println("Isi file bukan angka valid.");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan saat membaca file.");
        } finally {
            try {
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Gagal menutup file.");
            }
        }
    }
}
