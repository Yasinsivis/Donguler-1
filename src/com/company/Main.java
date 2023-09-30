package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	  int number,TotalNumber=0,avarage,piece=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen Bir Sayı Giriniz:");
        number=input.nextInt();

      for(int i=0; i<=number; i++){
          if(i%3==0 && i%4==0){
            TotalNumber+=i;
            piece++;
          }
      }
      avarage=TotalNumber/piece;
      System.out.println("3 ve 4 ' e Bölünen Sayılarının Toplam Ortalaması : "+ avarage);
    }
}
