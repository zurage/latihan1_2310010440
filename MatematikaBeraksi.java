package hitung;

public class MatematikaBeraksi {
    public static void main(String[] args) {
        // membuat objek
        Matematika galuh = new Matematika(2, 3);

        System.out.println("Hasil penjumlahan: " + galuh.setPenjumlahan());
        System.out.println("Hasil pengurangan: " + galuh.setPengurangan());
        System.out.println("Hasil perkalian: " + galuh.setPerkalian());
        System.out.println("Hasil pembagian: " + galuh.setPembagian());
    }
}
