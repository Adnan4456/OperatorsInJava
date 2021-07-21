
public class UnaryOperatorMore {

    public static void main(String[] args)
    {
        //unary minus
        int a = 1 , b = -a;

        //Note the value of actual operand a does not change
        System.out.println("a = " +a +" , b = " +b);

        a = -1;
        b = -a;
        System.out.println("a = " +a +" , b = " +b);


        a = 1;
        b = +a;
        System.out.println("a = " +a +" , b = " +b);

        a=-1;
        b= +a;
        System.out.println("a = " +a +" , b = " +b);

    }

}
