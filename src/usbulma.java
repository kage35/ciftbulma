import java.util.Scanner;
public class usbulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sayi,us;
        int total=1;
        System.out.println("lütfen sayıyı giriniz");
        sayi=input.nextInt();
        System.out.println("lütfen sayının üs değerini giriniz");
        us=input.nextInt();
        for(int i =1;i<=us;i++)
        {
           total*=sayi;
        }
        System.out.println("girmiş olduğunuz sayının üs  değeri   : " + total);
    }
}
