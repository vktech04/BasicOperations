public class DivisionOpr {
    public static void main(String[] args) {
        int x = 15 , y = 0 ;
        try{
        int div= x / y ;
        System.out.println("The Divisin is : "+div);
        }
        catch(ArithmeticException e){
            System.out.println("Error!! : Division By Zero not allowed!");
        }
    }
}
