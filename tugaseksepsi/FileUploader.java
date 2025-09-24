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

public class FileUploader {
    public static void main(String[] args) {
        String filePath = "data.txt";     // File lokal
        String serverHost = "localhost";  // Alamat server
        int serverPort = 5000;            // Port server

        // Resource otomatis ditutup dengan try-with-resources
        try (
            Socket socket = new Socket(serverHost, serverPort);
            FileInputStream fis = new FileInputStream(filePath);
            BufferedInputStream bis = new BufferedInputStream(fis);
            OutputStream os = socket.getOutputStream()
        ) {
            byte[] buffer = new byte[4096];
            int bytesRead;

            // Membaca file dan mengirimkan ke server
            while ((bytesRead = bis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.flush();

            System.out.println(" File berhasil diunggah ke server.");

        } catch (FileNotFoundException e) {
            System.err.println(" File tidak ditemukan: " + e.getMessage());
        } catch (UnknownHostException e) {
            System.err.println(" Host server tidak dikenal: " + e.getMessage());
        } catch (IOException e) {
            System.err.println(" Terjadi kesalahan I/O: " + e.getMessage());
        }
    }
}
