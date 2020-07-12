package ismailkeyvan;

import txtbas.TxtBas;
import java.util.Map;
import java.util.Scanner;
        
public class MapIslemleri <K,V> {
    
    private Scanner scanner = new Scanner(System.in);
    
    public void baslat(Map<Integer,String> map) {
             
        System.out.println("Lütfen işlem seçiniz:");
        
        while(true){
            System.out.println("--------------------------------------");
            System.out.println("|1:Map'e ekleme yap                  |");
            System.out.println("|2:Anahtarı girerek elemanı sil      |");
            System.out.println("|3:Map'i göster                      |");
            System.out.println("|4:Kullandığınız class'ı kontrol et  |");           
            System.out.println("|5:Map'i txt dosyasına bastır        |");
            System.out.println("|6:Ana menü                          |");
            System.out.println("--------------------------------------");
           
            String secim = scanner.next();
                    
            switch(secim){
                
                case"6":break;
                   
                case"1":ekle(map);
                break;
                
                case"2":sil((Map<K, V>) map); //İlla generic metod  kullancam diye zorladım
                break;
                
                case"3":goster((Map<K, V>) map);
                break;
                                
                case "4":classKontrol((Map<K, V>)map);
                break;
                 
                case "5":TxtBas.mapBas(map);
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
    
    
    private void ekle(Map<Integer ,String> map) {
        
        System.out.println("Integer tipinden anahtarı ve String tipinden eklenecek olan değeri giriniz:");
        System.out.print("Anahtar(Integer):");
        int key = scanner.nextInt();
       
        System.out.print("Değer(String):");
        String value = scanner.nextLine();//dummy scanner,nextLine bu olmazsa okumuyor ıdk why
        value = scanner.nextLine();
              
        map.put(key, value);
        System.out.println(key+" anahtarının gösterdiği yere "+ value +" değeri eklenmmiştir");
        
    }
    
    private void sil(Map<K, V> map) {
        
        System.out.println("Silinecek olan Integer anahtar değeri giriniz:");
        System.out.print("Anahtar(Integer):");
        int key = scanner.nextInt();
        
        V tempValue = map.get(key);
        //Olması gereken K yerine int yolladığımız için uyarı veriyo        
            
        if(map.get(key) == null)
            System.out.println("Anahtar,null bir değeri gösteriyor");
              
        else{
            
            map.remove(key);
            /*Uyarı vermesinin sebebi yollayacağımız K değeri ile burda aldığımız int key değerinin
            farklı tipte olma ihtimali.Burda bunu görmezden geleceğim,zaten K yı integer göndereceğim
            */ 
            System.out.println(key +" anahtarının gösterdiği yerdeki "+ tempValue +" değeri silinmiştir");
            
        }     
    }
    
    private void goster(Map<K, V> map) {
        
        for (Map.Entry<K, V> entry : map.entrySet()) {
            
            System.out.println("Anahtar:"+ entry.getKey() +" Değer:"+entry.getValue());
        }
        
    }
    
    private void classKontrol(Map<K ,V> map) {
        
        System.out.println("Şu anda Map interface'ini implemet eden "+ map.getClass() +" classını kullanıyorsunuz.");
        
    }
}

