import java.util.*;
// this class define top 3 winner for each second and print their position and speed
public class Winner {

    public static void winner (int i, RaceCar[] r)
    {
        int n = 1;
        NavigableMap<Integer, RaceCar> carKm = new TreeMap<>();

        for (; n <= 10; n++)
            for (int k = 0; k < 10; k++)
            {
                carKm.put(r[k].sum[i], r[k]); // form map where speed is a key and RaceCar object is a value for each sec
            }
      // if (i==20){  // uncomment if we need spees and top 3 per second
        carKm = carKm.descendingMap(); // sort descending by speed
       // System.out.println(" " + carKm + " "); // uncomment to display distance each of 10 cars passed each sec
        System.out.print("at second " + i + "  ");
        System.out.println("  ");
        System.out.println("the first was car " + carKm.firstEntry().getValue().carName + " with passed distance " + carKm.firstEntry().getKey() + " km");
        System.out.println("car's speed is  " + carKm.firstEntry().getValue().carProgress.get(i) + " km/h");

        carKm.pollFirstEntry();

        System.out.println("the second was car " + carKm.firstEntry().getValue().carName + " with passed distance " + carKm.firstEntry().getKey() + " km");
        System.out.println("car's speed is  " + carKm.firstEntry().getValue().carProgress.get(i) + " km/h");

        carKm.pollFirstEntry();

        System.out.println("the third was car " + carKm.firstEntry().getValue().carName + " with passed distance " + carKm.firstEntry().getKey() + " km");
        System.out.println("car's speed is  " + carKm.firstEntry().getValue().carProgress.get(i) + " km/h");
        System.out.println("  ");
      //  } // uncomment if we need spees and top 3 per second
    }
}
