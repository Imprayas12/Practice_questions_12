import java.util.Scanner;


class NegativeMarks extends Exception {
    public NegativeMarks(String Message) {
            super(Message);
    }
}

public class StudentMarks{
    static void check(int a) throws NegativeMarks {
        if(a<0 || a>100) throw new NegativeMarks("Enter marks between 0 and 100 only");
    }
    public static void main(String[] args)  {
        Scanner s = new Scanner(System.in);
        int n = 2;
        String[] as = new String[n];
        int[] a = new int[3];
        System.out.println("Enter names of students :");
        for (int i = 0; i < n; i++) {
            as[i] = s.next();
        }
        System.out.println("Enter marks of students :");
        try {
            for (int i = 0; i < n; i++) {
                double av =0;
                for (int j = 0; j < 3; j++) {
                    a[j] = s.nextInt();
                    check(a[j]);
                    av+=a[j];
                }
                System.out.println("Average marks of "+ as[i] +" = "+ av/3);
            }
        } catch (NegativeMarks obj) {
            obj.printStackTrace();
        } catch (ArithmeticException obj){
            System.out.println("Enter Valid inputs please");
        }
        finally {
            System.out.println("Program executed successfully");
        }
    }
}
