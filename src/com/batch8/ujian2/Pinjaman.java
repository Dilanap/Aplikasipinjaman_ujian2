package com.batch8.ujian2;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
public class Pinjaman {

	public String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

	 long Pinjam,Sisa;
	 double Angsuran, angsuranbunga, angsuranpokok;
	 int Kali,i;
	 double Bunga ;
	 
	
	 
	 public void setPinjam(long Pinjam) {
	 this.Pinjam = Pinjam;
	 }
	 
	 public void setBunga(double Bunga) {
	 this.Bunga = Bunga;
	 }
	 
	 public void setKali(int Kali) {
	 this.Kali = Kali;
	 }
	 
	 public void inSisa(){
	 
	 Sisa=Pinjam;
	 }
	 
	 public void setSisa(){
	 Sisa=Sisa-(Pinjam/Kali);
	 }
	 public void setAngsuran(){
	 
	 Angsuran=((Pinjam *Bunga)/(1-(1+(Bunga)-Kali))/-1);;
	 
	 }
	 
	 public void setAngsuranbunga(){
		 angsuranbunga=Bunga/360*30*Sisa;
		 }
		
	 public void setAngsuranpokok(){
		 angsuranpokok=Angsuran-angsuranbunga;
		 }
	 
	 public void PrintScr(){
	 
	 System.out.println("\n======================" +
	 "===========================");
	 System.out.println("| Angsuran ke- |  Total Angsuran  | Angsuran Pokok        |      Angsuran Bunga     |   Sisa    |");
	 System.out.println("==========================================================");
	 inSisa();
	 for(i=1;i<=Kali;i++){
	 
	 setAngsuran();
	 setSisa();
	 setAngsuranbunga();
	 setAngsuranpokok();
	 System.out.println("|      "+i+"       |   Rp. "+Angsuran+"         |    Rp. "+angsuranpokok+" |       | Rp. "+angsuranbunga+" |    Rp.  "+Sisa+" |");
	 System.out.println("===========================================================");
	 
	 }
	 }
	 
	}
	 
	

