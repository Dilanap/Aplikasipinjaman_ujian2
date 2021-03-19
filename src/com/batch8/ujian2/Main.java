package com.batch8.ujian2;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Pinjaman p = new Pinjaman();
		 Scanner sn= new Scanner(System.in);
		 Pinjaman tgl = new Pinjaman();
		  System.out.println("Tanggal dan waktu sekarang : "+tgl.getTanggal());
	     
	     System.out.println();
	     System.out.println("       PROGRAM HITUNG ANGSURAN KPR");
	     System.out.println("--------------------------------------------");
		 System.out.print("Masukan Besar Pinjaman : ");
		 p.setPinjam(sn.nextLong());
		 System.out.print("Masukan Besar Bunga Per Bulan %    : ");
		 p.setBunga(sn.nextDouble());
		 System.out.print("Masukan Banyak Angsuran: ");
		 p.setKali(sn.nextInt());
		 
		 p.PrintScr();
		 
		 }
		 
	
	}

