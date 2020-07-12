package ismailkeyvan;

import txtbas.TxtBas;
import java.util.List;
import java.util.Scanner;

public class ListIslemleri {
    
    private static Scanner scanner = new Scanner(System.in);
    //Niye final olsun ki ?

    public static void baslat(List list) {
        
        System.out.println("Lütfen işlem seçiniz:");
        
        while(true) {
            System.out.println("--------------------------------------");
            System.out.println("|1:Listeye ekleme yap                |");
            System.out.println("|2:Eleman ismi girerek elemanı sil   |");
            System.out.println("|3:Listeyi göster                    |");
            System.out.println("|4:Kullandığınız class'ı kontrol et  |");           
            System.out.println("|5:Listeyi txt dosyasına bastır      |");
            System.out.println("|6:Ana menü                          |");
            System.out.println("--------------------------------------");
            
            String secim = scanner.next();
                    
            switch(secim) {
                
                case"6":
                break;
                   
                case"1":ekle(list);
                break;
                
                case"2":sil(list);
                break;
                
                case"3":goster(list);
                break;
                 
                case"4":classKontrol(list);
                break;
                 
                case"5":TxtBas.listBas(list);
                break;
                             
                default:System.out.println("Hatalı giriş...");
                break;
                                          
            }
            
            if(secim.equals("6")) {
     
                  System.out.println("Ana menüye dönülüyor...");
                  break;
             
            }        
        }        
    } 
    
    
    private static void ekle(List list) {
        
        System.out.println("Ekleyeceğiniz string'i girin:");
        
        String text = scanner.nextLine();//dummy scanner,nextLine bu olmazsa okumuyor ıdk why
        text = scanner.nextLine();
        list.add(text);
       
        System.out.println("Listenize "+ text +" elementi eklenmiştir" );
        
    }
    
    
    public static void sil(List list) {
         
        System.out.println("Silmek istediğiniz string'i girin:");
        
        String text = scanner.nextLine();//dummy scanner,nextLine bu olmazsa okumuyor ıdk why
        text = scanner.nextLine();
         
        if(list.remove(text) == true)        
            System.out.println("Listeniden "+ text +" elementi silinmiştir" );
         
        else
            System.out.println("Bu element listenizde yoktur");
                     
    }
     
    
    public static void goster(List list) {
        
        System.out.println("Liste:"+list);
                          
    }
     
    
    public static void classKontrol(List list) {
        
        System.out.println("Şu anda List interface'ini implemet eden "+ list.getClass() +" classını kullanıyorsunuz.");

    }
    
}