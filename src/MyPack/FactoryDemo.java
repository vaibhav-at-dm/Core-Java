package MyPack;
//This is factory demo
// Private constructor is declared
// out of syllabus , just for concepts
public class FactoryDemo {
    private FactoryDemo(){

    }
    public static FactoryDemo getObject()
    {
        return new FactoryDemo();
    }
}
