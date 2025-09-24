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

public class FileUploaderFinally {
    public static void main(String[] args) {
        String filePath = "data.txt";
        String serverHost = "localhost";
        int serverPort = 5000;

        Socket socket = null;
        FileInputStream fis = null;
        BufferedInputStream bis = null;
        OutputStream os = null;

        try {
            socket = new Socket(serverHost, serverPort);
            fis = new FileInputStream(filePath);
            bis = new BufferedInputStream(fis);
            os = socket.getOutputStream();

            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = bis.read(buffer)) != -1) {
                os.write(buffer, 0, bytesRead);
            }
            os.flush();

            System.out.println(" File berhasil diunggah ke server.");

        } catch (FileNotFoundException e) {
            System.err.println(" File tidak ditemukan.");
        } catch (UnknownHostException e) {
            System.err.println(" Server tidak dikenal.");
        } catch (IOException e) {
            System.err.println(" Kesalahan jaringan atau I/O: " + e.getMessage());
        } finally {
            try {
                if (os != null) os.close();
                if (bis != null) bis.close();
                if (fis != null) fis.close();
                if (socket != null) socket.close();
            } catch (IOException e) {
                System.err.println("️ Gagal menutup resource: " + e.getMessage());
            }
        }
    }
}
