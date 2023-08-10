import java.util.Scanner;

public class PassingGradeSMK79 {
    public static void main (String[] args) {
        int matematika, BhsInggris, bhsIndo, ipa; //variable menyimpan Nilai Ujian.
        int PassingGradeSMK, PassingGradeSastra, PassingGradeTIK; //Variable untuk menyimpan nilai syarat kelulusan.
        boolean isPassingSMK, isPassingSastra, isPassingTIK; // variable bertipe boolean untuk menyimpan hasil kelulusan

        double averageUjian, averageBahasa;

        Scanner input = new Scanner(System.in);

        //inisialisasi dulu nilai variable untuk syarat kelulusan
        PassingGradeSMK = 75;
        PassingGradeSastra = 80;
        PassingGradeTIK = 70;

        System.out.println("masukan nilai ujian MTK :");
        matematika = input.nextInt();

        System.out.println("masukan nilai ujian B.Indo :");
        bhsIndo = input.nextInt();

        System.out.println("masukan nilai ujian B.Inggris :");
        BhsInggris = input.nextInt();

        System.out.println("masukan nilai ujian IPA :");
        ipa = input.nextInt();

        //menghitung rata-rata nilai ujian
        averageUjian = (matematika + bhsIndo + BhsInggris + ipa)/4;

        //menghitung rata-rata nilai Bahasa
        averageBahasa = (bhsIndo + BhsInggris)/2;

        // membuat boolean expression untuk menentukan kelulusan

        // menentukan kelulusan SMK
        isPassingSMK = averageUjian >= PassingGradeSMK;

        // Menentukan kelulusan masuk Jurusab Sastra
        isPassingSastra = averageBahasa >= PassingGradeSastra;
        
        //  Menentukan kelulusan Jurusan Teknik Komputer Jaringan
        isPassingTIK = matematika > PassingGradeTIK;

        System.out.println("\n\nHasil dari Simulasi untuk Persyaratan Penerimaan Calon Siswa di SMK Padepokan 79 adalah sebagai berikut :");
        System.out.println("===============================================================================");
        System.out.println("Apakah anda memenuhi Syarat untuk Masuk ke SMK Padepokan 79 :" + isPassingSMK);
        System.out.println("Apakah Anda Lulus ke Jurusan sastra : " + isPassingSastra);
        System.out.println("Apakah Anda lulus Jurusan Teknik Komputer Jaringan : " + isPassingTIK);
    }
}
