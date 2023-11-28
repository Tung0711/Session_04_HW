package Session_4_Hw;

import java.util.Scanner;

public class B8_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập số phần tử của mảng
        System.out.println("Nhập số phần tử của mảng:");
        int numbers = Integer.parseInt(scanner.nextLine());
        //Khai báo mảng
        int[] arrNumber = new int[numbers];
        //Nhập giá trị các phần tử của mảng
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("arrNumber[%d]= ", i);
            arrNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        //Nhập giá trị và chỉ so phần tử cần cập nhật
        for (int temp : arrNumber) {
            System.out.printf("%d\t", temp);
        }
        System.out.println("\nNhập giá trị cần cập nhật: ");
        int updateValue = Integer.parseInt(scanner.nextLine());
        System.out.println("\nNhập chỉ số cần cập nhật: ");
        int updateIndex = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < arrNumber.length; i++) {
            if (i == updateIndex) {
                arrNumber[i] = updateValue;
            }
        }
        System.out.printf("Mảng sau khi update: \n");
        for (int temp : arrNumber) {
            System.out.printf("%d\t", temp);
        }
    }
}
