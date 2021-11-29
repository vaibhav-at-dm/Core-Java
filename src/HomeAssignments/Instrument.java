package HomeAssignments;

public abstract class Instrument {
    abstract void play();

    public static void main(String[] args) {
        Instrument arr[] = new Instrument[10];
        arr[0] = new Flute();
        arr[1] = new Guitar();
        arr[2] = new Piano();
        arr[3] = new Guitar();
        arr[4] = new Flute();
        arr[5] = new Flute();
        arr[6] = new Piano();
        arr[7] = new Flute();
        arr[8] = new Guitar();
        arr[9] = new Piano();

//        arr[4].play();

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if (arr[i] instanceof Flute)
            {
//                arr[i].play();
                System.out.println("Object at index " + i + " is of type Flute");
            }
            else if (arr[i] instanceof Piano)
            {
//                arr[i].play();
                System.out.println("Object at index " + i + " is of type Piano");
            }
            else {
//                arr[i].play();
                System.out.println("Object at index " + i + " is of type Guitar");
            }

            arr[i].play();

            System.out.println();
        }

//        System.out.println(arr[2].getClass().getName());

    }
}
class Piano extends Instrument{
    public void play()
    {
        System.out.println("Piano is playing tan tan tan ");
    }
}
class Flute extends Instrument{
    public void play(){
        System.out.println("Flute is plying toot toot toot ");
    }
}
class Guitar extends Instrument{
    public void play(){
        System.out.println("Guitar is playing tin tin tin ");
    }
}
