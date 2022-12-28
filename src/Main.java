import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi, asal ;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Pozitif bir sayi giriniz : ");
        sayi = scanner.nextInt();

        asal = asalMi(sayi,sayi/2);

        if (asal == 1){
            System.out.println(sayi+" sayisi asaldir");
        }else {
            System.out.println(sayi+" sayisi asal değildir");
        }

    }
    private static int asalMi(int sayi, int i) {
        if (i == 1){
            return 1;
        }else {
            if (sayi % i == 0){
                return 0;
            }
            else return asalMi(sayi,i-1);
        }
    }
}