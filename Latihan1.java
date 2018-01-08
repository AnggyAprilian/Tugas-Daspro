

import java.util.Scanner;

public class Latihan1
{
    public static void main(String[] args)
    {

        Scanner masukan = new Scanner(System.in);

        System.out.println("MENU PERHITUNGAN : ");
        System.out.println("___________________________________________________________________");
        System.out.println("No Nama             				");
        System.out.println("1. Luas Persegi Panjang       		");
        System.out.println("2. Kecepatan    					");
		System.out.println("___________________________________________________________________");
		System.out.println("MASUKKAN DATA");
		
		
			
	
		
        String menu;

        for (String i = "Y"; i.equals("Y")||i.equals("y"); )
        {
        System.out.println("___________________________________________________________________");

        System.out.print("Masukkan Nomor Menu : ");
        int inNomor = masukan.nextInt();
        System.out.println("___________________________________________________________________");
		double hasil= 0;
		double kecepatan= 0;
		double luas= 0;

	
		

			
		
		

		
		

        
            if (inNomor == 1)
            {
                menu = " Luas Persegi Panjang";
				
                System.out.println("Pilihan anda nomor " +inNomor + menu);
				System.out.print("Masukan p= ");
				double p = masukan.nextInt();
				System.out.print("Masukan l= ");
				double l = masukan.nextInt();
				luas = luas+p*l;
                hasil= hasil+luas;
				System.out.println("Luas Persegi Panjang =" +hasil);
            }
                else if (inNomor == 2)
                {
                    menu = " Kecepatan";
					
                    System.out.println("Pilihan anda nomor " +inNomor + menu);
					System.out.print("Masukan s= ");
					double s = masukan.nextInt();
					System.out.print("Masukan t= ");
					double t = masukan.nextInt();
					kecepatan= kecepatan+s/t;
                    hasil= hasil+kecepatan;
					System.out.println("Kecepatan =" +hasil);
                }
                     else
                    {
                        System.out.println("Nomor yang dipilih tidak ada di menu.");
                    }

            System.out.println("Apakah anda mau melanjutkan? Y/T");
            i = masukan.next();

        }
        System.out.println("___________________________________________________________________");
        
        System.out.println("Selesai.");
    }
}