package ismailkeyvan;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    
    public static Scanner scanner = new Scanner(System.in);
     
    public static String islemler = 
            "\n------------------------------------------------------------------------------------------"
            +"\n|1:Map interface'ini implement eden classlardan bir obje(HashMap,TreeMap,LinkedHashMap)  |"
            +"\n|2:List interface'ini implement eden classlardan bir obje(ArrayList,LinkedList)          |"
            +"\n|3:Set interface'ini implement eden classlardan bir obje(HashSet,TreeSet,LinkedHashSet)  |"
            +"\n|4:Çıkış                                                                                 |"
            +"\n------------------------------------------------------------------------------------------";
  
    
    public static void main(String[] args) {   
        
        System.out.println("Bu projede Map,List ve Set interfacelerini implement eden bazı classlardan objeler");
        System.out.println("oluşturup,onlar üzerinde çeşitli işlemler yapıp bir txt dosyasına bastırabilirsiniz.");
        System.out.println("Lütfen bir işlem seçiniz:");
        
        while (true) {
            System.out.println(islemler);
            System.out.print(":");
            String secim = scanner.next();
             
            switch(secim) {
                 
                case "4":break;  
                 
                case "1":System.out.println("Hangi Map class'ı kullanılsın(Keyler Integer,değerler String olcak)?");
                    System.out.println("1:HashMap\n2:LinkedHashMap\n3:TreeMap\n4:Ana menü");
                    System.out.print(":");
                    String mapSecim = scanner.next();
                 
                    if(mapSecim.equals("1")) {
                         
                        MapIslemleri<Integer,String> mappObject = new MapIslemleri<>();
                         
                        Map<Integer,String> hashMap = new HashMap<>();
                        mappObject.baslat(hashMap);
                         
                    }
                     
                    else if(mapSecim.equals("2")) {
                         
                        MapIslemleri<Integer,String> mappObject = new MapIslemleri<>();
                         
                        Map<Integer,String> linkedHashMap = new LinkedHashMap<>();
                        mappObject.baslat(linkedHashMap);
                        
                    }
                     
                    else if(mapSecim.equals("3")) {
                         
                        MapIslemleri<Integer,String> mappObject = new MapIslemleri<>();
                         
                        Map<Integer,String> treeMap = new TreeMap<>();
                        mappObject.baslat(treeMap);
                        
                    }
                     
                    else {
                         
                        System.out.println("Ana menüye dönülüyor...");
                        break;
                         
                    }
                    
                    break;
                                         
////////////////////////////////////////////////////////////////////////////////
                    
                case "2":System.out.println("Hangi List class'ı kullanılsın(String değerler depolanacak)?");
                    System.out.println("1:ArrayList\n2:LinkedList\n3:Ana menü");
                    System.out.print(":");
                    String listSecim = scanner.next();
                               
                    if(listSecim.equals("1")) { 
                         
                        List<String> arrayList = new ArrayList<>();  
                        ListIslemleri.baslat(arrayList);
                     
                     }
                     
                    else if(listSecim.equals("2")) {
                         
                        List<String> linkedList = new LinkedList<>();  
                        ListIslemleri.baslat(linkedList);
                       
                    }
                     
                    else {
                         
                        System.out.println("Ana menüye dönülüyor...");
                        break;
                         
                    }
                    
                    break;                
                    
////////////////////////////////////////////////////////////////////////////////    
                    
                case "3":System.out.println("Hangi Set class'ı kullanılsın(String değerler depolanacak)?");
                    System.out.println("1:HashSet\n2:LinkedHashSet\n3:TreeSet\n4:Ana menü");
                    System.out.print(":");
                    String setSecim = scanner.next();
                      
                    if(setSecim.equals("1")) {
                         
                        Set<String> hashSet = new HashSet<>();
                        SetIslemleri.baslat(hashSet);
                         
                    }
                     
                    else if(setSecim.equals("2")) {
                         
                        Set<String> linkedHashSet = new LinkedHashSet<>();
                        SetIslemleri.baslat(linkedHashSet);
                         
                    }
                     
                    else if(setSecim.equals("3")) {
                         
                        Set<String> treeSet = new TreeSet<>();
                        SetIslemleri.baslat(treeSet);
                        
                    }
                     
                    else {
                         
                        System.out.println("Ana menüye dönülüyor...");
                        break;
                         
                    }
                    break;
                     
////////////////////////////////////////////////////////////////////////////////
                     
                    default:System.out.println("Hatalı giriş...");
                    break;
                      
                }//SWITCH
                   
            if(secim.equals("4")) {
              
                System.out.println("Çıkış yapılıyor..."); 
                break;
             
            }
             
        }//WHILE    
    }    
}