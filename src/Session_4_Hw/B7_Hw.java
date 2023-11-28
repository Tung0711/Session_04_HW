package Session_4_Hw;

import java.util.Scanner;

public class B7_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập so phần tử của mảng
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
        //Nhap gia tri addValue va chỉ so chen phần tử vào mảng
        for (int temp : arrNumber) {
            System.out.printf("%d\t", temp);
        }
        System.out.println("\nNhập giá trị cần chèn: \n");
        int addValue = Integer.parseInt(scanner.nextLine());
        System.out.println("\nNhập chỉ số cần chèn: \n");
        int addIndex = Integer.parseInt(scanner.nextLine());
        int[] arrNew = new int[numbers + 1];
        for (int i = 0, j = 0; i < arrNew.length; i++) {
            if (i == addIndex) {
                arrNew[i] = addValue;
            } else {
                arrNew[i] = arrNumber[j];
                j++;
            }
        }
        System.out.println("Mảng sau khi chèn: \n");
        for (int temp : arrNew) {
            System.out.printf("%d\t", temp);
        }
    }
}
