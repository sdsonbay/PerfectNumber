import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int total = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int n = number / 2;

        while(n > 0){
            if(number % n == 0){
                total += n;
            }
            n--;
        }

        if(total == number){
            System.out.println(number + " is a perfect number.");
        }else{
            System.out.println(number + " is not a perfect number.");
        }

    }
}
