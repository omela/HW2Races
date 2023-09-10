import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args)
    {
        final RaceCar red = new RaceCar(); red.carName="red";
        final RaceCar green = new RaceCar(); green.carName="green";
        final RaceCar yellow = new RaceCar(); yellow.carName="yellow";
        final RaceCar grey = new RaceCar(); grey.carName="grey";
        final RaceCar black = new RaceCar(); black.carName="black";
        final RaceCar white = new RaceCar(); white.carName="white";
        final RaceCar pink = new RaceCar(); pink.carName="pink";
        final RaceCar orange = new RaceCar(); orange.carName="orange";
        final RaceCar violet = new RaceCar(); violet.carName="violet";
        final RaceCar scarlett =new RaceCar(); scarlett.carName="scarlett";
        final  RaceCar[] participants = {red,green,yellow,grey,black,white,pink,orange,violet,scarlett};

        CountDownLatch l=new CountDownLatch(1);

        try
        {
            DriveFast.toRun(participants, l);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
     }
}

