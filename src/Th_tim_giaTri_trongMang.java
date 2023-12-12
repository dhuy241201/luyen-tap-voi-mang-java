import java.util.Scanner;

public class Th_tim_giaTri_trongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String students[] = {"One","Two","Three","Four"};

        System.out.print("Nhập tên học sinh bạn muốn tìm: ");
        String name = scanner.nextLine();
        boolean isExist = false;
        int index = 0;

        for (int i=0; i<students.length; i++){
            if (name.equals(students[i])){
               isExist = true;
               index = i;
               break;
            }
        }
        if(isExist){
            System.out.println("Tên bạn nhập ở vị trí thứ: "+(index+1));
        }else{
            System.out.println("Tên bạn nhập không có");
        }
    }
}
