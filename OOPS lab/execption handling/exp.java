import java.util.Scanner;
class exp{
    public static void main(String args[]) throws ArithmeticException{
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Program to perform Division"); 
            System.out.print("Enter Number-1:");
            int a = sc.nextInt();
            System.out.print("Enter Number-2:");
            int b = sc.nextInt();
            if(b == 0){
                throw new ArithmeticException("Divide by zero is not possible");
            }else{
                int c = a/b;
                System.out.println("Result="+c);
            }
        }
        catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("End of Operation");
        }
        sc.close();
    }
}