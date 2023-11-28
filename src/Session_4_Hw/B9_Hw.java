package Session_4_Hw;

import java.util.Scanner;

public class B9_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập số phần tu cua mảng
        System.out.println("Nhập số phần tử của mảng:");
        int number = Integer.parseInt(scanner.nextLine());
        //Khai báo mảng
        int[] arrNumber = new int[number];
        //Nhập giá trị các phần tu của mảng
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("arrNumber[%d]= ", i);
            arrNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        //Nhap chi so can xoa va thuc hien xoa phan tu
        for (int temp : arrNumber) {
            System.out.printf("%d\t", temp);
        }
        System.out.println("\nNhập chỉ số cần xóa:");
        int deleteIndex = Integer.parseInt(scanner.nextLine());
        int[] arrNew = new int[number - 1];
        for (int i = 0, j = 0; i < number; i++) {
            if (i != deleteIndex) {
                arrNew[j] = arrNumber[i];
                j++;
            }
        }
        System.out.println("Mảng sau khi xóa :");
        for (int temp : arrNew) {
            System.out.printf("%d\t", temp);
        }
    }
}
