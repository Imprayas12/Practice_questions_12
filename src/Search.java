import java.util.InputMismatchException;
import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter number of elements in the array : ");
        int n = s.nextInt();
        System.out.println("Enter the elements in the array : ");
        int[] a = new int[n];
        try {
            for (int i = 0; i < n; i++) {
                a[i] = s.nextInt();
            }
        System.out.println("Enter the index of the element you wanna search : ");
        int sa = s.nextInt();
            System.out.println("Integer at index "+sa+" = "+a[sa]);
        }catch (ArrayIndexOutOfBoundsException obj){
            System.out.println("Enter valid index");
        }catch (InputMismatchException obj ){
            System.out.println("Enter only integer values");
        }finally {
            System.out.println("Program completed");
        }
    }
}
