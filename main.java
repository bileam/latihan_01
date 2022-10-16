import java.util.Scanner;

import org.w3c.dom.html.HTMLParagraphElement;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int belanjaan, harga, diskonan;
        String kartu;
        int pilih;
        String kartu_yes = "yes", kartu_no = "no";
        String enter="\n";
        do {
            System.out.println("1.lanjut\n0.exit");
            pilih = scan.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("apakan anda memiliki member(yes/no)? ");
                    kartu = scan.next();
                    System.out.print("berapakah belanjaan anda: ");
                    belanjaan = scan.nextInt();
                    if (kartu.equalsIgnoreCase(kartu_yes)) {
                        if (belanjaan > 500000) {
                            diskonan = 50000;
                            harga = belanjaan - diskonan;
                            System.out.println("total belanja anda adalah: " + harga);
                            System.out.print(enter);
                        } else if (belanjaan > 100000) {
                            diskonan = 15000;
                            harga = belanjaan - diskonan;
                            System.out.println("total belanja anda adalah: " + harga);
                            System.out.print(enter);
                        } else {
                            diskonan = 0;
                            harga = belanjaan - diskonan;
                            System.out.println("total belanja anda adalah: " + harga);
                            System.out.print(enter);
                        }
                    } else if (kartu.equalsIgnoreCase(kartu_no)) {
                        if (belanjaan > 100000) {
                            diskonan = 5000;
                            harga = belanjaan - diskonan;
                            System.out.println("total belanja anda adalah: " + harga);
                            System.out.print(enter);
                        } else {
                            diskonan = 0;
                            harga = belanjaan - diskonan;
                            System.out.println("total belanja anda adalah: " + harga);
                            System.out.print(enter);
                        }
                    } else {
                        System.out.println("tidak ada");
                        System.out.print(enter);
                    }
                    break;
                case 0:
                    break;
                default:
                    System.out.println("masukan yang benar");
                    System.out.print(enter);
            }
        } while (pilih != 0);
    }
}
