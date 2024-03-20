import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Cümle giriniz: ");
        String cumle = scanner.nextLine().trim(); 

        String[] ilkKelimeListesi = {"Ben", "Sen", "Hasan", "Nurşah", "Elif", "Abdulrezzak", "Şehribanu", "Zeynelabidin", "Naki"};
        String[] ikinciKelimeListesi = {"Bahçe", "Okul", "Park", "Sınıf", "Yarın", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar", "Merkez", "Ev", "Kitap", "Defter", "Güneş", "Beydağı"};
        String[] ucuncuKelimeListesi = {"Gitmek", "Gelmek", "Okumak", "Yazmak", "Yürümek", "Görmek"};

        boolean ilkKelimeKontrol = false;
        boolean ikinciKelimeKontrol = false;
        boolean ucuncuKelimeKontrol = false;

        
        String[] kelimeler = cumle.split("\\s+");

       
        if (kelimeler.length > 0) {
            String ilkKelime = kelimeler[0];
            for (String kelime : ilkKelimeListesi) {
                if (ilkKelime.equals(kelime)) {
                    ilkKelimeKontrol = true;
                    break;
                }
            }
        }

        
        if (kelimeler.length > 1) {
            String ikinciKelime = kelimeler[1];
            for (String kelime : ikinciKelimeListesi) {
                if (ikinciKelime.equals(kelime)) {
                    ikinciKelimeKontrol = true;
                    break;
                }
            }
        }

        
        if (kelimeler.length > 2) {
            String ucuncuKelime = kelimeler[2];
            for (String kelime : ucuncuKelimeListesi) {
                if (ucuncuKelime.equals(kelime)) {
                    ucuncuKelimeKontrol = true;
                    break;
                }
            }
        }

      
        if (ilkKelimeKontrol && ikinciKelimeKontrol && ucuncuKelimeKontrol && kelimeler.length==3) {
            System.out.println("EVET");
        } else {
            System.out.println("HAYIR");
        }
    }
}
