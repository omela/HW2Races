import java.util.*;

public class RaceCar extends TimerTask {
    String carName;
    int i=0;

NavigableMap<Integer,Integer> carProgress = new TreeMap<>(); // store seconds as a key and speed as a value
Integer[] sum = new Integer[21]; // for calculating distance at some point of time (per sec)
    @Override
    public void run()
    {
        if (i < 20)
        {
            sum[0] = 0;
            int random = (int) (Math.random() * 400 + 30); // generate random speed double type number greater than or equal to 0.0 and less than 1.0 (30 -431)
            carProgress.put(i = i + 1, random); //write for each car a new speed each second
            sum[i] = sum[i - 1] + random; //calculating distance for each car passed each second
            System.out.print("<*");System.out.print("<*");  // my animation while counting down :)))
           // if(i<=19)//uncomment in case we need print top 3 and speed per second
           // {Test.forWinner(i, this);} //uncomment in case we need print top 3 and speed per second
           // System.out.println("carDistance at s"+i+" "+sum[i]+carName); // uncomment in case we need check the distance per sec
        } else DriveFast.speedtimer.cancel(); //cancelling timer that scheduled per sec after 20 sec

    }
}


