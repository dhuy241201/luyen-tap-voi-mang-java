import java.util.Scanner;

public class Th_daoNguoc_phanTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;
        int array[];
        do {
            System.out.print("Nhập số lượng phần tử: ");
            amount = scanner.nextInt();
            if (amount > 20){
                System.out.println("Nhập số nhỏ hơn 20");
            }
        }while (amount > 20);

        array = new int[amount];
        for(int i=0; i < amount; i++){
            System.out.print("Nhập phần tử thứ "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }
        for (int i=0; i < amount; i++){
            System.out.println("Phần tử thứ "+(i+1)+": "+array[i]);
        }

        //Đảo ngược và in ra mảng

        for (int i=0; i < amount/2; i++){
            int temp = array[i];
            array[i] = array[amount - 1 - i];
            array[amount - 1 - i] = temp;
        }
        System.out.println();
        System.out.println("Các phần tử mảng sau khi đảo:");
        for (int i=0; i < amount; i++){
            System.out.println("Phần tử thứ "+(i+1)+": "+array[i]);
        }

    }
}
