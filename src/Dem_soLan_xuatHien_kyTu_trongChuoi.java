import java.util.Scanner;

public class Dem_soLan_xuatHien_kyTu_trongChuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array;
        int count = 0;

        System.out.print("Nhập số lượng ký tự trong chuỗi: ");
        int size = scanner.nextInt();
        array = new String[size];

        for (int i=0; i<size; i++){
            System.out.printf("Nhập ký tự thứ %d: ",(i+1));
            array[i] = scanner.next();
        }

        System.out.print("Nhập ký tự muốn đếm: ");
        String findingString = scanner.next();

        for (int i=0; i<size; i++){
            if (array[i].equals(findingString)){
                count++;
            }
        }
        System.out.printf("Số lượng ký tự trong chuỗi: %d/%d",count,size);
    }
}
