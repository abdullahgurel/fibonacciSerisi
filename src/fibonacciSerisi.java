import java.util.Scanner;
public class fibonacciSerisi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int eSayisi,e1=0,e2=1,e3;
        System.out.print("Eleman Sayısı Giriniz: ");
        eSayisi =input.nextInt();

        System.out.print(e1+" "+e2);

        for (int i=2;i<=eSayisi;i++) {
            e3 = e1+e2;
            System.out.print(" "+e3);
            e1=e2;
            e2=e3;
        }

        }
    }

