import java.util.Scanner;

public class Bt_them_phanTu_vaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = {10,4,6,7,8,0,0,0,0,0};
        int index;
        int value;
        System.out.print("Enter your value: ");
        value = scanner.nextInt();
        System.out.print("Enter your index: ");
        index = scanner.nextInt();

        System.out.print("Array before add: \t");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+"\t");
        }

        System.out.print("\nArray after  add: \t");
        for (int i = array.length-1; i >= index; i--){
            array[i] = array[i-1];
        }
        array[index-1] = value;
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i]+"\t");
        }
    }
}
