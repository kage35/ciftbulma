import java.util.Scanner;
public class faktoriyel {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int fakto;
        int sonuc=1;
        System.out.println("lütfen bir sayı giriniz");
        fakto=input.nextInt();
        for(int i=1;i<=fakto;i++)
        {
            sonuc*=i;
        }
        System.out.println("girmiş olduğunuz sayının faktoriyeli   :"+ sonuc);

    }
}
