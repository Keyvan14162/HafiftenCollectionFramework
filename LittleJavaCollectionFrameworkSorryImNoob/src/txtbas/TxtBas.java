package txtbas;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TxtBas {
    
    private static PrintWriter exitSream = null;
    
    private static Scanner scanner = new Scanner(System.in);
    
    private static Date simdikiZaman = new Date();
    
    
    public static void listBas(List list) {
            
        System.out.println("Listeyi ekleyeceğiniz txt dosyasının ismini giriniz(.txt olmadan):");
        String file = scanner.next()+".txt";
        
        try{
            
            exitSream = new PrintWriter(new FileOutputStream(file,false));
              
        }
        catch(FileNotFoundException e) {
            System.out.println(file+".txt oluşturulurken hata oldu...");
            System.exit(0);
        }

        for(int i=0 ; i < list.size() ; i++) {
            
            exitSream.println(simdikiZaman+" "+list.get(i));
            //elemanları alt alta basıyor
        }
        
        exitSream.close();
        System.out.println(file+" dosyanız uygulamanın bulunduğu klasöre eklenmiştir");      
   
    }
    
    
    public static void setBas(Set set) {
            
        System.out.println("Listeyi ekleyeceğiniz txt dosyasının ismini giriniz(.txt olmadan):");
        String file = scanner.next()+".txt";
        
        try { 
            
            exitSream = new PrintWriter(new FileOutputStream(file,false));
              
        }
        catch(FileNotFoundException e) {
            System.out.println(file+".txt oluşturulurken hata oldu...");
            System.exit(0);
        }
                        
        exitSream.println(simdikiZaman+" "+set);
        //[elaman1,elaman2] tarzı basıyor
          
        exitSream.close();
        System.out.println(file+" dosyanız uygulamanın bulunduğu klasöre eklenmiştir");  
   
    }
    
  
    public static void mapBas(Map<Integer ,String> map) {
        
        System.out.println("Listeyi ekleyeceğiniz txt dosyasının ismini giriniz(.txt olmadan):");
        String file = scanner.next()+".txt";
        
        try{
            
            exitSream = new PrintWriter(new FileOutputStream(file,false));
              
        }
        catch(FileNotFoundException e) {
            System.out.println(file+".txt oluşturulurken hata oldu...");
            System.exit(0);
        }
         
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            
             exitSream.println(simdikiZaman+" Anahtar:"+entry.getKey()+" Değer:"+entry.getValue());
             //elemanları sırayla basar
             
        }
         
        exitSream.close();
        System.out.println(file+" dosyanız uygulamanın bulunduğu klasöre eklenmiştir");  
   
    }
     
}
