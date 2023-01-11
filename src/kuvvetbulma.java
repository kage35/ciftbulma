import java.util.Scanner;
public class kuvvetbulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s1=0;
        System.out.println("lütfen bir sayı giriniz");
        s1= input.nextInt();
        System.out.print("girmiş olduğunuz sayıya kadar olan 4ün kuvvetleri   :");
        for (int i=1;i<=s1;i++)
        {
            if (i%4==0){
                System.out.print(i+" ");
            }
        }
        System.out.println("\n------------------------------------------------------");
        System.out.print("girmiş olduğunuz sayıya kadar olan  5in kuvvetleri   :");
        for (int j=1;j<=s1;j++)
        {
            if (j%5==0){
                System.out.print(j+" ");
            }
        }
    }
}
