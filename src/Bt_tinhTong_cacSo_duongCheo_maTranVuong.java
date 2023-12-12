import java.util.Scanner;

public class Bt_tinhTong_cacSo_duongCheo_maTranVuong {
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
                {0,1,2,3,4,5,6,7,8,9,10},
                {0,1,2,3,4,5,6,7,8,9,10}
        };
        int sum = 0;
        for (int i=0; i < arrays.length; i++ ){
            sum += arrays[i][i];
        }
        System.out.printf("Tổng các số đường chéo là: %d", sum);
    }
}
