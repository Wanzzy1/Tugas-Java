import java.util.Scanner;

public class JobVacantions {
    public static void main (String[] args) {

        //Deklarasi variable yang diperlukan.
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin;

        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingKoor, isPassingAdmin;
        Scanner input = new Scanner(System.in);

        // Buat output Text yang dibutuhkan
        System.out.println("Selamat datang di PT. Semut 79 ");
        
        System.out.println("================================\n ");
        System.out.println("Silahkan input Data Anda");
        System.out.println("nama : ");
        nama = input.next();

        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan : ");
        penampilan = input.nextDouble();


        // Pengecekan data untuk Persyaratan
        /*
         1, Persyaratan Coordinator:

         pria
         umur minimal 21 thn dan maksimal 30 thn
         Lulusan D3
         Memiliki pengalaman minimal 2 tahun

         atau

         Pria
         Umur 30 tahun keatas
         Lulusan S1
         Pengalaman lebih dari 5 tahun
        */

        //  Persyaratan Koordinator 1
        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >=21 && umur <=30
         && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3") ) && pengalaman >= 2;

        // Persyaratan Koordinator 2
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

        // Hasil dari Koordinator
        isPassingKoor = reqKoor1 || reqKoor2;


        // Pengecekan data untuk Persyaratan
        /*
         1, Persyaratan Coordinator:

         Wanita
         umur minimal 20 thn dan maksimal 25 thn
         Lulusan D3
         Memiliki penampilan yang menarik / pengalaman minimal 1 tahun.

         atau

         Wanita
         Umur diatas 25 tahun.
         Lulusan S1
         Memiliki Penampilan yang Menarik 
         Memiliki Pengalaman minimal 3 tahun.

        */

        // Persyaratan Admin 1
        reqAdmin1 = jenisKelamin.equalsIgnoreCase("wanita") && umur >= 20 && umur <= 25 &&
        lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);

        // Persyaratan Admin 2
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 &&
        lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;

        // Hasil dari Admin
        isPassingAdmin = reqAdmin1||reqAdmin2 ;

        // membuat output text hasil
        System.out.println();
        System.out.println(nama + ", Terima kasih sudah mengikuti Lowongan kerja di PT. Semut 79.\n");
        System.out.println("Hasil Kelulusan untuk Koordinator :" + isPassingKoor);
        System.out.println("Hasil Kelulusan untuk Admin : " + isPassingAdmin);

        }   
}
