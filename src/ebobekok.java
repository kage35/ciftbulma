import java.util.Scanner;
public class ebobekok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int s1,s2,ebob=0,ekok=0,deger;
        int k=0,j=1;
        System.out.print("ilk sayıyı giriniz    :");
        s1=input.nextInt();
        System.out.print("ikinci sayıyı giriniz :");
        s2=input.nextInt();
        for(int i=1;i<=s1;i++)
        {
            if(s1%i==0 && s2%i==0)
            {
                ebob=i;
            }
        }
        while (k!=1)
        {   deger=s1*j;
            if(deger%s2==0)
            {
                ekok=deger;
                k=1;
            }

            j++;
        }
        System.out.println("ebob değeri  :"+ebob);
        System.out.println("ekok değeri  :"+ekok);
    }
}
