
import java.util.ArrayList;

public class MyList {
    
    static ArrayList <String> nama = new ArrayList<String>();
    
    public static void main(String[] args) {
        nama.add("Budi");
        nama.add("Deni");
        
        System.out.println(nama.get(0));
        
        nama.add(0,"Reni");
        
        System.out.println(nama.get(0));
        
        nama.set(1,"Adi");
        nama.remove(0);
       
        System.out.println(nama);//output dalam bentuk arrayList
        
    }
}