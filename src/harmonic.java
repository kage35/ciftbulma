import  java.util.Scanner;
public class harmonic {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int harmo=0;
        double sonuc=0;
        System.out.println("N sayısını giriniz");
        harmo=input.nextInt();
        for (int i=1;i<=harmo;i++)
        {
            sonuc+=1.0/i;

        }
        System.out.println(sonuc);
    }
}
