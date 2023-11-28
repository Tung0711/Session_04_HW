package Session_4_Hw;

import java.util.Scanner;

public class B4_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập số phần tử của mảng 1 chiều số nguyên
        int number;
        System.out.println("Nhập số phần tử mảng:");
        number = Integer.parseInt(scanner.nextLine());
        //Khai báo mảng 1 chiều số nguyên
        int[] arrNumber = new int[number];
        //Nhập giá trị các phần tử của mảng
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("arrNumber[%d]= ", i);
            arrNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        //Tim giá trị lớn nhất và nhỏ nhất trong mảng
        int max = arrNumber[0];
        int min = arrNumber[0];
        for (int i = 0; i < arrNumber.length; i++) {
            //tim max
            if (arrNumber[i] > max) {
                max = arrNumber[i];
            }
            //Tim min
            if (arrNumber[i] < min) {
                min = arrNumber[i];
            }
        }
        System.out.println("Giá trị lớn nhất là: " + max);
        System.out.println("Giá trị nhỏ nhất là: " + min);
    }
}
