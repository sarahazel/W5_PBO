package Restaurant;

public class Restaurant {
    public String [] nama_makanan;
    public double [] harga_makanan;
    public int [] stok;
    public static byte id = 0;
    
    public Restaurant(){
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok){
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        this.stok[id] = stok;
    }

    public void tampilMenuMakanan(){
         for (int i = 0; i<=id; i++){
            if(!isOutOfStock(i)){
                System.out.println(nama_makanan[i] + "["+stok[i]+"]"+"\tRp. "+harga_makanan[i]);
            }
        }
    }
    
    public byte cekId(String nama_makanan){ //ngecek id dan menmberi id yang manggilnya byte=karena kita kana mengembalikkan bytenya
        for(byte i = 0; i<=9; i++){
            if(nama_makanan.compareTo(this.nama_makanan[i])==0)  //return i
               return i; 
        }
    return -1;
    }
    
    public void Pemesanan(byte jumlah_beli,String nama_makanan){
        
        byte idTemp = cekId(nama_makanan);
        if(stok[idTemp] >= jumlah_beli){
            stok[idTemp] -= jumlah_beli;
        }else{
            if(stok[idTemp]>0){
                System.out.println("maaf stok "+this.nama_makanan[idTemp]+"tidak sesuai");
            }else{
                System.out.println("maaf stok "+this.nama_makanan[idTemp]+"tidak tersedia");
            }
        }
    }
    
       

    public boolean isOutOfStock(int id){
        if(stok[id] == 0){
         return true;
        }else{
            return false;
        }
    }

    public static void nextId(){
        id++;
    }

    //void tambahMenuMakanan(String molen) {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
}