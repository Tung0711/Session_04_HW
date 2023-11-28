package Session_4_Hw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class B6_Hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Nhập số phần tu của mảng (n)
        int number;
        System.out.println("Nhập số phần tử của mảng:");
        number = Integer.parseInt(scanner.nextLine());
        //Khai báo mảng
        int[] arrNumber = new int[number];
        //Nhập giá trị các phần tử của mảng
        System.out.println("Nhập giá trị các phần tử của mảng:");
        for (int i = 0; i < arrNumber.length; i++) {
            System.out.printf("arrNumber[%d]= ", i);
            arrNumber[i] = Integer.parseInt(scanner.nextLine());
        }
        //Nhập vào giá trị findNumber
        System.out.println("Nhập vào giá trị find:");
        int findNumber = Integer.parseInt(scanner.nextLine());
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < number; i++) {
            if (arrNumber[i] == findNumber) {
                list.add(i);
                sum += arrNumber[i];
            }
        }
        System.out.println("Chỉ số các phần tử có giá trị bằng " + findNumber + " là: " + list);
        System.out.println("Tổng các phần tử có giá trị bằng " + findNumber + " là: " + sum);
    }
}
