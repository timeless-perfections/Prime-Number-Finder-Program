import java.util.Scanner;

public class primeNumberFinderProgram {

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter Your Number : ");
        int number = inp.nextInt();
        prime(number,2);
    }
        static void prime(int number, int i){
        if (i == number){
            System.out.println(number + " Is A Prime Number.");
            return;
        }else if (number % i == 0){
            System.out.println(number + " Is A Not Prime Number.  ");
            return ;
        }
        prime(number,i + 1);

        }


}
