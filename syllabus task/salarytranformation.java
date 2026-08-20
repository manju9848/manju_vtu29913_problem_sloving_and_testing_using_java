import java.util.*;
public class salarytranformation{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number of employees:");
        int n=sc.nextInt();
        int [] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arr[i]=arr[i]*110/100;
        }
        System.out.println("updated salaries");
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
        
        sc.close();

    }
}