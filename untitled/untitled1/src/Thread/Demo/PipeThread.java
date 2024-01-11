package Thread.Demo;

import java.io.*;

public class PipeThread {
    public static void main(String[] args) {
        PipeThread thisPipe = new PipeThread();

        thisPipe.process();
    }

    public void process() {
        PipedInputStream inStream;
        PipedOutputStream outStream;
        try {
            outStream = new PipedOutputStream();
            inStream = new PipedInputStream(outStream);
            new MyWriter1(outStream).start();
            new MyReader1(inStream).start();
        } catch (IOException e) {
        }
    }
}

class MyWriter1 extends Thread {
    private PipedOutputStream pos;
    private DataOutputStream dos;
    private int size = 7;
    private String messages[] = {"Monday", "Tuesday", "Wedensday", "Thursday", "Friday", "Saturday", "Sunday"};

    public MyWriter1(PipedOutputStream pos) {
        this.pos = pos;
    }

    public void run() {
        dos = new DataOutputStream(pos);
        try {
            dos.write(size);
            for (int i = 0; i < messages.length; i++) {
                dos.writeUTF(messages[i]);
                System.out.println("Writer:" + messages[i]);
                try {
                    sleep(300);
                } catch (InterruptedException e) {
                }
            }
            dos.close();
        } catch (IOException e) {
        }
    }
}

class MyReader1 extends Thread {
    private PipedInputStream pis;
    private DataInputStream dis;
    private String messages[];

    public MyReader1(PipedInputStream pis) {
        this.pis = pis;
    }

    public void run() {
        dis = new DataInputStream(pis);
        try {
            int size = dis.read();
            messages = new String[size];
            for (int i = 0; i < messages.length; i++) {
                messages[i] = dis.readUTF();
                System.out.println("Read:" + messages[i]);
                try {
                    sleep(400);
                } catch (InterruptedException e) {
                }
            }
        } catch (IOException e) {
        }
    }
}
