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
import java.net.*;

public class FileSender {
    public static void main(String[] args) {
        try {
            // Membaca file (bisa memicu FileNotFoundException)
            FileInputStream fis = new FileInputStream("data.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));

            // Koneksi ke server (bisa memicu UnknownHostException, SocketException, IOException)
            Socket socket = new Socket("localhost", 5000);
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            String line;
            while ((line = br.readLine()) != null) {
                out.println(line);
            }

            System.out.println("File berhasil dikirim ke server.");
            
            // Tutup resource
            out.close();
            br.close();
            socket.close();

        } catch (FileNotFoundException e) {
            System.out.println("File tidak ditemukan: " + e.getMessage());
        } catch (UnknownHostException e) {
            System.out.println("Host server tidak dikenali: " + e.getMessage());
        } catch (SocketException e) {
            System.out.println("Kesalahan koneksi socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan I/O: " + e.getMessage());
        }
    }
}
