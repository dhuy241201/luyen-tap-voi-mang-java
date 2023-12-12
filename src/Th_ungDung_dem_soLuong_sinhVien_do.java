import java.util.Scanner;

public class Th_ungDung_dem_soLuong_sinhVien_do {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int[] array;
        do {
            System.out.print("Nhập số lượng điểm: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Số lượng phải nhỏ hơn 30");
            }
        } while (size > 30);
        array = new int[size];

        for (int i=0; i < size; i++){
            System.out.printf("Nhập số điểm thứ %d :",(i+1));
            array[i] = scanner.nextInt();
        }

        int count = 0;
        for (int i=0; i < size; i++){
            if (array[i]>=5){
                count++;
            }
        }
        System.out.printf("Số lượng học sinh giỏi trong lớp là: %d",count);
    }
}
