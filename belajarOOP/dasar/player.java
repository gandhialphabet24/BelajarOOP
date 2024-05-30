package dasar;

public class player {
    
    // definisi atribut
    String name;
    int speed;
    int healthPoin;
    int damage;
    int armor;

    // definisi method run
    void run(){
        System.out.println(name +" is running...");
        System.out.println("Speed: "+ speed);
    }

    void attack(){
        System.out.println(name +" is attacking...");
        System.out.println("attack: "+damage);
    }

    void defense(){
        System.out.println(name +" is defensive...");
        System.out.println("defense: "+armor);
    }
    // definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    boolean isDead(){
        if(healthPoin <= 0) return true;
        return false;
    }
    
}