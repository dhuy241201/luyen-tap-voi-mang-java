import java.util.Scanner;

public class Th_tim_giaTri_lonNhat {
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

        System.out.print("Các phần tử của mảng là: ");
        for (int i=0; i < array.length; i++){
            System.out.printf("%-5d",array[i]);
        }

        int max = array[0];
        for(int i=0; i < amount; i++){
            if(array[i] > max){
                max = array[i];
            }
        }
        System.out.println();
        System.out.println("Giá trị lớn nhất trong mảng là: "+max);
    }
}
