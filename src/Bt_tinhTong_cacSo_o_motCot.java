import java.util.Scanner;

public class Bt_tinhTong_cacSo_o_motCot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arrays = {
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10}

        };
        System.out.print("Nhập số cột bạn muốn tính tổng: ");
        int col = scanner.nextInt();
        int sum = 0;

        for (int i=0; i < arrays.length; i++){
            sum += arrays[i][col];
        }
        System.out.printf("Tổng giá trị của cột là: %d",sum);
    }
}
