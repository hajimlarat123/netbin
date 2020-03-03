package Rapot;

import java.util.Scanner;

public class Rapott {
    public static void main(String[] args) {
        Scanner p = new Scanner(System.in);
        int kamar []=new int [50]; 
        String nama[]=new String[50];
        long nik[]=new long[50];
        String alamat[]=new String[50];
        int predikat = 75;
        boolean running = true;
        while (running){
            System.out.println("==========SELAMAT DATANG DI HOTEL AA============");
            System.out.println("======");
        System.out.println("1.Isi Data");
        System.out.println("2.Keluar");
        System.out.print("MENU :[1/2/3/4]> ");
        int pilih = p.nextInt();
        switch (pilih) {
                case 1:
                    System.out.print("Masukkan Nama anda : ");
                    String name = p.nextLine();
                    name = p.nextLine();
                    System.out.print("Masukkan Mapel Anda : ");
                    String mapel = p.nextLine();
                    System.out.print("Masukkan Nilai Anda : ");
                    int nilai = p.nextInt();
                    if(nilai>=predikat){
                        System.out.println("LULUS");
                    }else{
                        System.out.println("TIDAK LULUS");
                    }
                     break;
                case 2:
                    System.out.println("Thanks");
                    running = false;
                    break;
    }
    
}
    }
}