package com.tutorial;

/**
 * Rangga Meinandi
 * A2.1900141
 * TI-1A
 */

public class Main {
    public static void main (String[] args){


//        do {
//            aksi
//        } while (kondisi);


        System.out.println("ini adalah awal program");

        int a = 0;
        boolean kondisi = true;


        do {
            a++;
            System.out.println("do while ke-" + a);

            if (a == 1) {
                kondisi = false;
            }

        }while(kondisi);

        System.out.println("ini adalah akhir program");
    }
}
