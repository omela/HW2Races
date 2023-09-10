import java.util.NavigableMap;
import java.util.TreeMap;
//this class could be enabled if we need top 3 winners displayed per second, assumed it is not part of the task, so added it just out of curiosity
public class Test
{
    public static NavigableMap<Integer, RaceCar> carKm = new TreeMap<>();
    public static void forWinner(int i, RaceCar car)
    {
        int k;
            for ( k=0; k < 10; k++)
            {
                carKm.put(car.sum[i], car);
                if (carKm.size()==10)
                {
                   carKm = carKm.descendingMap();

                      System.out.println(" " + carKm + " ");
                        System.out.print("at second " + i + "  ");
                        System.out.println("  ");
                        System.out.println("at second " + i + "  ");
                        System.out.println("  ");
                        System.out.println("the first was car " + carKm.firstEntry().getValue().carName + " with passed distance " + carKm.firstEntry().getKey() + " km");
                    System.out.println("car's speed is  " + carKm.firstEntry().getValue().carProgress.get(i) + " km/h");
                    System.out.println("  ");
                    carKm.pollFirstEntry();
                        System.out.println("  ");
                        System.out.println("the second was car " + carKm.firstEntry().getValue().carName + " with passed distance " + carKm.firstEntry().getKey() + " km");
                        System.out.println("car's speed is  " + carKm.firstEntry().getValue().carProgress.get(i) + " km/h");
                        System.out.println("  ");
                        carKm.pollFirstEntry();
                        System.out.println("  ");
                        System.out.println("the third was car " + carKm.firstEntry().getValue().carName + " with passed distance " + carKm.firstEntry().getKey() + " km");
                        System.out.println("car's speed is  " + carKm.firstEntry().getValue().carProgress.get(i) + " km/h");
                        System.out.println("  ");
                       System.out.println("  ");
                    carKm = carKm.descendingMap();
                        carKm.clear();
                }
            }
    }
}



