/*  
*	Nama	: < Yohana resty agatha >
*	NIM		: 202013044
*	Prodi	: TIF 1B
*/

import java.util.*;
public class tugasuas{
	public static void main (String[]args){//METHOD UTAMA

		System.out.println();
		System.out.println("******************************************");
		System.out.println("*                                        *");
		System.out.println("*    Halo selamat datang di aplikasi     *");
		System.out.println("*     sederhana perhitungan bangun       *");
		System.out.println("*        datar dan bangun ruang          *");
		System.out.println("*                                        *");
		System.out.println("******************************************");
		System.out.println();  
		login();

	}

		static void login(){
		String data[]={"yohana","marpaung"};
		String username,password;
		Scanner masuk=new Scanner(System.in);
		System.out.print("\nMasukkan Username Anda \t: ");
		username=masuk.nextLine();
		System.out.print("Masukkan Password Anda \t: ");
		password=masuk.nextLine();
		

		if(username.equals(data[0])&&password.equals(data[1])){
			
			System.out.println();
			System.out.println("=============================================");
			System.out.println("=            Selamat Datang Di              =");
			System.out.println("=         Program Menghitung Bangun         =");
			System.out.println("=           datar dan bangun ruang          =");
			System.out.println("=============================================");
			System.out.println();
			menu();
		}else{
			System.out.println();
			System.out.println("Maaf Username atau Password yang Anda Masukkan Salah");
			System.out.println("Silahkan Masukkan Username dan Password Anda Kembali");
		 	//System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
			System.out.println();
			login();
		}
		
		
	}
 

	static void menu(){
		
		String menu_utama[]={"PROGRAM VOLUME","PROGRAM LUAS","Keluar"};
		System.out.println("1. "+menu_utama[0]);
		System.out.println("2. "+menu_utama[1]);
	    System.out.println("3. "+menu_utama[2]);
		//System.out.println("4. "+menu_utama[3]); 
		Scanner pilih=new Scanner(System.in);
		int menu;
		//percabangan untuk menampilkan menu
		System.out.println();
		System.out.print("Silahkan Pilih Menu : ");
		menu=pilih.nextInt();

		if(menu==1){
			volume();
		}else if(menu==2){
			luas();
		}else{
		     	System.out.println();
			System.out.println("KAMU KELUAR DARI SISTEM TERIMA KASIH SUDAH MENGGUNAKAN APLIKASI INI ");
			System.exit(0);
		}
	}


	static void volume(){

		int daftar_bangun;
		String bangun_ruang[]={"Volume Kubus","Volume Balok","Volume Kerucut","Volume Prisma Segiempat","Semua Bangun Ruang","Keluar"};
		
		System.out.println();
		System.out.println();
		System.out.println("1. "+bangun_ruang[0]);
		System.out.println("2. "+bangun_ruang[1]);
		System.out.println("3. "+bangun_ruang[2]);
		System.out.println("4. "+bangun_ruang[3]);
		System.out.println("5. "+bangun_ruang[4]);
		System.out.println("6. "+bangun_ruang[5]);
		
		Scanner pilih2=new Scanner(System.in);
		int menu2;

		System.out.println();
		System.out.print("Silahkan Pilih Bangun Ruang Yang Akan Dilakukan Perhitungan : ");
		menu2=pilih2.nextInt();

		switch(menu2){

			case 1 :

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Kubus       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Sisi = ");

					double sisi,volume_kubus;

					Scanner terimasisi=new Scanner(System.in);
					sisi=terimasisi.nextDouble();

					volume_kubus=sisi*sisi*sisi;

					System.out.println();
					System.out.println("\tVolume Kubus Adalah "+volume_kubus);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 2:

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Balok       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Panjang = ");

					double panjang_balok,lebar_balok,tinggi_balok,volume_balok;

					Scanner terimapanjang=new Scanner(System.in);
					panjang_balok=terimapanjang.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Lebar = ");
					Scanner terimalebar=new Scanner(System.in);
					lebar_balok=terimalebar.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggi=new Scanner(System.in);
					tinggi_balok=terimatinggi.nextDouble();

					volume_balok=panjang_balok*lebar_balok*tinggi_balok;

					System.out.println();
					System.out.println();
					System.out.println("\tVolume Balok Adalah "+volume_balok);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 3 :

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=      Menghitung Volume Kerucut      =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_kerucut,tinggi_kerucut,volume_kerucut;

					Scanner terimaalaskerucut=new Scanner(System.in);
					luas_alas_kerucut=terimaalaskerucut.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggikerucut=new Scanner(System.in);
					tinggi_kerucut=terimatinggikerucut.nextDouble();

					volume_kerucut=luas_alas_kerucut*tinggi_kerucut/3;

					System.out.println();
					System.out.println("\tVolume Kerucut Adalah "+volume_kerucut);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 4 :

					System.out.println();
					System.out.println("===========================================");
					System.out.println("=                                         =");
					System.out.println("=    Menghitung Volume Prisma Segitiga    =");
					System.out.println("=                                         =");
					System.out.println("===========================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_prisma,tinggi_prisma,volume_prisma;

					Scanner terimaalasprisma=new Scanner(System.in);
					luas_alas_prisma=terimaalasprisma.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggiprisma=new Scanner(System.in);
					tinggi_prisma=terimatinggiprisma.nextDouble();

					volume_prisma=luas_alas_prisma*tinggi_prisma/2;

					System.out.println();
					System.out.println("\tVolume Prisma Segitiga Adalah "+volume_prisma);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					next();
					// System.out.println("Proses Menghitung Telah Selesai");
					break;

			case 5 :

				// Kubus

					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Kubus       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Sisi = ");

					double sisi1,volume_kubus1;

					Scanner terimasisi1=new Scanner(System.in);
					sisi1=terimasisi1.nextDouble();

					volume_kubus1=sisi1*sisi1*sisi1;

					System.out.println();
					System.out.println("\tVolume Kubus Adalah "+volume_kubus1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Kubus Telah Selesai");

				// Balok 

					System.out.println();
					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=       Menghitung Volume Balok       =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Panjang = ");

					double panjang_balok1,lebar_balok1,tinggi_balok1,volume_balok1;

					Scanner terimapanjang1=new Scanner(System.in);
					panjang_balok1=terimapanjang1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Lebar = ");
					Scanner terimalebar1=new Scanner(System.in);
					lebar_balok1=terimalebar1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggi1=new Scanner(System.in);
					tinggi_balok1=terimatinggi1.nextDouble();

					volume_balok1=panjang_balok1*lebar_balok1*tinggi_balok1;

					System.out.println();
					System.out.println();
					System.out.println("\tVolume Balok Adalah "+volume_balok1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Balok Telah Selesai");

				// Kerucut

					System.out.println();
					System.out.println();
					System.out.println("=======================================");
					System.out.println("=                                     =");
					System.out.println("=      Menghitung Volume Kerucut      =");
					System.out.println("=                                     =");
					System.out.println("=======================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_kerucut1,tinggi_kerucut1,volume_kerucut1;

					Scanner terimaalaskerucut1=new Scanner(System.in);
					luas_alas_kerucut1=terimaalaskerucut1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggikerucut1=new Scanner(System.in);
					tinggi_kerucut1=terimatinggikerucut1.nextDouble();

					volume_kerucut1=luas_alas_kerucut1*tinggi_kerucut1/3;

					System.out.println();
					System.out.println("\tVolume Kerucut Adalah "+volume_kerucut1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Kerucut Telah Selesai");

				// Prisma SegiEMPAT

					System.out.println();
					System.out.println();
					System.out.println("===========================================");
					System.out.println("=                                         =");
					System.out.println("=    Menghitung Volume Prisma Segiempat    =");
					System.out.println("=                                         =");
					System.out.println("===========================================");
					System.out.println();
					System.out.print("\tMasukkan Luas Alas = ");

					double luas_alas_prisma1,tinggi_prisma1,volume_prisma1;

					Scanner terimaalasprisma1=new Scanner(System.in);
					luas_alas_prisma1=terimaalasprisma1.nextDouble();

					System.out.println();
					System.out.print("\tMasukkan Tinggi = ");
					Scanner terimatinggiprisma1=new Scanner(System.in);
					tinggi_prisma1=terimatinggiprisma1.nextDouble();

					volume_prisma1=luas_alas_prisma1*tinggi_prisma1/2;

					System.out.println();
					System.out.println("\tVolume Prisma Segiempat Adalah "+volume_prisma1);
					System.out.println("\t~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
					System.out.println();
					System.out.println("\tProses Menghitung Prisma Segiempat Telah Selesai");
					System.out.println();

					double volume[]={volume_kubus1,volume_balok1,volume_kerucut1,volume_prisma1};//array
					double penampung=0;

	
					for(int h=0; h<(volume.length); h++){
						
						for(int i=0; i<(volume.length-1); i++){
						if(volume[i]>volume[i+1]){
						penampung=volume[i];
						volume[i]=volume[i+1];
						volume[i+1]=penampung;
					}
				 }
						System.out.print(h+1+" = ");
						for(int d=0; d<volume.length; d++){
						System.out.print(volume[d]+"  ");
					}
						System.out.println();
				}

					System.out.println();
					System.out.print("Data pada array hasil[] setelah di urutkan = {");
					for(int i=0; i<volume.length; i++){
					System.out.print(volume[i]+" , ");
					}
					System.out.print("}");
					System.out.println();
					next();
 
					break;

			case 6 :
					System.out.println();                                           
					System.out.println("********************************************");
					System.out.println("~                                          ~");
					System.out.println("~       Terima Kasih Telah Menggunakan     ~");
					System.out.println("~           Aplikasi sederhana ini         ~");
					System.out.println("~                                          ~");
					System.out.println("********************************************");
					System.out.println();
					System.exit(0);


			default :

					System.out.println();
					System.out.print("Maaf Pilihan No."+menu2+" Tidak Ada Di Sistem");
					System.out.println();
					System.out.println("Sistem Sekarang Akan Keluar");
					//System.out.println();
					System.exit(0);

		}
		}
//pilihan perhitungan luas
		static void luas(){
		int daftar_bangun;
		String bangun_datar[]={"luas persegi","luas persegi panjang","luas segitiga","luas seluruh bangun datar","Keluar"};
		System.out.println();
		System.out.println();
		System.out.println("1. "+bangun_datar[0]);
		System.out.println("2. "+bangun_datar[1]);
		System.out.println("3. "+bangun_datar[2]);
		System.out.println("4. "+bangun_datar[3]);
		System.out.println("5. "+bangun_datar[4]);
		//System.out.println("6. "+bangun_datar[5]);
		//System.out.println("7. "+bangun_datar[6]);

		Scanner pilih2=new Scanner(System.in);
		int menu3;

		System.out.println();
		System.out.print("Silahkan Pilih Bangun Ruang Yang Akan Dilakukan Perhitungan : ");
		menu3=pilih2.nextInt();

		switch(menu3){

			case 1:
	double luasp,sisi;
	Scanner terima=new Scanner(System.in);
	System.out.println("");
	System.out.println("####################################################################");
	System.out.println("                *Program menghitung luas persegi*                   ");
	System.out.println("####################################################################");
	System.out.println();
	System.out.print("Silahkan Masukkan sisi = ");
	sisi=terima.nextDouble();
	luasp=(sisi*sisi);
	System.out.println();
	System.out.println("luas persegi = "+luasp);
	System.out.println();
	next();
	break;

		case 2:
	double luaspp,panjang,lebar;
	Scanner kasih=new Scanner(System.in);
	System.out.println("");
	System.out.println("####################################################################");
	System.out.println("                *Program menghitung luas persegi panjang*           ");
	System.out.println("####################################################################");
	System.out.println();
	System.out.print("Silahkan Masukkan panjang = ");
	panjang=kasih      .nextDouble();
	System.out.print("Silahkan masukkan lebar = ");
	lebar=kasih.nextDouble();
	luaspp=(panjang*lebar);
	System.out.println();
	System.out.println("luas persegi panjang = "+luaspp);
	System.out.println();
	next();
	break;

	case 3:
	double luassgtg,alas,tinggi;
	Scanner minta=new Scanner(System.in);
	System.out.println("");
	System.out.println("####################################################################");
	System.out.println("                *Program menghitung luas segitiga*                   ");
	System.out.println("####################################################################");
	System.out.println();
	System.out.print("Silahkan Masukkan alas = ");
	alas=minta.nextDouble();
	System.out.print("Silahkan Masukkan Tinggi = ");
	tinggi=minta.nextDouble();
	luassgtg=(alas*tinggi)/2;
	System.out.println();
	System.out.println("luas segitiga = "+luassgtg);
	System.out.println();
	next();
	break;

	case 4:

	System.out.println();
	double luasp1,sisi1;
	Scanner terima1=new Scanner(System.in);
	System.out.println("");
	System.out.println("####################################################################");
	System.out.println("                *Program menghitung luas persegi*                   ");
	System.out.println("####################################################################");
	System.out.println();
	System.out.print("Silahkan Masukkan sisi 1= ");
	sisi1=terima1.nextDouble();
	luasp1=(sisi1*sisi1);
	System.out.println();
	System.out.println("luas persegi 1= "+luasp1);
	System.out.println();
	///
	double luaspp1,panjang1,lebar1;
	Scanner kasih1=new Scanner(System.in);
	System.out.println("");
	System.out.println("####################################################################");
	System.out.println("                *Program menghitung luas persegi panjang*           ");
	System.out.println("####################################################################");
	System.out.println();
	System.out.print("Silahkan Masukkan panjang 1= ");
	panjang1=kasih1.nextDouble();
	System.out.print("Silahkan masukkan lebar 1= ");
	lebar1=kasih1.nextDouble();
	luaspp1=(panjang1*lebar1);
	System.out.println();
	System.out.println("luas persegi panjang 1= "+luaspp1);
	System.out.println();
	///
	double luassgtg1,alas1,tinggi1;
	Scanner minta1=new Scanner(System.in);
	System.out.println("");
	System.out.println("####################################################################");
	System.out.println("                *Program menghitung luas segitiga*                   ");
	System.out.println("####################################################################");
	System.out.println();
	System.out.print("Silahkan Masukkan alas 1 = ");
	alas1=minta1.nextDouble();
	System.out.print("Silahkan Masukkan Tinggi 1 = ");
	tinggi1=minta1.nextDouble();
	luassgtg1=(alas1*tinggi1)/2;
	System.out.println();
	System.out.println("luas segitiga 1 = "+luassgtg1);
	System.out.println();

		double luas[]={luasp1,luaspp1,luassgtg1};
			double wadah=0;
			for(int h=0; h<(luas.length); h++){
						for(int i=0; i<(luas.length-1); i++){
						if(luas[i]>luas[i+1]){
						wadah=luas[i];
						luas[i]=luas[i+1];
						luas[i+1]=wadah;
					}
				 }
						System.out.print(h+1+" = ");
						for(int d=0; d<luas.length; d++){
						System.out.print(luas[d]+"  ");
					}
						System.out.println();
				}
				System.out.println();
					System.out.print("Data pada array hasil[] setelah di urutkan = {");
					for(int i=0; i<luas.length; i++){
					System.out.print(luas[i]+" , ");
					}
					System.out.print("}");
					System.out.println();
					next();

					break;

			case 5 :
			System.out.println();
			System.out.println("                         ");
			System.out.println("*************************");
			System.out.println("    TERIMA KASIH TELAH   ");
			System.out.println("   MEMAKAI APLIKASI KAMI ");
			System.out.println("    SISTEM AKAN DITUTUP  ");
			System.out.println("           BYEE          ");
			System.out.println("*************************");
			System.out.println("                         ");
			System.out.println();
			System.exit(0);
		default :

					System.out.println();
					System.out.print("Maaf Pilihan No."+menu3+" Tidak Ada Di Sistem");
					System.out.println();
					System.out.println("Sistem Akan Keluar");
					System.exit(0);

		}
		}

		static void next(){

		Scanner lagi=new Scanner(System.in);
		int ulang;
		System.out.println();	
		System.out.print("Apakah Anda Akan Melakukan Perhitungan Lagi ? ( 1/0 ) = ");
		ulang=lagi.nextInt();
		if(ulang==1){
			luas();
		}else{
			penutup();
		}

	}
	static void penutup(){

			System.out.println();
			System.out.println("\tTerima Kasih Telah Menggunakan Aplikasi Sederhana Kami");
			System.out.println("           A  A            ");
			System.out.println("         A      A          ");
			System.out.println("        A  * v * A         ");
			System.out.println("        A        A         ");
			System.out.println("          A     A          ");			
			System.out.println("     >SEMANGAT PEJUANG>    ");
			System.out.println("                           ");
			System.out.println();
		
	}	
}
	
