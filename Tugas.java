
import java.util.ArrayList;

public class Tugas {
    
    static ArrayList <String> kota = new ArrayList<>();

    public static void main(String[] args) {
        
        kota.add("Surabaya");kota.add("Bandung");kota.add("Medan");
        
        for (int i=0; i<kota.size()-1; i++){
            for (int j=0; j<kota.size()-i-1; j++){
                if (kota.get(j).charAt(0)>kota.get(j+1).charAt(0)){
                    String c = kota.get(j);
                    kota.set(j, kota.get(j+1));
                    kota.set(j+1, c);
                    infoArray();
                }    
            }
        }
    }
    
    static void infoArray(){
        for (int i=0; i<kota.size(); i++){
            System.out.print(kota.get(i)+"-");
        }
        System.out.println("");
    }
}
