package Session_4_Hw;

import java.util.Scanner;

public class B2_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập vào số phần tử (n) của mảng 1 chiều
        int number;
        float sum = 0;
        System.out.println("Nhập số phần tử (n) của mảng: ");
        number = Integer.parseInt(scanner.nextLine());
        //Khai báo mảng số thực 1 chiều gồm n phần tử
        float[] arrNumber = new float[number];
        //Nhập giá trị các phần tử của mảng
        System.out.println("Nhập giá trị các phần tử của mảng: ");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("arrNumber[%d]=", i);
            arrNumber[i] = Float.parseFloat(scanner.nextLine());
        }
        //In ra giá trị trung bình cộng của các phần tử trong mảng
        for (int i = 0; i < arrNumber.length; i++) {
            sum = sum + arrNumber[i];
        }
        float average = sum / arrNumber.length;
        System.out.printf("Trung bình cộng các phần tử trong mảng là: %.2f", average);
    }
}
