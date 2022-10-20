import java.util.ArrayList;
import java.util.Scanner;

public class Air extends Transport{

    private int altitude;
    private int maxSpeed = 90;


    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public Air(int year, int altitude) {
        super(year);
        this.altitude = altitude;
    }

    public void up()
    {
        System.out.println("Самолет набирает высоту " + altitude);
    }

    @Override
    public void start() {
        Scanner console = new Scanner(System.in);
        System.out.println("Введите скорость не более " + maxSpeed);
        int speed = console.nextInt();
        if (speed > maxSpeed) {
            System.out.println("Максимальная скорость - " + maxSpeed);
        } else {
            ArrayList<Integer> speedList = new ArrayList<>();
            for (int i = 0; i < speed/10; i++) {

                speedList.add(i*10+10);

                System.out.println("Набираю скорость " + speedList.get(i));
            }
        }
    }
}

