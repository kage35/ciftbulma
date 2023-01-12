import java.util.Scanner;
public class minmax {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int adet,enKucuk=0,enBuyuk=0,sayi;
        System.out.print("Kaç sayı girilecek  :");
        adet=input.nextInt();
        for(int i =1;i<=adet;i++)
        {
            System.out.print(i+". Sayıyı giriniz  :");
            sayi=input.nextInt();
            if(i==1)
            {
                enBuyuk=sayi;
                enKucuk=sayi;
            }
            if(sayi>enBuyuk)
            {enBuyuk=sayi;}
            if (sayi<enKucuk)
            {
                enKucuk=sayi;
            }
        }
        System.out.print("En küçük sayı   :"+enKucuk+"\n");
        System.out.println("En büyük sayı  :"+ enBuyuk);
    }
}
