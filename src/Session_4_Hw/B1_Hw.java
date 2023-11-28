package Session_4_Hw;

import java.util.Scanner;

public class B1_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Khai báo mảng số nguyên gồm 5 phần tử.
        int[] arrNumber = new int[5];
        //Nhập giá trị các phần tử
        System.out.println("Nhập giá trị các phần tử mảng:");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("arrNumber[%d]=", i);
            arrNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        //In ra giá trị các phần tử mảng
        System.out.println("Giá trị các phần tử trong mảng là: ");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("%d\t", arrNumber[i]);
        }
    }
}
