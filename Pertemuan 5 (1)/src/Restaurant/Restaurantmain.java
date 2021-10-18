package Restaurant;

public class Restaurantmain {
     public static void main(String[] args) {
        Restaurant menu = new Restaurant();
        menu.tambahMenuMakanan ("Bala-Bala", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Gehu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Tahu", 1_000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Tahu", 1_000, 0);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Molen", 1_000, 20);

        menu.tampilMenuMakanan();
        menu.Pemesanan((byte)5,"Gehu");
        menu.tampilMenuMakanan();
    
    }
}
