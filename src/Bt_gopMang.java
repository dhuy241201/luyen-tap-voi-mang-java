public class Bt_gopMang {
    public static void main(String[] args) {
        int[] evenArray = {1,3,5,7,9};
        int[] oddArray = {2,4,6,8,10};
        int[] syntheticArray = new int[evenArray.length + oddArray.length];

        for (int i=0,j=0; i<evenArray.length; i++,j++){
            syntheticArray[i] = evenArray[i];
        }
        for (int i=0,j=evenArray.length; i<oddArray.length; i++,j++){
            syntheticArray[j] = oddArray[i];
        }

        System.out.print("List value of synthetic array: ");
        for (int i=0; i < syntheticArray.length; i++){
            System.out.print("\t"+syntheticArray[i]);
        }
    }
}
