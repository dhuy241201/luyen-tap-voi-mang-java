import java.util.Scanner;

public class Bt_xoa_phanTu_cuaMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {24,12,20,0,1,30,4,19,75};
        int index_del = 0;
        int temp;

        System.out.print("Enter your number: ");
        int findingNumber = scanner.nextInt();

        for (int i=0; i < array.length; i++){
            if (findingNumber == array[i]){
                index_del = i;
                System.out.println("Số bạn nhập ở vị trí thứ: "+(index_del+1));
                break;
            }
        }

        System.out.print("Dãy số ban đầu:");
        for (int i=0; i <array.length; i++){
            System.out.print(array[i]+"\t");
        }

        for (int i=index_del; i<array.length-1; i++){
            array[i] = array[i+1];
        }
        array[array.length-1]=0;
        System.out.print("\nDãy số làm mới:");
        for (int i=0; i <array.length; i++){
            System.out.print(array[i]+"\t");
        }
    }
}
