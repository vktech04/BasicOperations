public class Arithmetic {
    public static void main(String[] args) {
        int x = 31, y= 10;
        int sum = x + y;
        int sub = x - y;
        int mult = x * y ;
        System.out.println("The Addition is : "+sum);
        System.out.println("The Subtraction is : "+sub);
        System.out.println("The Multiplication is : "+mult);
       if(y!=0){
        int div = x/y;
        System.out.println("The Division is : "+div);
       }
       else{
        System.out.println("Cannot divide a number by zero.");
       }
    }
}