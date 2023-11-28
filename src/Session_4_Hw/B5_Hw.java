package Session_4_Hw;

import java.util.Scanner;

public class B5_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập số phần tử của mảng số thực 2 chiều
        int row, col;
        int sum = 0;
        System.out.println("Nhập vào số dòng:");
        row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột:");
        col = Integer.parseInt(scanner.nextLine());
        //Khai báo mảng 2 chiều số thực
        float[][] arrNumber = new float[row][col];
        //Nhập giá trị các phần tử mảng 2 chiều số thực
        System.out.println("Nhập vào giá trị các phần tử mảng:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("arrNumber[%d][%d]= ", i, j);
                arrNumber[i][j] = Float.parseFloat(scanner.nextLine());
            }
        }
        //In ra các phần tử có giá trị chẵn và tính tổng
        System.out.println("Các phần tử có giá trị chẵn:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arrNumber[i][j] % 2 == 0) {
                    sum += arrNumber[i][j];
                    System.out.printf("%.2f",arrNumber[i][j]);
                }
            }
        }
        System.out.printf("\nTổng các phần tử có giá trị chẵn: %d\n", sum);
    }
}
