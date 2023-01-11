import java.util.Scanner;
public class cifttopla {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s1=0,toplam=0;
        int i=0;
        while (i==0)
        {
            System.out.println("lütfen bir sayı giriniz");
            s1=input.nextInt();
            if (s1%2==1)
            {i=1;break;}
            else
            {
                if(s1%4==0)
                {
                    toplam+=s1;
                }
                else {continue;}
            }

        }
        System.out.println("girilen sayılardan 4ün katı olanların toplamı   :"+toplam);

    }
}
