import java.util.Scanner;
public class ciftbulma {
    public static void main(String[] args) {
        int s1;
        Scanner input = new Scanner(System.in);
        System.out.println("lütfen bir sayı giriniz");
        s1=input.nextInt();
        for (int i=1;i<=s1;i++)
        {
            if (i%4==0 && i%3==0)
            {

                System.out.print(i+" ");
            }

        }
        System.out.println("\nsayıları 3 ve 4 e tam bölünebilir");
    }
}