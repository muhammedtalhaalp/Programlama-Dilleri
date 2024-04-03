import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class BagliListeElemani {
    int veri;
    int adres;

    public BagliListeElemani(int veri, int adres) {
        this.veri = veri;
        this.adres = adres;
    }
}

public class Bagli_sirala {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dosya adını girin: ");
        String dosyaAdi = scanner.nextLine();

        try {
            File dosya = new File(dosyaAdi);
            Scanner dosyaOkuyucu = new Scanner(dosya);

            BagliListeElemani[] dizi = new BagliListeElemani[100]; 
            int index = 0;

            
            while (dosyaOkuyucu.hasNextLine()) {
                int sayi = Integer.parseInt(dosyaOkuyucu.nextLine());
                dizi[index] = new BagliListeElemani(sayi, index); 
                index++;
            }
            dosyaOkuyucu.close();

            
            System.out.println("İlk Hal:");
            for (int i = 0; i < index; i++) {
                System.out.println(dizi[i].veri + " " + dizi[i].adres);
            }

            
            for (int i = 0; i < index - 1; i++) {
                for (int j = 0; j < index - i - 1; j++) {
                    if (dizi[j].veri > dizi[j + 1].veri) {
                        // Swap
                        BagliListeElemani temp = dizi[j];
                        dizi[j] = dizi[j + 1];
                        dizi[j + 1] = temp;
                    }
                }
            }

            
            System.out.println("\nSıralandıktan Sonraki Hal:");
            for (int i = 0; i < index; i++) {
                System.out.println(dizi[i].veri + " " + dizi[i].adres); 
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadı.");
            e.printStackTrace();
        }

        scanner.close();
    }
}
