
import java.util.ArrayList;

public class ListOfCity {
    
    static ArrayList <String> city = new ArrayList<>();
    
    public static void main(String[] args) {
        
        city.add("Sukabumi");
        city.add("Semarang");
        city.add("Malang");
        city.add("Magelang");
        city.add("Garut");
        city.add("Gresik");   
        
    String jumlahS = hitungAwalanKota('S');
    System.out.println("Jumlah Kota yang berawalan S : " + jumlahS);
    
    String jumlahG = hitungAwalanKota('G');
    System.out.println("Jumlah Kota yang berawalan G : " + jumlahG);
    
    String jumlahA = hitungAwalanKota('A');
    System.out.println("Jumlah Kota yang berawalan A : " + jumlahA);
    
}
    
    static String hitungAwalanKota(char huruf){
        int jumlah = 0;
        for(int i=0; i<city.size(); i++){
            char first = city.get(i).charAt(0);
            
            if (first==huruf){
                jumlah++;
            }
        }
        
        if (jumlah > 0){
            return String.valueOf(jumlah);
        }
        else{
            return "Tidak ada kota yang berawalan huruf : " + huruf;
        }
    }
}

//1. Mengambil karakter pada posisi 0 disimpan di variabel first
//2. Membandingkan apakah first = 'S'
//3. Jika benar maka dibuat increment