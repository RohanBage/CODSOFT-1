import java.util.*;
public class hello {



    public static void main(String[] args) {
        int max=100;
        int min=1;
        int  random_number=(int) (Math.random()*((max-min)+1));
        Scanner sc = new Scanner(System.in);
        boolean guess=false;





        while(!guess) {

            System.out.println("what is your guess number " );
            double userguess = sc.nextDouble();

            if(userguess<random_number) {
                System.out.print("the number you entered is very small"+" \n" );

            }

            else  if(random_number<userguess) {
                System.out.print("the number you enterd is so large"+"\n ");


            }
            else {
                guess=true;
                System.out.print("you hava a correct guess "+" \n");

            }

        }
        System.out.print("the generated number is"+random_number);
    }


}