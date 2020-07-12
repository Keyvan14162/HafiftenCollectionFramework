package ismailkeyvan;

import txtbas.TxtBas;
import java.util.Scanner;
import java.util.Set;

public class SetIslemleri {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void baslat(Set set) { 
        
        System.out.println("Lütfen işlem seçiniz:");
        
        while(true) {
            
            System.out.println("--------------------------------------");
            System.out.println("|1:Set'e ekleme yap                  |");
            System.out.println("|2:Eleman ismi girerek elemanı sil   |");
            System.out.println("|3:Set'i göster                      |");
            System.out.println("|4:Kullandığınız class'ı kontrol et  |");           
            System.out.println("|5:Set'i txt dosyasına bastır        |");
            System.out.println("|6:Ana menü                          |");
            System.out.println("--------------------------------------");
            
            String secim = scanner.next();
                    
            switch(secim) {
                
                case"6":
                break;
                   
                case"1":ekle(set);
                break;
                
                case"2":sil(set);
                break;
                
                case"3":goster(set);
                break;
                 
                case"4":classKontrol(set);
                break;
                
                case"5":TxtBas.setBas(set);
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
    
       
    private static void ekle(Set set) {
        
        System.out.println("Ekleyeceğiniz string'i girin:");
        
        String text = scanner.nextLine();//dummy scanner,nextLine bu olmazsa okumuyor ıdk why
        text = scanner.nextLine();
        set.add(text);
        
        System.out.println("Setinize "+ text +" elementi eklenmiştir" );
        
    }
    
     public static void sil(Set set) {
         
        System.out.println("Silmek istediğiniz string'i girin:");
        
        String text = scanner.nextLine();//dummy scanner,nextLine bu olmazsa okumuyor ıdk why
        text = scanner.nextLine();
         
        if(set.remove(text) == true)        
            System.out.println("Setinizden "+ text +" elementi silinmiştir" );
         
        else
            System.out.println("Bu element setinizde yoktur");
                          
    }
     
     
    public static void goster(Set set) {
        
        System.out.println("Set:"+set);
                              
    }
    
     
    public static void classKontrol(Set set) {
        
        System.out.println("Şu anda Set interface'ini implemet eden "+ set.getClass() +" classını kullanıyorsunuz.");
        
    }
    
}