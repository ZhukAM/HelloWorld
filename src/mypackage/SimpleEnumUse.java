package mypackage;

public class SimpleEnumUse {
    public static void main(String[] args) {
        Spiciness howHot = Spiciness.FLAMING;
        //ArrayList list = new ArrayList();
        System.out.println("Enum: " + howHot);
        for (Spiciness s : Spiciness.values())
            System.out.println(s + ", ordinal " + s.ordinal());
    }
    public enum Spiciness {
        NOT, MILD, MEDIUM, HOT, FLAMING
    }
}