taster: 
package Latihan_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choose = 0;
        int diskon = 0;
        String kartu_member;
        String ya = "yes";
        String tidak = "no";

        do {
            System.out.println("MENU: ");
            System.out.println("1.LANJUT");
            System.out.println("0.EXIT");
            System.out.print("Pilih pilihan: ");
            choose = scanner.nextInt();
            System.out.println("\033[H\033[2J");
            System.out.flush();
            switch (choose) {
                case 1:
                    System.out.print("apakah anda menggunakan kartu member(yes/no): ");
                    kartu_member = scanner.next();
                    System.out.print("masukan jumlah pembelian: ");
                    int pembelian = scanner.nextInt();
                    if (kartu_member.equalsIgnoreCase(ya)) {
                        if (pembelian > 500000) {
                            diskon = 50000;
                            /*mengecek nilai
                             int jumlah = pembelian - diskon;
                             System.out.println(jumlah);
                             */
                            Oop1 oop1 = new Oop1(pembelian, diskon);
                            oop1.penjumlahan();
                            oop1.replay();
                        } else if (pembelian > 100000) {
                            diskon = 15000;
                            Oop1 oop1 = new Oop1(pembelian, diskon);
                            oop1.penjumlahan();
                            oop1.replay();

                        } else {
                            diskon = 0;
                            Oop1 oop1 = new Oop1(pembelian, diskon);
                            oop1.penjumlahan();
                            oop1.replay();
                        }
                    } else if (kartu_member.equalsIgnoreCase(tidak)) {
                        if (pembelian > 100000) {
                            diskon = 5000;
                            Oop1 oop1 = new Oop1(pembelian, diskon);
                            oop1.penjumlahan();
                            oop1.replay();
                        } else {
                            diskon = 0;
                            Oop1 oop1 = new Oop1(pembelian, diskon);
                            oop1.penjumlahan();
                            oop1.replay();

                        }
                    } else {
                        System.out.println("masukan pilihan yang benar(yes/no)");
                    }
                    break;
                case 0:
                    System.out.println("Terimakasih ya");
                    break;
                default:
                    System.out.println("silakan masukan pilihan yang benar");
            }

        } while (choose != 0);
    }
}

oopnya:
package Latihan_2;

public class Oop1 {
    int total_harga,pembelian,diskon;
    Oop1(){

    }

    Oop1(int pembelian1,int diskon1){
       // this.total_harga=harga;
        pembelian=pembelian1;
        diskon=diskon1;
    }

    public int penjumlahan(){
        total_harga = pembelian-diskon; 
    return total_harga;
    }

    public void replay(){
        System.out.println("------------------------------");
        System.out.println("total harga = "+total_harga);
        System.out.println("-------------------------------");
        System.out.println("");
    }
}

