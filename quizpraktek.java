import java.util.Scanner;

public class quizpraktek{
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
		int total,bayar,harga = 0; 
		char merek,tipe;
		int M,K,L = 0;
		int kembalian,jumlah;
		String nama;
		boolean loop = true;
		
		bayar=0;	
		System.out.print("Masukkan Nama Anda : ");
		nama = input.nextLine();
		
		System.out.println("|---------|-----------|-------------|");
	    System.out.println("|  Merek  |   Tipe    |    Harga    |");
	    System.out.println("|---------|-----------|-------------|");
		System.out.println("|         | Meja  (M) | Rp.  95.000 |");
		System.out.println("|    G    | Kursi (K) | Rp. 125.000 |");
		System.out.println("|         | Lemari(L) | Rp. 450.000 |");
		System.out.println("|---------|-----------|-------------|");
		System.out.println("|         | Meja  (M) | Rp. 115.000 |");
		System.out.println("|    O    | Kursi (K) | Rp. 135.000 |");
		System.out.println("|         | Lemari(L) | Rp. 550.000 |");
		System.out.println("|---------|-----------|-------------|");
		
		System.out.print("Masukkan Merek : ");
		merek = input.next().charAt(0);
		while(loop){
		System.out.print("Masukkan tipe : ");
		
        tipe = input.next().charAt(0);
		

		 switch(tipe)
		 {
            case 'M'  :
               if (merek =='G')
               {harga = 95000;
               }
               else {harga = 115000;
               }
                loop = false;
                break;  
                   
           case 'K' :
               if (merek =='G')
               {harga = 125000;
               }
               else {harga = 135000;
               }
                loop = false;
                break;
                
           case 'L'  :
               if (merek =='G')
               {harga = 450000;
               }
               else {harga = 550000;
               }
                loop = false;
                break;
                        
           
               default :
                System.out.println("Pilihan tidak tersedia, mohon input ulang");
               
                
        }
        
	  
	}
		System.out.println("--------------------------------------");
       System.out.print("Masukkan Jumlah Yang Di Inginkan : ");
       jumlah = input.nextInt();
       total = jumlah*harga;
       System.out.println("Total Harga : Rp. "+total);
      
       System.out.println("--------------------------------------");
		while(bayar<total){
		System.out.print("Masukkan Jumlah Uang Pembayaran = Rp."); 
		bayar = input.nextInt();
			if (bayar > total){
				kembalian=bayar-total;
			}
			else if (bayar<total){
				System.out.println("Uang anda kurang, mohon ditambah");
			}
		}
	   
	   kembalian = bayar - total;
		
		System.out.println("-------------------------------------");
	   System.out.println("Nama        : "+nama );
	   System.out.println("Total Harga : Rp."+total);
	   System.out.println("Bayar       : Rp."+bayar);
	   System.out.println("Kembalian   : Rp."+kembalian);
	    
	   
	    	
		
				
	}
}