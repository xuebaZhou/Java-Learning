package saima;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class HorseRaceProgram extends JFrame {
    private JProgressBar progressBar1;
    private JProgressBar progressBar2;

    public HorseRaceProgram() {
        setTitle("赛马程序");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(2, 1));

        progressBar1 = new JProgressBar();
        progressBar1.setString("马1");
        progressBar1.setStringPainted(true);
        progressBar1.setMinimum(0);
        progressBar1.setMaximum(100);

        progressBar2 = new JProgressBar();
        progressBar2.setString("马2");
        progressBar2.setStringPainted(true);
        progressBar2.setMinimum(0);
        progressBar2.setMaximum(100);

        add(progressBar1);
        add(progressBar2);

        pack();
        setVisible(true);

        startRace();
    }

    private void startRace() {
        Horse horse1 = new Horse("马1");
        Horse horse2 = new Horse("马2");

        horse1.setPriority(Thread.MAX_PRIORITY);
        horse2.setPriority(Thread.MIN_PRIORITY);

        horse1.start();
        horse2.start();
    }

    private class Horse extends Thread {
        private String name;

        public Horse(String name) {
            this.name = name;
        }

        @Override
        public void run() {
            Random random = new Random();
            int progress = 0;

            while (progress < 100) {
                progress += random.nextInt(5);
                if (name.equals("马1")) {
                    progressBar1.setValue(progress);
                } else if (name.equals("马2")) {
                    progressBar2.setValue(progress);
                }

                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            if (name.equals("马1")) {
                JOptionPane.showMessageDialog(null, "马1赢得了比赛！");
            } else if (name.equals("马2")) {
                JOptionPane.showMessageDialog(null, "马2赢得了比赛！");
            }
        }
    }

    public static void main(String[] args) {
        new HorseRaceProgram();
    }
}
