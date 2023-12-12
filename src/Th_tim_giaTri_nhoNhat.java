import java.util.Scanner;

public class Th_tim_giaTri_nhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount;
        int[] array;
        do {
            System.out.print("Enter amount: ");
            amount = scanner.nextInt();
            if (amount > 20){
                System.out.println("Amount must be less than 20");
            }
        }while (amount > 20);

        array = new int[amount];
        for(int i=0; i < amount; i++){
            System.out.print("Input value at "+(i+1)+": ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Giá trị nhỏ nhất của mảng là: " + minValue(array));
    }
    public static int minValue(int[] mainarray){
        int min = mainarray[0];
        for (int j : mainarray) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}
