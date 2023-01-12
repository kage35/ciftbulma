import java.util.Scanner;

public class yildizucgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int yildiz;
        int satir=1;
        System.out.println("lütfen bir sayı giriniz");
        yildiz= input.nextInt();
        for (int i =1;i<=yildiz;i++)
        {
            for (int j=yildiz-i;j>=1;j--)
            {
                System.out.print(" ");
            }
            for (int k =1;k<=satir;k++)
            {
                System.out.print("*");
            }
            satir+=2;
            System.out.println("");
        }
    }
}