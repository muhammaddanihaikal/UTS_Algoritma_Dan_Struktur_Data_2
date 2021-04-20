import java.util.Scanner;
public class nomer1 {
    public static void main (String[]args){
        System.out.println("=======Binary Searching======="+"\n");
        
        int A[]= {3,10,4,2,8,13};
        Scanner scan = new Scanner(System.in);
        System.out.print("masukan data yang di cari : ");
        int cari =scan.nextInt();
        int N = cari;
        int batasbawah = N - 1;
        int batasatas = 0;
        boolean ketemu  = false;
        int tengah = 0; 
        
        System.out.print("isi data adalah : ");
        for ( int i =0; i<A.length; i++){
            System.out.print(A[i]+ " ");    
        }
        System.out.println(" ");
        
        while ((batasatas < batasbawah)&&(!ketemu)){
        tengah = (batasatas + batasbawah) / 2;
            if (A[tengah]==cari){
                ketemu = true;
                
            }else{
                if (A[tengah] < cari ){
                    batasatas = tengah++;
                    
                }else{
                    batasatas = tengah--;
                }
            }
            if (ketemu){
                System.out.println("data "+cari+" telah di temukan pada indeks ke "+(tengah +" baris ke "+(tengah + 1)));
            }else{
                System.out.println("data "+ cari + " tidak di temukan ");
                
            }
             
        }
        System.out.println("======Insertion Sort======");
                int[] data = {3,10,4,2,8,13};
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
        for (int i=1; i<data.length; i++){
            int key = data[i];
            int j = i-1;
            while((j>=0)&&(data[j]>key)){
                data[j+1] = data[j];
                j--;
            }
            data[j+1] = key;
        }
        System.out.println("\n");
        for (int i=0; i<data.length; i++){
            System.out.print(data[i]+" ");
        }
         
    
    }
}