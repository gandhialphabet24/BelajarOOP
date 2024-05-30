package dasar;

public class Game {
    public static void main(String[] args){

        // membuat objek player
        player petani = new player();

        // mengisi atribut player
        petani.name = "Petani Kode";
        petani.speed = 78;
        petani.healthPoin = 100;
        petani.damage = 30;
        petani.armor = 20;
        // menjalankan method
        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over!");
        }

    }
}