package gajipegawai;
import java.util.Scanner;
public class GajiPegawai {
    public static void main(String[] args) {
        String nama, alamat;
        int departemen, pengalaman, skill, gaji;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama = "); 
        nama = input.nextLine();
        System.out.print("Masukkan Alamat = ");
        alamat = input.nextLine();
        System.out.print("Departemen [1.IT 2.HRD 3.FINANCE] = ");
        departemen = input.nextInt();
        switch(departemen) {
            case 1:
                System.out.println("Rp 8.000.000");
                departemen = 8000000;
                break;
            case 2:
                System.out.println("Rp5.000.000");
                departemen = 5000000;
                break;
            case 3:
                System.out.println("Rp4.000.000");
                departemen = 4000000;
                break;
            default:
                System.out.println("Pilihan anda salah");
                break;
        } 
        
        System.out.print("Masukkan Pengalaman [1.Pemula; 2.Menengah; 3.Expert] = ");
        pengalaman = input.nextInt();
        switch(pengalaman) {
            case 1:
                System.out.println("Rp500.000");
                pengalaman = 500000;
                break;
            case 2:
                System.out.println("Rp1.000.000");
                pengalaman = 1000000;
                break;
            case 3 :
                System.out.println("Rp2.000.000");
                pengalaman = 2000000;
                break;
            default :
                System.out.println("Pilihan anda salah");
                break;
        }
        
        System.out.print("Masukkan Skill [1.Web; 2.Mobile; 3.Desktop] = ");
        skill = input.nextInt();
        switch(skill) {
            case 1:
                System.out.println("Rp1.000.000");
                skill = 1000000;
                break;
            case 2:
                System.out.println("Rp2.000.000");
                skill = 2000000;
                break;
            case 3 :
                System.out.println("Rp2.500.000");
                skill = 2500000;
                break;
            default:
                System.out.println("Pilihan anda salah");
                break;
        }
        gaji = departemen+pengalaman+skill;
        System.out.println("Gaji Anda = Rp "+gaji);
    }
}