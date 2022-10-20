import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Vehicle extends Transport{

    private int load;

    public Vehicle(int year) {
        super(year);
        int load;
    }
    @Override
    public void start() {
        System.out.println("Набираю скорость");
    }

    public void typeOfVehicle(){
        HashMap<String,Integer> vehicleType = new HashMap<>();
        vehicleType.put("Легковой",2000);
        vehicleType.put("Автобус",3000);
        vehicleType.put("Грузовой",4000);
        System.out.println("Введите максимальную нагрузку автомобиля из списка" + vehicleType.values());
        Scanner console = new Scanner(System.in);
        int load = console.nextInt();

        for (String key: vehicleType.keySet())
            {
                Integer value = vehicleType.get(key);
                if (load == value){
                System.out.println("Тип наземного транспорта - " + key);}
            }
    }
    public void colorOfVehicle(){
        HashSet<String> color = new HashSet<String>();

        color.add("белый");
        color.add("синий");
        color.add("зеленый");
        color.add("красный");
        color.add("черный");
        color.add("голубой");

        System.out.println("Введите цвет автомобиля");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();

        if (color.contains(str.toLowerCase()))
        {
            System.out.println("Выбран цвет автомобиля - "+ str.toLowerCase());
        }
        else
        {
            color.add(str.toLowerCase());
            System.out.println("Новый цвет " +str.toLowerCase()+" добавлен и выбран");
        }
    }
}
