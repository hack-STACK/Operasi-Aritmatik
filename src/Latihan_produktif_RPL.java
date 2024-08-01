public class Latihan_produktif_RPL {

    public static void main(String[] args) {
        // Variabel-variabel yang bakal dipake
        int jaehyun; // Ini variabel integer, namanya jaehyun
        double jaehyun2 = 8; // Ini variabel desimal, udah di-set ke 8
        String jeno; // Ini variabel buat nyimpan teks
        
        // Isi variabel dengan info diri
        jeno = "Dhamay Lahutagistha Pramu Putri"; // Nama panjang siap ditampilkan
        
        // Nampilin info pribadi ke layar
        System.out.println("Nama saya " + jeno);
        System.out.println("Saya Berasal dari Kabupaten Malang");
        System.out.println("Saya sekolah di SMK Moklet");
        System.out.println("\n");
        System.out.println("1. Sistem Aritmatika :");
        // Main aritmatika
        jaehyun = 10; // Mulai dengan 10
        jaehyun = jaehyun + 12; // Tambahin 12 ke 10
        System.out.println("Hasil dari penjumlahan : " + jaehyun); // Hasil penjumlahan

        jaehyun = jaehyun - 50; // Kurangin 50 dari hasil sebelumnya
        System.out.println("Hasil dari pengurangan : " + jaehyun); // Hasil pengurangan
        
        jaehyun = jaehyun * 12; // Kalikan hasil sebelumnya dengan 12
        System.out.println("Hasil dari perkalian ; " + jaehyun); // Hasil perkalian
        
        jaehyun = 5; // Reset nilai ke 5
        jaehyun = jaehyun % 12; // Modulus, sisa bagi 5 / 12
        System.out.println("Hasil dari modulus : " + jaehyun); // Hasil modulus
        
        jaehyun2 = jaehyun2 / 12; // Bagi 8 dengan 12
        System.out.println("Hasil dari pembagian : " + jaehyun2); // Hasil pembagian
        System.out.println("\n");
        System.out.println("2. Nilai amay :P :");
        
        // Cek kondisi nilai
        boolean hasil;
        int nilai = 75; // Nilai awal 75
        if (nilai < 75) {
            System.out.println("Anda Tidak lulus"); // Kalau nilai kurang dari 75
        } else {
            System.out.println("Anda Lulus yippe"); // Kalau nilai 75 atau lebih
        }

       
        nilai += 2; // Tambah 2 ke nilai
        System.out.println("Nilai+=2 (ya ini aja sama dengan 75 + 2): " + nilai); // Tampil nilai setelah nambah 2
        
        nilai++; // Tambah 1 ke nilai
        System.out.println("Nilai++ (ya ini sama aja dengan 77 + 1 wak): " + nilai); // Tampil nilai setelah nambah 1
        
        nilai *= 2; // Kali nilai dengan 2
        System.out.println("Nilai *= (ya ini sama aja dengan 78 X 2 wak): " + nilai); // Tampil nilai setelah dikali 2
        
        nilai %= 32; // Modulus nilai / 32
        System.out.println("Nilai %= (ya ini agak tricky sih, jadi 156 bagi 32 terus sisa dari bagi itu adalah modulus hehe) : " + nilai); // Tampil hasil modulus
        System.out.println("\n");
        System.out.println("3. Perbandingan antara Nilai A dan B : ");
        // Bandingkan nilai a dan b
        System.out.println("");
        System.out.println("Nah sekarang kita ada di sistem perbandingan \n"+"Int a = 9, int b = 10" + " nah lalu dibandingkan \n" );
        System.out.println("(== : adalah sama dengan\n"+"!= : adalah tidak sama dengan)\n");
        int a = 9, b = 10; // Set nilai a dan b
        if (a == b) { // Ini ada kesalahan, seharusnya gak ada titik koma di sini
            System.out.println("Nilai A dan B sama"); // Kalau a sama b
        }
        if (a != b) { // Kalau a gak sama b
            System.out.println("Nilai A dan B tidak sama"); // Tampil pesan kalau a dan b beda
        }
    }
}
