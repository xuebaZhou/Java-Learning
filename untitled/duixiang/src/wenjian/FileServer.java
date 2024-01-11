package wenjian;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
使用这个文件上传和下载系统，你需要按照以下步骤操作：

在服务器端，创建一个名为server_files的文件夹，用于存储上传的文件。
运行FileServer类作为服务器端应用程序。
运行FileClient类作为客户端应用程序，它会上传名为sample.txt的文件到服务器端。
 */
public class FileServer {
    public static void main(String[] args) {
        int port = 8000;

        try {
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("服务器已启动，等待客户端连接...");

            while (true) {
                Socket clientSocket = serverSocket.accept();
                System.out.println("客户端已连接：" + clientSocket);

                Thread clientThread = new ClientHandler(clientSocket);
                clientThread.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class ClientHandler extends Thread {
        private Socket clientSocket;

        public ClientHandler(Socket clientSocket) {
            this.clientSocket = clientSocket;
        }

        @Override
        public void run() {
            try {
                DataInputStream dataInputStream = new DataInputStream(clientSocket.getInputStream());
                String fileName = dataInputStream.readUTF();

                FileOutputStream fileOutputStream = new FileOutputStream("server_files/" + fileName);
                byte[] buffer = new byte[4096];
                int bytesRead;

                while ((bytesRead = dataInputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, bytesRead);
                }

                System.out.println("文件上传成功：" + fileName);

                fileOutputStream.close();
                dataInputStream.close();
                clientSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
