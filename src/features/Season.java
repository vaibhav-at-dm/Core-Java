package features;

public enum Season {

    FALL(12),SUMMER(14),RAINY, WINTER;       // these 4 enum objects will be created internally.  Must be First Line.
    int number;
    Season(){                       // private by default
        System.out.println("Default Constructor Called");
    }
    Season(int n){
        this.number = n;
        System.out.println("Parametrized Constructor Called");
    }
    void display(){
        System.out.println("Display method of Season Enum Class " + this.number);
    }
}
