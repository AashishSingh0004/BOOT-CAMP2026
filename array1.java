import java.util.Scanner;
public class array1 {
    public static void main(String[] args) {
        int i,j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row and coloumn");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        System.out.println("enter elements");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        int sum = 0;
        System.out.println("elements are");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum = " + sum);
        sc.close();
    }
}