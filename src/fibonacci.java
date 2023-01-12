import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,total;
        int once2=0;
        int once1=1;
        System.out.print("lütfen bir sayı giriniz   :");
        sayi=input.nextInt();

        for (int i=0;i<sayi;i++)
        {
            if(i==0){System.out.print(once2+" ");}
            if(i==1){System.out.print(once1+" ");}
            else
            {
                total=once1+once2;
                System.out.print(total+" ");
                once2=once1;
                once1=total;

            }

        }
    }
}
