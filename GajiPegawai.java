package gajipegawai;
import java.util.Scanner;
public class GajiPegawai {
    public String nama, alamat,departemen, pengalaman, skill;
    public int gaji;
    
    public GajiPegawai (String nama, String alamat, String departemen, String pengalaman, String skill) {
        this.nama = nama;
        this.alamat = alamat;
        this.departemen = departemen;
        this.pengalaman = pengalaman;
        this.skill = skill;
        this.gaji = gajiAwal();
    }
    
    public int gajiAwal() {
    int gajiAwal = 0;
    switch(departemen) {
        case "1":
            gajiAwal += 8000000;
            break;
        case "2":
            gajiAwal += 5000000;
            break;
        case "3":
            gajiAwal += 4000000;
            break;
    }
    
    switch(pengalaman) {
        case "1":
            gajiAwal += 500000;
            break;
        case "2":
            gajiAwal += 1000000;
            break;
        case "3":
            gajiAwal += 2000000;
    }
    
    switch(skill) {
        case "1":
            gajiAwal += 1000000;
            break;
        case "2":
            gajiAwal += 2000000;
            break;
        case "3":
            gajiAwal += 2500000;
    }
    return gajiAwal;
}
    
    public static void main(String[] args) {
        String nama, alamat, departemen, pengalaman, skill;
        int gaji;
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan Nama   = "); 
        nama = input.nextLine();
        System.out.print("Masukkan Alamat = ");
        alamat = input.nextLine();
        System.out.print("Departemen [1.IT 2.HRD 3.FINANCE] = ");
        departemen = input.nextLine();
        System.out.print("Pengalaman [1.Pemula 2.Menengah 3.Expert] = ");
        pengalaman = input.nextLine();
        System.out.print("Skill [1.Web 2.Mobile 3.Desktop] = ");
        skill = input.nextLine();
        
        GajiPegawai penghasilan = new GajiPegawai(nama, alamat, departemen, pengalaman, skill); 
        System.out.println("\nGaji Anda = Rp "+penghasilan.gajiAwal());
    }
}