import java.util.Scanner;

class Matrix {
    int Number_of_rows;
    int Number_of_columns;
    double[][] data;

    Matrix() {
    }

    public double[][] setMatrix() {
        System.out.println("请输入行数与列数：");
        Scanner data = new Scanner(System.in);
        Number_of_rows = data.nextInt();
        Number_of_columns = data.nextInt();
        double[][] Matrix = new double[Number_of_rows][Number_of_columns];
        data.nextLine();
        System.out.println("请输入矩阵元素:");
        for (int i = 0; i < Number_of_rows; i++) {
            for (int j = 0; j < Number_of_columns; j++) {
                Matrix[i][j] = data.nextDouble();
            }
        }
        return Matrix;
    }

    public double[][] Transpose(double[][] data) {
        double[][] c = new double[Number_of_columns][Number_of_rows];
        for (int i = 0; i < Number_of_rows; i++) {
            for (int j = 0; j < Number_of_columns; j++) {
                c[j][i] = data[i][j];
            }
        }
        return c;
    }
}

public class Main {
    public static void main(String[] args) {
        Matrix A = new Matrix();
        System.out.println("请输入矩阵A：");
        A.data = A.setMatrix();
        Matrix B = new Matrix();
        System.out.println("请输入矩阵B：");
        B.data = B.setMatrix();
        System.out.println("矩阵A的转置为：");
        getArray(A.Transpose(A.data), A.Number_of_columns, A.Number_of_rows);
        System.out.println("矩阵B的转置为：");
        getArray(B.Transpose(B.data), B.Number_of_columns, B.Number_of_rows);
        System.out.println("矩阵A,B相乘的结果为：");
        double[][] c = Multiplication(A.data, A.Number_of_rows, A.Number_of_columns, B.data, B.Number_of_rows, B.Number_of_columns);
        getArray(c, A.Number_of_rows, B.Number_of_columns);
    }

    public static void getArray(double[][] a, int x, int y) {
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static double[][] Multiplication(double[][] a, int x1, int y1, double[][] b, int x2, int y2) {
        double[][] c = new double[x1][y2];
        for (int i = 0; i < x1; i++) {
            for (int j = 0; j < y2; j++) {
                c[i][j] = Cumulative_Multiplication(a, i, b, j, y1);
            }
        }
        return c;
    }

    public static double Cumulative_Multiplication(double[][] a, int i, double[][] b, int j, int y) {
        double sum = 0;
        for (int k = 0; k < y; k++) {
            sum += a[i][k] * b[k][j];
        }
        return sum;
    }
}