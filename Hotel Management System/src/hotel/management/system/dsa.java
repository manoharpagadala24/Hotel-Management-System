import java.util.*;
public class Dsa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        System.out.println("enter the length you want");
        int [] arr = new int[len+1];
        System.out.print("enter the elemnts you want");
        for(int i=0;i<len;i++){
            arr[i]=sc.nextInt();

        }
        System.out.println("your elements before inserting ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i]+" ");
        }
        int p =sc.nextInt();
        int ele = sc.nextInt();
        for(int i=len+1;i>=(p-1);i--){
            arr[i+1] =arr[i];
        }
        arr[p] = arr[ele];
        System.out.println("your elements after inserting ");

        for(int i=0;i<=len+1;i++){
            System.out.print(arr[i]+" ")
        }



    }
}
