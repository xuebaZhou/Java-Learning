package wenjian;

import java.io.*;
import java.net.Socket;

public class FileClient {
    public static void main(String[] args) {
        String serverAddress = "localhost";
        int port = 8000;
        String fileName = "sample.txt";

        try {
            Socket socket = new Socket(serverAddress, port);
            System.out.println("已连接到服务器...");

            OutputStream outputStream = socket.getOutputStream();
            DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
            dataOutputStream.writeUTF(fileName);

            FileInputStream fileInputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[4096];
            int bytesRead;

            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
            }

            System.out.println("文件上传成功：" + fileName);

            fileInputStream.close();
            dataOutputStream.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
