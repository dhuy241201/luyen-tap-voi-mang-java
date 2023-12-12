public class Bt_timMax_mang_haiChieu {
    public static void main(String[] args) {
    double[][] twoDimensionalArrays = {
            {34,34,34,123,12,3,121.1,243,1,421,4,12},
            {635,6,45.342,45.1,6.8,54,645,6,45}
    };
    double max = twoDimensionalArrays[0][0];
    int indexX = 0;
    int indexY = 0;

    for (int i=0; i < twoDimensionalArrays.length; i++){
        for (int j=0; j<twoDimensionalArrays[i].length; j++){
            if (max < twoDimensionalArrays[i][j]){
                max = twoDimensionalArrays[i][j];
                indexX = j;
                indexY = i;
            }
        }
    }
    System.out.printf("Số lớn nhất nằm ở cột %d, hàng %d",indexX,indexY);
    System.out.printf("\nGiá trị lớn nhất của mảng là: %f",max);
}
}