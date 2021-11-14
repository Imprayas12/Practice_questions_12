public class MathOperation {
    public static void main(String[] args) {
        int n = args.length;
        int[] a = new int[n];
        try{
            int s=0;
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(args[i]);
            s+=a[i];
        }
            System.out.println("Sum of all integers = "+ s);
            System.out.println("Average of all integers = " + (float)(s/n));
    }catch (ArithmeticException | NumberFormatException obj){
            System.out.println("Please enter a valid input");
        }finally {
            System.out.println("Program completed");
        }
    }
}
