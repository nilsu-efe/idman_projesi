
package idman;

import java.util.Scanner;

/**
 *
 * @author Nilsu
 */
public class Idman {

    
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        
        System.out.println("idman programına hoşgeldiniz....");
        
        String idmanlar="geçerli hareketler \n" + "1)burpee \n" + "2)pushup\n" + "3)situp\n" + "4)squad\n";
        System.out.println(""+idmanlar);
                
        System.out.println("bir idman olusturun...");
        
        System.out.print("burpee sayısı:");
        int burpee= scanner.nextInt();
        System.out.print("pushup sayısı:");
        int pushup=scanner.nextInt();
        System.out.print("situp sayisi:");
        int situp=scanner.nextInt();
        System.out.print("squad sayisi:");
        int squad=scanner.nextInt();
        
        scanner.nextLine();
        
        NewClass newclass=new NewClass(burpee, pushup, situp, squad);
        
        System.out.println("idmanınız başlıyor....");
        
        while(newclass.idmanbittiMi()== false){
            
            System.out.println("hareket turu(burpee, pushup, situp, squad):");
            String tur=scanner.nextLine();
            System.out.println("bu hareketten kaç tane yapıcaksın? ");
            int sayi=scanner.nextInt();
            scanner.nextLine();
            
            newclass.hareketyap(tur, sayi);
        }
        
    }
    
}
