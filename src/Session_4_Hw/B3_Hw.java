package Session_4_Hw;

import java.util.Scanner;

public class B3_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập vào số dòng và số cột của mảng 2 chiều
        int row, col;
        System.out.println("Nhập vào số dòng: ");
        row = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập vào số cột: ");
        col = Integer.parseInt(scanner.nextLine());
        //Khai báo các phần tử mảng số nguyên 2 chiều
        int[][] numbers = new int[row][col];
        //Nhập giá trị các phần tử mảng 2 chiều
        System.out.println("Nhập giá trị các phần tử của mảng: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("numbers[%d][%d]= ", i, j);
                numbers[i][j] = Integer.parseInt(scanner.nextLine());
            }
        }
        //In giá trị các phần tử mảng theo ma trận
        System.out.println("Mảng theo ma trận:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.printf("%d\t", numbers[i][j]);
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }
}
