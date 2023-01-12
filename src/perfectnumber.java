import java.util.Scanner;

public class perfectnumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz : ");
        int number = input.nextInt();
        int total = 0;

        if (number<1){
            System.out.println("Geçersiz sayı");
        }

        for (int i=1; i<number; i++){
            if (number % i ==0){
                total += i;
            }
        }
        if (number == total){
            System.out.println(number +" Mükemmel sayıdır.");
        } else{
            System.out.println(number+ " Mükemmel sayı değildir.");
        }
    }
}