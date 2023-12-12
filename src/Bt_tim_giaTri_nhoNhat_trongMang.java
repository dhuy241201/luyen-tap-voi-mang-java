import java.util.Scanner;

public class Bt_tim_giaTri_nhoNhat_trongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array;

        System.out.print("Nhập số lượng phần tử trong mảng: ");
        int length = scanner.nextInt();
        array = new int[length];

        for (int i=0; i < length; i++){
            System.out.printf("Nhập giá trị phần tử thứ %d: ",(i+1));
            array[i] = scanner.nextInt();
        }

        int min = array[0];
        for (int i=0; i < length; i++){
            if(array[i] < min){
                min = array[i];
            }
        }
        System.out.printf("Giá trị nhỏ nhất trong mảng là: %d",min);
    }
}
