import java.util.Scanner;

public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i,j;
        int arr[][] = new int [2][3];
        System.out.println("enter elements");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Array contents:");
        for(i=0;i<2;i++){
            for(j=0;j<3;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}