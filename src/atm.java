import java.util.Scanner;
public class atm {
    public static void main(String[] args) {
        String userName, password;
        int hak=3;
        int balance=1500;
        int select;
        int price;
        Scanner input =new Scanner(System.in);
        while (hak>0)
        {
            System.out.println("Kullanıcı Adınız");
            userName=input.nextLine();
            System.out.println("Şifrenizi giriniz");
            password=input.nextLine();
            if (userName.equals("patika") && password.equals("java123")) {
                System.out.println("merhaba AtM ye hoşgeldiniz");

                do {
                    System.out.println("\nyapmak istediğiniz işlemi seçiniz");
                    System.out.println("----------------------------------");
                    System.out.println(
                            "1 -Para Yatırma\n" +
                                    "2-Para Çekme\n" +
                                    "3-Bakiye sorgula\n" +
                                    "4-Çıkış Yap");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı   :");
                             price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı   :");
                             price = input.nextInt();

                            if (price > balance) {
                                System.out.println("bakiye yetersiz");
                            }
                            else {
                            balance += price;}
                            break;
                        case 3:
                            System.out.println("şuan ki bakiyeniz  :" + balance);
                            break;
                    }
                }
                while (select != 4);
                System.out.println("görüşmek üzere");
                break;
            }
            else {
                System.out.println("kullanıcı adı yada şifre yanlış.Tekrar deneyiniz");
                hak--;

                System.out.println("Kalan Hakkınız  : "+ hak);
            }
        }

        }
    }

