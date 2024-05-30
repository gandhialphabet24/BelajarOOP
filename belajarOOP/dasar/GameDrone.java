package dasar;
class GameDrone {
    public static void main(String[] args) {
        Drone honda = new Drone ();

        honda.energi = 500;
        honda.kecepatan = 300;
        honda.merek = "honda";
        honda.ketinggian = 1500;

        honda.terbang();
    }
}
