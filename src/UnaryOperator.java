
public class UnaryOperator {

    public static void main(String[] args)
    {
        System.out.println("---------Test 1----------");
        int a = 0 ;

        //if you donot assignment the operator is not participant
        //in a more complex expression the following statements are
        // same. the value in variable a gets increment by 1.

        a = 1;
        ++a;
        System.out.println("a after ++a = " + a);
         a=1;
         a++; // a = a+1;
        System.out.println("a after a++ = " + a);

        //What happened if we do this ?
        System.out.println("-------------Test 2-----------");
        a =1;
        System.out.println("a after ++a = " +  ++a);
         a = 1;
        System.out.println("a after a++ = " +  a++);
        System.out.println("And now the value of a is: " +a);

        System.out.println("-------------Test 3-----------");

        a =1;
        int a2 = a++;
        System.out.println("The value of a = " + a);
        System.out.println("The value of a2 = "+a2);

        //Let`s look at prefix in an expression ...
        a= 1 ;
        if (++a == 1)
        {
            System.out.println("If statment , now the value of a is " + a);

        }

        //postfix increment
        a=1 ;

        if (a++ == 1)
        {
            System.out.println("If statment potfix increment , now the value of a is " + a);
        }
        System.out.println("----------End 3-----------");

        //Reset values , all thing equal except type of increment
        System.out.println("-------------Test 4-------------");

         int b= 5;
         int i = 0;
         while (b -- >0){ //Use a postFix decrement

             i ++;
         }
         System.out.println("Postfix decrement operator used , i = " + i + " b = " + b);

         b= 5;
         i = 0 ;
         while (--b >0)
         { //Use a preFix decrement
             i++;
         }
        System.out.println("Prefix decrement operator used , i = " + i + " b = " + b);
    }
}
